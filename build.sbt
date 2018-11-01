scalaVersion := "2.12.7"

scalacOptions ++= List("-release", "8")

val init = {
  assert(System.getProperty("java.specification.version") == "11")
}