//Sorumluluk zinciri
// Doktor muayene işlemi
public class ExaminationHandler extends HospitalHandler{

    @Override
    public void handleRequest(Patient patient) {
        System.out.println("Hastanın muayenesi: " + patient.getName());
        if(nextHandler!=null){
            nextHandler.handleRequest(patient);
        }
    }
}
