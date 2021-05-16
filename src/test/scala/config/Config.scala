package config

object Config {
  val app_url = "https://jsonplaceholder.typicode.com/"

  val users = Integer.getInteger("users", 100).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
}