/**
 *
 * @author slava on 7/5/19
 */
class SimpleArraySum {


    fun simpleArraySum(ar: IntArray): Int {

        var res: Int = 0

        for(num  in ar) {
            res += num
        }

        return res
    }
}
