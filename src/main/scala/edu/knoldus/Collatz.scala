package edu.knoldus

class Collatz {

  def findCollatzSequence(list1: List[Int], number: Int): List[Int] = {

    number match {
      case number if (number == 1) => list1
      case number if (number % 2 == 0) => findCollatzSequence(number :: list1, number / 2)
      case number if (number % 2 != 0) => findCollatzSequence(number :: list1, 3 * number + 1)

    }
  }

  def checkSequence(list1: List[Int], number: Int): List[Int] = {

    if (check(list1,number)) {
      val list3 = for (i <- 0 to list1.indexOf(number)) yield list1(i)
      list3.toList
    }
    else {
      val list3 = List()
      findCollatzSequence(list3, number)

    }
  }

  def check(list1: List[Int],number: Int):Boolean ={
    list1 match {
      case head :: tail if(head == number) => true
      case head :: tail if(head != number) => check(tail, number)
      case Nil => false
    }
  }

}









