FROM ubuntu:rolling AS openjdk
RUN apt update && apt install -y curl git openjdk-25-jdk-headless && rm -rf /var/lib/apt/lists/*

FROM openjdk AS build
WORKDIR /srv/website
COPY . .
RUN --mount=type=cache,target=/root/.gradle ./gradlew installDist --no-daemon

FROM openjdk AS app
EXPOSE 8080
WORKDIR /opt/website
COPY --from=build /srv/website/build/install/* .
ENTRYPOINT ["./bin/website"]
HEALTHCHECK --interval=5m --timeout=3s CMD curl -sf http://localhost:8080 || exit 1
