public class Main {
    public static void main(String[] args) {
        int idTables = 0;
        int idMenus = 0;
        int tablica = 10;
        ManagementTable managementTable = new ManagementTable(tablica);
        managementTable.addTable(idTables, 3);
        idTables++;
        managementTable.addTable(idTables, 2);
        idTables++;
        managementTable.addTable(idTables, 5);
        managementTable.printTables();
        ManagementMenu managementMenu = new ManagementMenu();
        managementMenu.addMenu(idMenus,"pizza",10);
        idMenus++;
        managementMenu.addMenu(idMenus,"kotlet",20);
        idMenus++;
        managementMenu.getMenu();
        managementMenu.deleteMenu(1);
        managementMenu.getMenu();
    }

}
