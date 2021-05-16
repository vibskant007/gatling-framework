package scenarios

import io.gatling.core.Predef.scenario
import requests.GetRequest

object GetScenario {

  val getScenario = scenario("Create User Scenario")
    .exec(GetRequest.get_user)

}
