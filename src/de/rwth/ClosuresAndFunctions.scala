package de.rwth

import scala.io.Source

class LongLines {
  def processFile(filename:String, width:Int) = {
    val source = Source.fromFile(filename)
    val res =
      for (line <- source.getLines)  
        yield processLine(filename, line, width)
    res.filter((x:String) => x.length>width)
  }
  
  def processLine(filename:String, line:String, width:Int) = {
    var result = ""
    if (line.length > width)
      result = filename + ":" + line
    
    result
  }
}

object ClosuresAndFunctions {
  val filename = "/Users/dimi/Documents/scala/Scala/ScalaBookExamples"
                 "/src/de/rwth/ClosuresAndFunctions.scala"
  val processor = new LongLines
  def closureExample() {
    val someNumbers = Array(1,2,3,4,5,6,7,-1,-2)
    var sum = 1
    someNumbers.foreach(sum += _)
    println(sum)
    sum = 2
    someNumbers.foreach(sum += _)
    println(sum)
  }

  def namedAttriuteExample() {

  }
  
}