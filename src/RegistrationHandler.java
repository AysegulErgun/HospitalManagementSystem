//Sorumluluk Zinciri:
// Hasta Kayıt işlemleri
public class RegistrationHandler extends HospitalHandler{

    @Override
    public void handleRequest(Patient patient) {
        System.out.println("Registiration patient: " + patient.getName());
        if(nextHandler != null){
            nextHandler.handleRequest(patient);
        }
    }
}
