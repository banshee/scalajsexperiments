package tutorial.webapp

import scala.scalajs.js.JSApp
import scalaz._
import Scalaz._

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("Hello world 2x!")
    val xs : List[Option[Int]] = List(Some(1),Some(2))
    // println("original xs are ${xs}")
    val ys = xs.sequence
    // println("sequenced xs are ${ys}")
  }
}
