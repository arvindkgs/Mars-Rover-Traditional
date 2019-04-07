class Rover(var curr: Point, var dir: String, val plateau: Plateau){

    private fun moveLeft() {
        plateau.move(curr, curr.left())
    }
    private fun moveRight() {
        plateau.move(curr, curr.right())
    }
    private fun moveTop() {
        plateau.move(curr, curr.top())
    }
    private fun moveBottom() {
        plateau.move(curr, curr.down())
    }

    fun move(path: String) {
        var direction = getDirection(dir)
        for(c in path){
            when (c) {
                'L' -> {
                    direction = (direction + 1) % 4
                }
                'R' -> {
                    if (direction > 0)
                        direction = (direction - 1)
                    else
                        direction = 3
                }
                'M' -> {
                    try {
                        curr = plateau.move(curr, computeTargetPosition(direction,curr))
                    } catch (e: IllegalMoveException){
                        println("Moving to Illegal position: $curr")
                    }
                }
            }
        }
        dir = getDirectionString(direction)
    }

    /*
       Converts Direction to int
     */
    private fun getDirection(s: String): Int{
        when (s) {
            "E" -> return 0
            "N"-> return 1
            "W" -> return 2
            "S" -> return 3
            else -> return 0
        }
    }

    /*
       Converts Direction to int
     */
    private fun computeTargetPosition(dir: Int, src: Point): Point{
        return when (dir) {
            0 -> src.left()
            1 -> src.top()
            2 -> src.right()
            3 -> src.down()
            else -> src.right() //unexpected
        }
    }

    private fun getDirectionString(direction: Int) :String{
        return when (direction) {
            0 -> "E"
            1 -> "N"
            2 -> "W"
            3 -> "S"
            else -> ""
        }
    }
}