import java.util.ArrayList;
import java.util.List;

public class ManagementMenu extends Menu {
    List<Menu> lista1 = new ArrayList<Menu>();
    public ManagementMenu() {
        super(0, "menus", 0);
    }
    public void addMenu(int id, String name, int price) {
        lista1.add(new Menu(id, name, price));
    }
    public void getMenu() {
        for (Menu menu : lista1) {
            System.out.println(menu.getmenu());
        }
    }
    public void deleteMenu(int id){
        lista1.remove(id);
    }
}
