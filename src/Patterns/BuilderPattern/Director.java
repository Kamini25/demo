public class Director {
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else {
            return createMBAStudent();
        }
    }

    public Student createEngineeringStudent() {

        return studentBuilder.setName("John").setAge(20).setMajor().build();
    }
    public Student createMBAStudent() {
        return studentBuilder.setName("Jane").setAge(25).setStatus("Single").setMajor().build();
    }
}
