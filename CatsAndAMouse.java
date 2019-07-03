package javaapplication1;

/**
 *
 * @author slava
 */
public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        String catA_isFirst = "Cat A";
        String catB_isFirst = "Cat B";

        String mouseC_left = "Mouse C ";

        int catA_andMouseDistanceDifference = 0;
        int catB_andMouseDistanceDifference = 0;

        if (x > z) {
            catA_andMouseDistanceDifference = x - z;
        } else {
            catA_andMouseDistanceDifference = z - x;
        }

        if (y > z) {
            catB_andMouseDistanceDifference = y - z;
        } else {
            catB_andMouseDistanceDifference = z - y;
        }

        if (catA_andMouseDistanceDifference < catB_andMouseDistanceDifference) {
            return catA_isFirst;
        } else if (catB_andMouseDistanceDifference < catA_andMouseDistanceDifference) {
            return catB_isFirst;
        } else if (catB_andMouseDistanceDifference == catA_andMouseDistanceDifference) {
            return mouseC_left;
        }
        return null;
    }

}

