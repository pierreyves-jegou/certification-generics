package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindElementTest {


    class FindElement {

        public static int findIndexOfElement(List<Object> list, Object target) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(target)) {
                    return i;
                }
            }

            return -1;
        }

        public static Object getFirst(List<Object> elements){
            return elements.get(0);
        }


    }

    @Test
    void testIt_findIndexOfElement(){

        // TODO uncomment me

        //        // Given
//        List<Integer> integers = List.of(1,2,3);
//        List<String> strings = List.of("1","2","3");
//
//        Assertions.assertEquals(1, FindElement.findIndexOfElement(integers,2));
//        Assertions.assertEquals(1, FindElement.findIndexOfElement(strings,"2"));
    }


    @Test
    void testIt_getFirst(){
// TODO uncomment me

        //        // Given
//        List<Integer> integers = List.of(1,2,3);
//        List<String> strings = List.of("1","2","3");
//
//        Assertions.assertEquals(1, FindElement.getFirst(integers));
//        Assertions.assertEquals("1", FindElement.getFirst(strings));
    }

}
