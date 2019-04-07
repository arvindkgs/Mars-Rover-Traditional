class Point(val x: Int, val y: Int) {
    fun top(): Point{
        return Point(x, y+1)
    }
    fun left(): Point{
        return Point(x+1,  y)
    }
    fun right(): Point{
        return Point(x-1, y)
    }
    fun down(): Point{
        return Point(x, y-1)
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && other.x == x && other.y == y
    }

    override fun toString(): String {
        return "$x $y"
    }
}
