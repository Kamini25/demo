public  class Student{
    protected String name;
    protected int age;
    protected String major;
    protected String status;

    public Student(StudentBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.major = builder.major;
        this.status = builder.status;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", major=" + major + ", status=" + status + "]";
    }
   
}