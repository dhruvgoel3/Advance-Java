package OOPS.Encapsulation;

public class Student {
    String name;
    int roll_no;
    private int age = 18;

    public void setAge(int x) {
        if (x < 0) {
            x = 0;
        }
        age = x;

    }

    public int getAge() {
        return this.age;
    }

}
