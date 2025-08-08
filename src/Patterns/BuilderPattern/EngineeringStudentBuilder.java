public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public EngineeringStudentBuilder setMajor() {
       this.major = "Engineering";
        return this;
    } 
}
