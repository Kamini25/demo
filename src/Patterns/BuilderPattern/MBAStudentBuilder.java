
public class MBAStudentBuilder extends StudentBuilder{
    protected String specialization;
    public MBAStudentBuilder setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }
    @Override
    public MBAStudentBuilder setMajor() {
        this.major = "MBA";
        return this;
    }
 
}
