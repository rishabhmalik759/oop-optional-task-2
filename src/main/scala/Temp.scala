import queueOperations.ObjectiveQueue

object Temp  extends ObjectiveQueue(Seq(1,2,3,4,5,6)) {
  queue;
  def printQueue(): Unit = queue.foreach((element:Int) => print(element+" "))
  def contains(number: Int): Boolean = queue.contains(number)

  def appended(number: Int): ObjectiveQueue = {
    val qNew = scala.collection.immutable.Queue(this.queue, 12)
    return this.queue.appended(12)
    queue.+:(12)
    this.queue.appended(12)
  }

  def main(args: Array[String]): Unit = {
    printQueue()
    if(contains(5)) println("true")
    val temp = appended(12)
    temp.printQueue()
//    println(queue.appended(12))
  }
}
