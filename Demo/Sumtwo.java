package Demo;


import Array.Streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Sumtwo {
    public static void main(String[] args) {

    int[] a={2,3,6,7};
    int[] b={6,2,7,4};

    int[] c =IntStream.concat(IntStream.of(a), IntStream.of(b)).distinct().toArray();

        System.out.println(Arrays.toString(c));

    }
}
