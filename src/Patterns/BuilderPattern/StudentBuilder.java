public abstract class StudentBuilder {
    protected String name;
    protected int age;
    protected String major;
    protected String status;
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    abstract public StudentBuilder setMajor();
    public StudentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }
    public Student build() {
        return new Student(this);
    }
}
