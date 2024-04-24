public class Main {
    public static void main(String[] args) {
        int id = 0;
        int tablica = 10;
        ManagementTable managementTable = new ManagementTable(tablica);
        managementTable.addTable(id, 3);
        id++;
        managementTable.addTable(id, 2);
        id++;
        managementTable.addTable(id, 5);
        managementTable.printTables();

    }

}
