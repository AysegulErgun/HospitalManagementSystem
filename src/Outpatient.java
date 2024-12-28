public class Outpatient extends Patient {
    public Outpatient(String name) {
        super(name);
    }
    @Override
    public void accept(PatientVisitor visitor) {
        visitor.visitOutpatient(this);
    }
}
