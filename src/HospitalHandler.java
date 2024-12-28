//Sorumluluk Zinciri : İşlem Akışı
//Abstract handler
public abstract class HospitalHandler {
    protected HospitalHandler nextHandler;

    public void setNextHandler(HospitalHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    public abstract void handleRequest(Patient patient);
}
