public class TestHandler extends HospitalHandler{

    @Override
    public void handleRequest(Patient patient) {
        System.out.println("Hastaya test yapılması: "+ patient.getName());
        if(nextHandler!=null){
            nextHandler.handleRequest(patient);
        }
    }
}
