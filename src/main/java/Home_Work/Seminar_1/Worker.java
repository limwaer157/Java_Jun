package Program.Lesson3;
public class Worker {
    private static final int CURRENT_YEAR = 2024;
    private String firstName;
    private String middleName;
    private String lastName;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age ;

    public Worker(String firstName, String middleName, String lastName, String jobTitle, String phone, int salary, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Worker() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return CURRENT_YEAR - age;
    }

    @Override
    public String toString() {
        return  String.format("Worker{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}');
    }




}
