object main {
  def main(args: Array[String]) {
    println("starting countdown")
    val x = 10
    def f = Sleep _ andThen  counter
    delay(10, x => f(x))

  }

  def delay(x: Int, compFunc: Int  => Unit): Int ={

    compFunc(x)

    if(x == 0)
      return 0

    delay(x - 1, compFunc)
  }

  def Sleep(x: Int): Int ={
    Thread sleep 1000
    x
   }

  def counter(count : Int): Unit ={
    print(f" $count ")
  }
}
