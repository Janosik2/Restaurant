public class ManagementTable extends Tables{
    Tables[] tables;
    public ManagementTable(int tablica) {
        super(0, 0);
        this.tables = new Tables[tablica];
    }

    public void addTable(int id, int numberOfSeats){
        Tables cos = new Tables (id, numberOfSeats);
        tables[id] = cos;
    }

    public void delateTable(int id){
        tables[id] = null;
    }

    public void printTables(){
        for (Tables table : tables) {
            if (table == null) {
                break;
            }
            table.getTable();
        }
    }
}
