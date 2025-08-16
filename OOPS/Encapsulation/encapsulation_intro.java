package OOPS.Encapsulation;

public class encapsulation_intro {
    // String name; // This is called a instance variable

    public static void main(String[] args) {
        // String name; // This is called a local variable

        Student std = new Student();
        std.name = "Dhruv";
        std.roll_no = 11242186;
        System.out.println();
    }

}
// Encapsulation means we are restricting the direct access of methods or
// variables , by binding the data into single capsule;

// Now if we make the variables private in student class , then wee can't set or
// get them herer.
// So for acessing them we use methods ... and those methods are caleed getters
// and setters.