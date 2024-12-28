import java.util.HashMap;
import java.util.Map;
//Flyweight Factory: Bölüm nesnelerini yönetir.
public class DepartmentFactory {
    private static final Map<String, Department> departments = new HashMap<>();
    public static Department getDepartment(String name, String location){
        Department department = departments.get(name);
        if(department == null){
            department = new Department(name, location);
            departments.put(name, department);
            departments.put(location, department);
        }
        return department;
    }
}
