/**
 *
 * @author slava on 7/5/19
 */
class Staircase {
    fun buildStairs(stairs: Int) {
        val space: String = " "
        val sign: String = "#"

        var stair: String = ""
        var flag: Int = stairs

        for(i in 1..stairs) {
            flag = stairs - i

            while (flag != 0) {
                stair += space
                flag--
            }

            while (stair.length != stairs) {
                stair += sign
            }
            println(stair)
            stair = ""
        }
    }
}

