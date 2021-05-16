package requests

import config.Config.app_url
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object GetRequest {

  val get_user = http("RequestName").get(app_url + "/todos/1")
    .check(status is 200)
    .check(regex("userId").exists)

}
