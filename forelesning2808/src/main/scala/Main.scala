
object Main extends App {

  def max(number1: Int, number2: Int): Int ={
    return number1
  }

  def greet() = println("Hello, world") // dropper curly brackets
  def multiply_5(n: Int): Int = n * 5

  def main(args: List[String]) = {
    println(max(10, 5))
    println(max(3, 5))
    var num1 = max(5, 1)
    var num2 = multiply_5(6)
    println(num1 + "test")
    println(num2)

    val containsHe = "Hello".contains("He")
    println(containsHe)

    val s = "Hi, class in computer science"
    val s1 = s.indexOf('c')
    // s.indexOf 'c' // skal kunne droppe parantes, når det kun er en parantes, men her feilet det
    val s5 = s.indexOf('i', 5)

    val list = List(1, 1, 1)
    list.map{x => x + 1} // gjetter at det blir (2,2,2)
    var number = (5).+(5) // = 10
    // (5). -- alle ting er et objekt, så derfor kan du bruke . etter de.
    // ved parantest rundt 5, lager du et nytt objekt
    val number2: Int = 5 // int objekt


  }

}
