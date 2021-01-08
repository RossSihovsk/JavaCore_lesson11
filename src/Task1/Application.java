package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

    static int setRandomValue(int min, int max){
        Random random =  new Random();
        return random.nextInt(max-min+1)+min;
    }

    public static void main(String[] args) {

        Integer array [] = new Integer[10];

        for (int i = 0; i<array.length; i++){
            array[i] = setRandomValue(1,100);
        }

       System.out.println("Невідсортований масив: "+ Arrays.toString(array) );
        System.out.println("");

        Arrays.sort(array);
        System.out.println("Відсортований в порядку зростання: " + Arrays.toString(array));
        System.out.println("");

        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("Відсортований в зворотньому порядку : " + Arrays.toString(array));
        System.out.println("");

    }

}
