public class EmployeeDatabase {

    private Employee[] database;

    public EmployeeDatabase(){
        database = new Employee[10];
    }

    public EmployeeDatabase(Employee[] x){
        database = x;
    }
    
}
