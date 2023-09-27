package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterListElementsTest {


    class FilterListElements{

        public static <T> List<T> filterList(List<T> originalList, Predicate<T> predicate) {
            List <T> filteredList = new ArrayList<>();

            for (T element: originalList) {
                if (predicate.test(element)) {
                    filteredList.add(element);
                }
            }

            return filteredList;
        }


        public static <T extends Number> List<T> filterNumberList(List<T> originalList, Predicate<? super Number> predicate) {
            List <T> filteredList = new ArrayList<>();

            for (T element: originalList) {
                if (predicate.test(element)) {
                    filteredList.add(element);
                }
            }

            return filteredList;
        }



    }


    @Test
    void testIt(){

        //Given
        List<Integer> integers = List.of(1, 2, 3, 4);

        // L'objectif ici
        Assertions.assertEquals(List.of(1, 2, 3), FilterListElements.filterList(integers, i -> i <= 3));
    }


    @Test
    void testLowerBounded(){

        // Given
        List<Integer> integers = List.of(1, 2, 3, 4);
        List<Float> floats = List.of(1f, 2f, 3f, 4f);
        Predicate<Number> predicate = i -> i.doubleValue() <= 3d;


        // L'objectif ici est de pouvoir passer une liste qui étend Number et d'avoir un super prédicat
        Assertions.assertEquals(List.of(1, 2, 3), FilterListElements.filterNumberList(integers, predicate));
        Assertions.assertEquals(List.of(1f, 2f, 3f), FilterListElements.filterNumberList(floats, predicate));
    }

}
