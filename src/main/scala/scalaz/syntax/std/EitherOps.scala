package scalaz
package syntax
package std

final class EitherOps[A, B](self: Either[A, B]) {

  final def disjunction: A \/ B = \/ fromEither self

  final def validation: Validation[A, B] = Validation fromEither self
}

trait ToEitherOps {
  implicit def ToEitherOpsFromEither[A, B](e: Either[A, B]): EitherOps[A, B] = new EitherOps(e)
}

