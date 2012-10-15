package de.rwth

class MultTables {
  /**
   * Creates a for row a given value and returns the result as a
   * collection.
   * The row contains factors 1 to 10.
   */
  def makeRowSeq(row:Int) = {
    for (col <- 1 to 10) yield {
      val product = (row * col).toString
      val padding = " " * (4 - product.length)
      product + padding
    }
    
  }
  
  /**
   * Calls makeRowSeq and converts the result to a string
   */
  def makeRow(row:Int) = makeRowSeq(row).mkString
  
  /**
   * Creates the entire table. The table contains combinations
   * for 1 to 10.
   */
  def multTable() = {
    val multTable = {
      for(row <- 1 to 10) 
        yield makeRow(row)
    }
    multTable.mkString("\n")
  }
}

/**
 * Accessor for the mult table.
 */
object MultTables {
  def main(args:Array[String]) = {
    val tableGenerator = new MultTables
    val resultTable = tableGenerator.multTable
    println(resultTable)
  }
  
}