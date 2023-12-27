package Home_Work.Seminar_2;

import java.util.Arrays;

//Написать функцию, возвращающую разницу между самым большим и
// самым ма- леньким элементами переданного не пустого массива.
public class Second_task {
    public static void main(String[] args) {
        int [] array = {123,1,2,3,4,5,2};
        System.out.println(difference(array));
    }
    public static int difference(int[] array){
        Arrays.sort(array);
        return array[array.length-1] - array[0];
    }
}
