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
    class MyPair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<MyPair<K,V>> {
        private K left;
        private V right;

        public K getLeft() {
            return left;
        }

        public void setLeft(K left) {
            this.left = left;
        }

        public V getRight() {
            return right;
        }

        public void setRight(V right) {
            this.right = right;
        }

        public static <K extends Comparable<K>,V extends Comparable<V>> List<MyPair<K,V>> toList(MyPair<K,V> ... pairs){
            List<MyPair<K,V>> myPairs = new ArrayList<>();
            myPairs.addAll(Arrays.stream(pairs).toList());
            return myPairs;
        }


        @Override
        public int compareTo(MyPair<K, V> o) {
            int keyComparison = this.getLeft().compareTo(o.getLeft());
            if(keyComparison == 0){
                return this.getRight().compareTo(o.getRight());
            }
            return keyComparison;
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


    @Test
    void addAGenericMethod(){

        // L'objectif ici est d'implémenter l'interface "Comparable" sur notre classe "MyPair"
        // Point à faire sur le type de la classe qui se retrouve dans la méthode d'instance

        MyPair<String, String> pairOfStrings1 = new MyPair<>("k1", "val1");
        MyPair<String, String> pairOfStrings2 = new MyPair<>("k2", "val2");
        MyPair<Integer, Integer> pairOfIntegers = new MyPair<>(1, 1);

//        pairOfStrings1.compareTo(pairOfIntegers); -- Ce code ne devrait pas compiler
        Assertions.assertTrue(pairOfStrings1.compareTo(pairOfStrings2) < 0);
    }


    @Test
    void addAStaticGenericMethod(){

        // L'objectif ici est d'ajouter la méthode static "toList" permettant de créer une List en ajoutant un varArgs de type MyPair
        // Point à faire sur le type de la classe qui ne se retrouve pas dans la méthode d'instance

        MyPair<String, String> pair1OfStrings = new MyPair<>("key1", "value1");
        MyPair<String, String> pair2OfStrings = new MyPair<>("key1", "value1");
        List<MyPair<String, String>> myPairs = MyPair.toList(pair1OfStrings, pair2OfStrings);

        Assertions.assertEquals(2, myPairs.size());
    }


}
