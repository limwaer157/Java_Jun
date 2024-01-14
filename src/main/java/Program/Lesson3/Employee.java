package Program.Lesson3;

import java.util.Arrays;

public class Employee {
    private String name;
    private String hireDate;

    public Employee(String name, String hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public int compareDates(String otherDate) {
        int[] date1 = Arrays.stream(hireDate.split("-"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] date2 = Arrays.stream(otherDate.split("-"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return Integer.compare(Arrays.hashCode(date1), Arrays.hashCode(date2));
    }
}
