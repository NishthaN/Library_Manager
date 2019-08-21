import java.util.ArrayList;

public class Health extends Inventory{

    ArrayList<Inventory> books = new ArrayList<Inventory>();


public Health(){

    Inventory i1;
    i1 = new Inventory();
    i1.get_info(3, "Food Rules","Michael Pollan", 310,8910,2,4);
    books.add(i1);

    i1 = new Inventory();
    i1.get_info(3, "When Breath Becomes Air","Paul Kalanithi", 420,91011,1,3);
    books.add(i1);

    
}
void display(){
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
         suggestion_list.add(books.get(i)); // Add health books
     Travel ii = new Travel();
     for(int j =0; j<ii.books.size(); j++) // Add travel books
        suggestion_list.add(ii.books.get(j));
    
        int random = (int)(Math.random() * suggestion_list.size());
    System.out.println("Suggested book is " + suggestion_list.get(random).book_title + "by " + suggestion_list.get(random).book_publisher);
    System.out.println("Price is "+ suggestion_list.get(random).book_price + "ISBN is " + suggestion_list.get(random).book_isbn);
        
 }

}