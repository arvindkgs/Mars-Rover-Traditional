import java.lang.Thread.sleep

class Plateau(val upperRight: Point) {
    fun move(frm: Point, to: Point): Point {
        if(isValid(frm, to))
            sleep(500);
        else
            throw IllegalMoveException();
        return to
    }

    private fun isValid(frm: Point, to: Point): Boolean {
        return ( (to == frm.top() || to == frm.down() || to == frm.left() || to == frm.right())
            && withinBoundry(to))
    }

    private fun withinBoundry(pt: Point): Boolean{
            return ( pt.y <= upperRight.y || pt.y >= 0 || upperRight.x >= pt.x || pt.x >= 0)
    }
}

