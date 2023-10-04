public class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    public void checkHonorRoll() {
        if (gpa >= 3.5) {
            System.out.println(name + " is on the honor roll!");
        } else {
            System.out.println(name + " is not on the honor roll.");
        }
    }
}