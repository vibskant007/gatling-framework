package simulations

import io.gatling.core.Predef.{Simulation, atOnceUsers, openInjectionProfileFactory}
import scenarios.GetScenario
import config.Config.users

class GetSimulation extends Simulation{

  private val getUserExec = GetScenario.getScenario.inject(atOnceUsers(users))

  setUp(getUserExec)
}
