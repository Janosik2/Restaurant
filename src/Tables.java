public class Tables {
    int id = 0;
    int numberOfSeats;
    boolean book;


    public Tables(int id, int numberOfSeats){
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.book = false;
    }


    public void getTable(){
        System.out.println("Table ID: " + this.id + " Number of Seats: " + this.numberOfSeats);
    }
}
