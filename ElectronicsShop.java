package javaapplication1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author slava
 */
public class ElectronicsShop {

    //  int r1 = ElectronicsShop.getMoneySpent(new int[]{3,1}, new int[]{5, 2, 8}, 10);
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        SortedSet<Integer> priceCombinations = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                priceCombinations.add(keyboards[i] + drives[j]);
            }
        }

        for (Integer price : priceCombinations) {
            if (price <= b) {
                return price;
            }
        }
        return -1;
    }
}

