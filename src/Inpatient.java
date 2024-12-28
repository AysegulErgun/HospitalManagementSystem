public class Inpatient extends Patient{
    public Inpatient(String name){
        super(name);
    }
    @Override
    public void accept(PatientVisitor visitor) {
        visitor.visitInpatient(this);
    }
}
