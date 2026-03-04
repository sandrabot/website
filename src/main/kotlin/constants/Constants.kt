/*
 * Copyright 2026 Avery Carroll and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package constants

import BuildInfo

object Constants {

    val DETAILED_VERSION = BuildInfo.VERSION + "_" + BuildInfo.COMMIT.take(8)

    const val SITE_URL = "https://sandrabot.com"
    const val DOCS_SITE_URL = "https://docs.sandrabot.com"
    const val GITHUB_SITE_URL = "https://github.com/sandrabot"

    const val DIRECT_SUPPORT = "https://discord.gg/BKgmqErg3x"
    const val DIRECT_INVITE = "https://discord.com/api/oauth2/authorize?client_id=302915036492333067&permissions=8&scope=bot%20applications.commands"
    const val DIRECT_BETA_INVITE = "https://discord.com/api/oauth2/authorize?client_id=319951770526941186&permissions=263168&scope=bot%20applications.commands"

}
