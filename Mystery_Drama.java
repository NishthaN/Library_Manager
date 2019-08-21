import java.util.ArrayList;

public class Mystery_Drama extends Inventory implements Suggest{

    ArrayList<Inventory> books = new ArrayList<Inventory>();

public Mystery_Drama(){
    Inventory i1 = new Inventory();
    i1.get_info(1, "The Lost Symbol","Dan Brown", 300,123,2,4);
    books.add(i1);

    Inventory i2 = new Inventory();
    i2.get_info(1,"Twelve Red Herrings","Jeffrey Archer",250,234,1,2);
    books.add(i2);

    Inventory i3 = new Inventory();
    i3.get_info(1,"Blindsighted","Karin Slaughter",300,456,2,4);
    books.add(i3);

    Inventory i4= new Inventory();
    i4.get_info(1, "Hunger Games", "Suzanne Collins", 250, 345,2,5);
    books.add(i4);

    }

 public void display(){
 for(int i=0; i<books.size(); i++){
    System.out.println("Book title:" + books.get(i).book_title); 
    System.out.println("Book author:" + books.get(i).book_publisher);
    System.out.println("Book isbn:" + books.get(i).book_isbn); 
    System.out.println("Book price:" + books.get(i).book_price);
 }
 }

 public void suggest(){
     ArrayList<Inventory> suggestion_list = new ArrayList<Inventory>();

     for(int i=0; i< books.size(); i++) 
         suggestion_list.add(books.get(i)); // Add mystery/drama books
     Poetry_Romance ii = new Poetry_Romance();
     for(int j =0; j<ii.books.size(); j++) // Add poetry/romance books
        suggestion_list.add(ii.books.get(j));

    int random = (int)(Math.random() * suggestion_list.size());
    System.out.println("Suggested book is " + suggestion_list.get(random).book_title + "by " + suggestion_list.get(random).book_publisher);
    System.out.println("Price is "+ suggestion_list.get(random).book_price + "ISBN is " + suggestion_list.get(random).book_isbn);
    

 }
}