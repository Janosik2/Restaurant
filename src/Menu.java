public class Menu {
    int id;
    String name;
    int price;


    public Menu(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getmenu(){
        return "Id : "+this.id+" Name : "+this.name+" Price : "+this.price;
    }
}
