package Array;

import java.util.Arrays;

public class DaysOfMonth {
    public static void main(String[] args) {
        int[] daysInMonth = new int[12];
        daysInMonth[0]=31;
        daysInMonth[1]=28;
        daysInMonth[2]=31;
        daysInMonth[3]=30;
        daysInMonth[4]=31;
        daysInMonth[5]=30;
        daysInMonth[6]=31;
        daysInMonth[7]=31;
        daysInMonth[8]=30;
        daysInMonth[9]=31;
        daysInMonth[10]=30;
        daysInMonth[11]=31;
        String[] monthsName={
                "jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nav","dec"
        };
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthsName[i]+" : "+daysInMonth[i]+" days");
        }

        Arrays.sort(daysInMonth);
        Arrays.sort(monthsName);

        int[] fil=new int[5];
        Arrays.fill(fil,7);
        System.out.println(Arrays.toString(fil));

        int[] copy = Arrays.copyOf(fil,fil.length);
        System.out.println(Arrays.toString(copy));

        boolean isEq=Arrays.equals(fil,copy);

        System.out.println(isEq);


        System.out.println(Arrays.toString(daysInMonth));
        System.out.println(Arrays.toString(monthsName));
    }
}
