package Activity34;

public class checkoutClass {
    private String title;
    private int bookID;
    private String borrowersName;

    checkout(String title, String name, int ID){
        this.bookID = ID;
        this.borrowersName = name;
        this.title = title;
    }

    public void details(){
        System.out.println(title + " ID:" + bookID + "Was checked out by " + borrowersName);
    }
}
