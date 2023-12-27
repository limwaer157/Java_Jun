package Home_Work.Seminar_2;

//Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

public class First_Task {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,2};
        System.out.println(count(array));
    }

    public static int count(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) result = result +1;
        }
        return result;
    }
}

