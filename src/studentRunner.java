public class studentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Manny", 3.8);
        student1.displayInfo();
        student1.checkHonorRoll();

        Student student2 = new Student("Jilly", 3.2);
        student2.displayInfo();
        student2.checkHonorRoll();
    }
}