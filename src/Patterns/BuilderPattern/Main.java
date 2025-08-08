public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new MBAStudentBuilder());
        Student student1 = director1.createStudent();
        System.out.println(student1.toString());

    }
}
