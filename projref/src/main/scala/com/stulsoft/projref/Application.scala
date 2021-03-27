/*
 * Copyright (c) 2021. StulSoft
 */

package com.stulsoft.projref

import com.stulsoft.common.DateInput

import scala.util.{Failure, Success}

/**
 * @author Yuriy Stul
 */
object Application extends App {
  println("==>main")

  DateInput.dateTimeToTimestamp("2021-03-27") match{
    case Success(timestamp) =>
      println(timestamp)
    case Failure(exception) =>
      exception.printStackTrace()
  }

  DateInput.dateTimeToTimestamp("2021-03-33") match{
    case Success(timestamp) =>
      println(timestamp)
    case Failure(exception) =>
      println(exception.getMessage)
  }
}
