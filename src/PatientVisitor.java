//Ziyaretçi arayüzü
public interface PatientVisitor {
    void visitInpatient(Inpatient inpatient); //yatan hasta
    void visitOutpatient(Outpatient outpatient); //ayakta hasta
}
