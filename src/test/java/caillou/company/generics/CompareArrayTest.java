package caillou.company.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareArrayTest {

    class CompareArray {

        public static boolean compareArrays(Object[] array1, Object[] array2){
            if (array1.length != array2.length) {
                return false;
            }

            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {
                    return false;
                }
            }
            return true;
        }
    }


    @Test
    void testIt(){

        // Given
        Integer[] integers1 = {1,2,3};
        Integer[] integers2 = {1,2,3};

        String[] strings1 = {"1", "2", "3"};
        String[] strings2 = {"1", "2", "3"};
        String[] strings3 = {"2", "3"};

        // L'objectif ici est d'améliorer la class "CompareArray" tout en validant les contraintes suivantes
        Assertions.assertEquals(true, CompareArray.compareArrays(integers1, integers2));
        Assertions.assertEquals(true, CompareArray.compareArrays(strings1, strings2));
        Assertions.assertEquals(false, CompareArray.compareArrays(strings2, strings3));
    }


}
