package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UnboundedTest {

    class Unbounded {

        public static void printList(List<Object> elements) {
            elements.forEach(e -> System.out.println(e.toString()));
        }

        public static boolean containsRef(Object input, List<Object> elements) {
            for (Object element : elements) {
                if (element == input) {
                    return true;
                }
            }
            return false;
        }

    }


    @Test
    void testIt_printList() {
        Unbounded.printList(List.of("1", "2", "3"));
        Unbounded.printList(List.of(new Object(), new Object()));
        Unbounded.printList(List.of(1, 2, 2));
    }

    @Test
    void testIt_containsRef() {
        Integer integer1 = 1_587_878;
        Integer integer2 = 1_587_800;

        Assertions.assertTrue(Unbounded.containsRef(integer1, List.of(integer1, integer2)));

    }


}
