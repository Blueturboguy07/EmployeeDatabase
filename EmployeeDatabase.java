public class EmployeeDatabase {

    private Employee[] database;

    public EmployeeDatabase(){
        database = new Employee[11];
    }

    public EmployeeDatabase(Employee[] x){
        database = x;
    }

    public boolean add(int key){

        boolean doesNotContain = true;

        for(Employee x: database){

            if(x.ID == key){
                doesNotContain = false;
            }
        }

        while(true){

            int index = key %database.length;

            if(database[index].ID == -1){

                database[index].ID = 
            }


        }




    }
    
}
