public class EmployeeDatabase {

    private Employee[] database;

    public EmployeeDatabase() {
        database = new Employee[11];
    }

    public EmployeeDatabase(Employee[] x) {
        database = x;
    }

    public boolean add(Employee sample) {

        boolean doesNotContain = true;

        for (Employee x : database) {

            if (x.ID == sample.ID) {
                doesNotContain = false;
            }
        }

        while (true) {

            int index = sample.ID % database.length;

            if (database[index].ID == -1) {

                database[index].ID = sample.ID;
                break;
            } else {

                if (index != database.length - 1) {
                    index++;
                } else {
                    doesNotContain = false;
                    break;
                }

            }
        }
        return doesNotContain;

    }

    public boolean contains(Employee sample){

        boolean contains = false;

        for (Employee x : database) {

            if (x.ID == sample.ID) {
                contains = true;
            }
        }

        return contains;

    }
    
    public boolean remove(Employee sample){

        boolean removed = false;

        for (Employee x : database) {

            if (x.ID == sample.ID) {
                removed = true;
                x = new Employee("", -1);
            }
        }


        return removed;

    }

    public int size(){

        int count = 0;

        for(Employee x: database){

            if(x.ID!= -1){

                count++;
            }

        }

        return count;
    
    }



}
