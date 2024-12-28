//Ziyaretçi deseni
// Hasta Sınıfı ve türleri
public abstract class Patient {
    private final String name;

    //constructor
    public Patient(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public abstract void accept(PatientVisitor visitor);
}
