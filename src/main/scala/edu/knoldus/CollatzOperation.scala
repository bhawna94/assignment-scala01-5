package edu.knoldus

import org.apache.log4j.Logger

object Collatzoperation extends App{

  val log = Logger.getLogger(this.getClass)
  val sequence1 = new Collatz
  val sequence2 = new Collatz
  val number = 25
  val number1 = 10
  val list1 = List()
  val output1  = sequence1.checkSequence(list1, number)
  val output2 = sequence2.checkSequence(output1,number1)
  log.info(output1)
  log.info("\n")
  log.info(output2)

}
