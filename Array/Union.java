package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] un1 = {2,3,4,5,5,6};
        int[] un2 = {1,3,7,5,6};
        unionval(un1,un2);
    }

    public static void unionval(int[] un1, int[] un2) {
        Set<Integer> se = new HashSet<>();
        for (int i : un1) {
            se.add(i);
        }
        for (int j : un2) {
            se.add(j);
        }
        System.out.println(se.toString());
    }
}
