package Home_Work.Seminar_2;
//Написать функцию, возвращающую истину, если в переданном
// массиве есть два соседних элемента, с нулевым значением.
public class Thrid_task {

    public static void main(String[] args) {
        int [] array = {123,1,2,3,4,5,0};
        System.out.println(find(array));
    }
    public static boolean find(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0 && array[i+1] ==0) return true;
        }
        return false;
    }
}
