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
  val filename = "/Users/dimi/Documents/scala/Scala/ScalaBookExamples/src/de/rwth/ClosuresAndFunctions.scala"
  val processor = new LongLines
  def test1() {
    for (line <- processor.processFile(filename, 40))
    println (line.trim)
  }
  
}