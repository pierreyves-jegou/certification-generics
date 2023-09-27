package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindElementTest {


    class FindElement {

        public static <T> int findIndexOfElement(List<T> list, T target) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(target)) {
                    return i;
                }
            }

            return -1;
        }

        public static <T> T getFirst(List<? extends T> elements){
            return elements.get(0);
        }


    }

    @Test
    void testIt_findIndexOfElement(){
        // Given
        List<Integer> integers = List.of(1,2,3);
        List<String> strings = List.of("1","2","3");

        Assertions.assertEquals(1, FindElement.findIndexOfElement(integers,2));
        Assertions.assertEquals(1, FindElement.findIndexOfElement(strings,"2"));
    }


    @Test
    void testIt_getFirst(){
        // Given
        List<Integer> integers = List.of(1,2,3);
        List<String> strings = List.of("1","2","3");

        Assertions.assertEquals(1, FindElement.getFirst(integers));
        Assertions.assertEquals("1", FindElement.getFirst(strings));
    }

}
