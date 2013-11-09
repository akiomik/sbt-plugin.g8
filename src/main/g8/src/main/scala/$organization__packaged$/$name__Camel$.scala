package $organization$

import sbt._
import Keys._

class $name;format="Camel"$ extends Plugin {
  override lazy val settings = Seq(
    commands ++= Seq(
      sample
    )
  )

  lazy val sample = Command.command("sample-command") { state =>
    println("Hello SBT World!")
    state
  }
}

