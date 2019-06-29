package hacker;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        final String YES = "YES";
        final String NO = "NO";

        final int raceLength = 10000;

        int x1Position = x1;
        int x2Position = x2;

        for (int i = 1; i <= raceLength; i++) {
            x1Position += v1;
            x2Position += v2;
            if(x1Position == x2Position){
                return YES;
            }
        }
        return NO;
    }
}
