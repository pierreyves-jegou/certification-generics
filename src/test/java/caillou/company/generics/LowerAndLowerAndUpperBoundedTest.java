package caillou.company.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LowerAndLowerAndUpperBoundedTest {

    class LowerAndUpperBounded {

        public static void add(List<? extends Number> inputs, List<? super Number> output){
            output.addAll(inputs);
        }

    }

    @Test
    void testIt(){

        /**
         PECS (Producer Extends Consumer Supers) :
         - dans le cas où l'on lit (iterate) sur un élement qui contient des génériques (typiquement une Collection<T>,
         la collection agit comme un Producer qui va fournir des éléments : Produce => Extends => (? extends monType)
         - dans le cas où l'on écrit, reduce,  sur un élement qui contient des génériques (typiquement une Collection<T>,
         la collection est agit comme un Consumer qui va recevoir des éléments : Consumer => Super => (? super monType)
         */

        // Given
        List<Integer> inputsInteger = List.of(10, 11);
        List<Float> inputsFloat = List.of(11f, 12f);
        List<Number> output = new ArrayList<>();
        List<Object> output2 = new ArrayList<>();

        // L'objectif est de modifier la class "UpperBounded" pour pouvoir accepter n'importe quelle sous liste de "Number" en entrée
        // et de pouvoir ajouter les éléments à une liste de "Number" ou une liste de super classe de "Number"

        LowerAndUpperBounded.add(inputsInteger, output);
        LowerAndUpperBounded.add(inputsFloat, output);

        LowerAndUpperBounded.add(inputsInteger, output2);
        LowerAndUpperBounded.add(inputsFloat, output2);


    }


}
