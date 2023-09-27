package caillou.company.generics;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CreateGenericClass {

    @AllArgsConstructor
    class MyPair {
        private Object left;
        private Object right;

        public Object getLeft() {
            return left;
        }

        public void setLeft(Object left) {
            this.left = left;
        }

        public Object getRight() {
            return right;
        }

        public void setRight(Object right) {
            this.right = right;
        }
    }

    @Test
    void isFlexibleEnough(){

        // L'objectif ici est de modifier la classe "MyPair" en utilisant les générics pour plus de flexibilité

        MyPair<String, String> pairOfStrings = new MyPair<>("key", "value");
        MyPair<Integer, Integer> pairOfIntegers = new MyPair<>(1, 1);
        MyPair<String, Integer> pairOfStringAndInteger = new MyPair<>("key", 1);

        Assertions.assertEquals("key", pairOfStrings.getLeft());
        Assertions.assertEquals(1, pairOfIntegers.getLeft());
        Assertions.assertEquals("key", pairOfStringAndInteger.getLeft());
        Assertions.assertEquals(1, pairOfStringAndInteger.getRight());
    }


    // TODO : Uncomment le test suivant

//    @Test
//    void addAStaticGenericMethod(){
//
//        // L'objectif ici est d'ajouter la méthode static "toList" permettant de créer une List en ajoutant un varArgs de type MyPair
//        // Point à faire sur le type de la classe qui ne se retrouve pas dans la méthode d'instance
//
//        MyPair<String, String> pair1OfStrings = new MyPair<>("key1", "value1");
//        MyPair<String, String> pair2OfStrings = new MyPair<>("key1", "value1");
//        List<MyPair<String, String>> myPairs = MyPair.toList(pair1OfStrings, pair2OfStrings);
//
//        Assertions.assertEquals(2, myPairs.size());
//    }


    // TODO : Uncomment le test suivant

//    @Test
//    void addAGenericMethod(){
//
//        // L'objectif ici est d'implémenter l'interface "Comparable" sur notre classe "MyPair"
//        // Point à faire sur le type de la classe qui se retrouve dans la méthode d'instance
//
//        MyPair<String, String> pairOfStrings1 = new MyPair<>("k1", "val1");
//        MyPair<String, String> pairOfStrings2 = new MyPair<>("k2", "val2");
//        MyPair<Integer, Integer> pairOfIntegers = new MyPair<>(1, 1);
//
////        pairOfStrings1.compareTo(pairOfIntegers); -- Ce code ne devrait pas compiler
//        Assertions.assertTrue(pairOfStrings1.compareTo(pairOfStrings2) < 0);
//    }





}
