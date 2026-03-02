FROM ubuntu:latest AS openjdk
RUN apt update && apt install -y openjdk-25-jdk-headless

FROM openjdk AS build
COPY . /home/gradle/project
WORKDIR /home/gradle/project
RUN --mount=type=cache,target=/root/.gradle ./gradlew installDist --no-daemon

FROM build AS app
EXPOSE 8080
WORKDIR /opt/website
COPY --from=build /home/gradle/project/build/install/* .
ENTRYPOINT ["./bin/website"]
HEALTHCHECK --interval=5m --timeout=3s CMD curl -sf http://localhost:8080 || exit 1
