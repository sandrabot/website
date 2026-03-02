/*
 * Copyright 2026 Avery Carroll and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package plugins

import constants.Constants
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        // http://localhost:8080
        staticResources("/", "static") {
            enableAutoHeadResponse()
        }

        // http://localhost:8080/beta
        get("/beta") { call.respondRedirect(Constants.DIRECT_BETA) }

        // http://localhost:8080/docs
        get("/docs") { call.respondRedirect(Constants.DOCS_SITE_URL, permanent = true) }

        // http://localhost:8080/github
        get("/github") { call.respondRedirect(Constants.GITHUB_SITE_URL, permanent = true) }

        // http://localhost:8080/invite
        get("/invite") { call.respondRedirect(Constants.DIRECT_INVITE) }

        // http://localhost:8080/support
        get("/support") { call.respondRedirect(Constants.DIRECT_SUPPORT) }
    }
}
