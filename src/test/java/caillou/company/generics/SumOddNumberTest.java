package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SumOddNumberTest {

    class SumOddNumber {

        public static double calculateNumberSum(List<Object> numbers) {
            double oddSum = 0;
// TODO uncomment me
//            for (Number number : numbers) {
//                if (number.doubleValue() % 2 != 0) {
//                    oddSum += number.doubleValue();
//                }
//            }
            return oddSum;
        }

    }


    @Test
    void testIt(){
// TODO uncomment me
//        List<Integer> integers = List.of(1,2,3);
//        double oddSum = SumOddNumber.calculateNumberSum(integers);
//        Assertions.assertEquals(4.0, oddSum);
    }

}
