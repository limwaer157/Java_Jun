package Program.Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int b = 11;

        System.out.println(Arrays.toString(addArray(a, b)));


//        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            array[i][i]= 1;
//            array[i][array.length -i-1]=1;
//
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(array[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        Написать функцию добавления элемента в конец массива таким образом,
//        чтобы она расширяла массив при необходимости.
//         Функция должна возвращать ссылку на вновь
//         созданный внутри себя массив, а не использовать глобальный.


    }

    private static int[] addArray(int array[], int num) {
            int[] newArray = new int[array.length + 1];
//        if (num == 0) {
//            ;
//        }
        System.arraycopy(array,0,newArray,0,array.length);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = num;
        return newArray;
        }
}
