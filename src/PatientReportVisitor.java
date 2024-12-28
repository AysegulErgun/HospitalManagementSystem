//Ziyaretçi Deseni
//ConcreteVisitor: Raporlama
public class PatientReportVisitor implements PatientVisitor {

    @Override
    public void visitInpatient(Inpatient inpatient) {
        System.out.println("Yatan hasta için rapor oluşturuluyor: " + inpatient.getName());
    }

    @Override
    public void visitOutpatient(Outpatient outpatient) {
        System.out.println("Ayakta tedavi için rapor oluşturuluyor: " + outpatient.getName());
    }
}
