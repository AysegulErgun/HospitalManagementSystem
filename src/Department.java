//flyweight sınıfı: bölüm bilgileri
public class Department {
    private final String name;
    private final String location;

    //constructor
    public Department(String name, String location){
        this.name=name;
        this.location=location;
    }
    public void displayInfo(){
        System.out.println("Department: "+name+"location:"+location);
    }
}
