package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverserListTest {

    class ReverserList {

        public static List<Object> reverseList(List<Object> originalList) {
            List<Object> reversedList = new ArrayList<>();

            for (int i = originalList.size() - 1; i >= 0; i--) {
                reversedList.add(originalList.get(i));
            }

            return reversedList;
        }
    }

    @Test
    void testIt(){

        // Given
        List <Integer> numbers = List.of(1, 2, 3);
        List <String> colors = List.of("Red", "Green", "Orange");

        // L'objectif ici est de rendre la méthode "ReverserList.reverseList" générique

        Assertions.assertEquals(List.of(3, 2, 1), ReverserList.reverseList(numbers));
        Assertions.assertEquals(List.of("Orange", "Green", "Red"), ReverserList.reverseList(colors));

    }



}
