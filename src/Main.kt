
fun main() {
    println("=================================================================")
    println("                      Mars Rover                                 ")
    println("=================================================================")

    val p = Plateau(Point(5,5))
    //Rover 1
    val r1 = Rover(Point(1, 2),"N", p)
    r1.move("LMLMLMLMM")
    println("${r1.curr} ${r1.dir}")

    //Rover 2
    val r2 = Rover(Point(3, 3),"E", p)
    r2.move("MMRMMRMRRM")
    println("${r2.curr} ${r2.dir}")
}