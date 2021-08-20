class Node{
  val value = 4

  def apply(x: Int) = value * x
}

object main {
  def hof(fn: (Int=>Int), i: Int): Int = {
    return fn(i)
  }
  def anon_fn (x: Int): Int = x * 5 // anonymous function (er dette lambda?)
  def multiply_5(n: Int): Int = n * 5

  def max(number1: Int, number2: Int): Int ={
    return number1
  }

  def apply(x: Int) = 5

  def main(args: Array[String]): Unit= {
    println(multiply_5(6))
    println(max(10, 5))

    val containsHe = "Hello".contains("He")
    println(containsHe)

    val s = "Hi, class in computer science"
    val s1 = s.indexOf('c')
    // s.indexOf 'c' // skal kunne droppe parantes, når det kun er en parantes, men her feilet det
    val s5 = s.indexOf('i', 5)
    println("indeox of c and i(from index 5):" + s1 + " and " + s5)

    val list = List(1, 1, 1)
    list.map{x => x + 1} // gjetter at det blir (2,2,2)
    var number = (5).+(5) // = 10
    // (5). -- alle ting er et objekt, så derfor kan du bruke . etter de.
    // ved parantest rundt 5, lager du et nytt objekt
    val number2: Int = 5 // int objekt

    val newnode = new Node()
    println(newnode(5))  // bruk apply funksjon

    list.foreach(x => print(x + " "))
    println // ingen argument

    // stringarray
    val stringList = new Array[String](3)
    stringList(0) = "Helge"
    stringList(2) = "Supermann"
    stringList(1) = "UiA"
    /* kan ikke endre på listen, men kan endre på elementene. Dersom elementene også hadde vært
    val, ville det ikke gått å legge til tekst etter at listen hadde vært opprettet.
     */
    stringList.update(2, "Spiderman")


    stringList.foreach(x => println(x))

    // higher order functions
    //def applyToInt(f:(Int => Int))
    println("got number " + hof(x => x * 5, 2))

    val var_array = Array("Luke", "Han", "Leia")

    val liste2 = List("a", "b", "c", "aa") //finn alle a
    val got_an_a =
      liste2.filter(x => x.contains("a"))
      .map(x => x + " - ")  // legger til bindestrek på alle
      .foreach(x => { // foreach til slutt / ender operasjonene / for eks. skriv ut løsning
        if(x.contains("-")){
          println("Contains - ")
        }
      })

    println(got_an_a) // prints List(a, aa)

    val listy = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = listy.filter(x => x % 2 == 0)
      .reduce((a, b) => a + b * 2)  // eller sum i stedet for .reduce ..., dersom det er kun a+b
    println(result)

  }
}
