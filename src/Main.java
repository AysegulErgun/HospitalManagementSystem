//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Flyweight: Bölüm Nesnelerini Yönet
        System.out.println("--Department Infrmations--");
        Department cardiology = DepartmentFactory.getDepartment("cardiology ","A Blok");
        Department radiology = DepartmentFactory.getDepartment("radiology ","B Blok");
        cardiology.displayInfo();
        radiology.displayInfo();

        //Sorumluluk zinciri: İşlem Akışı
        HospitalHandler registration = new RegistrationHandler();
        HospitalHandler examination = new ExaminationHandler();
        HospitalHandler test = new TestHandler();

        registration.setNextHandler(examination);
        examination.setNextHandler(test);

        //Hasta işemleri
        Patient patient1 = new Inpatient("Hilal K.");
        Patient patient2 = new Inpatient("Zeynep T.");

        registration.handleRequest(patient1);
        registration.handleRequest(patient2);

        //Ziyaretçi : Raporlama
        PatientVisitor reportVisitor = new PatientReportVisitor();
        patient1.accept(reportVisitor);
        patient2.accept(reportVisitor);
    }
}