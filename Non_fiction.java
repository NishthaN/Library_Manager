import java.util.ArrayList;

public class Non_fiction extends Inventory{

    ArrayList<Inventory> books = new ArrayList<Inventory>();

    

public Non_fiction(){
    Inventory i1 = new Inventory();
    i1.get_info(2, "Bossypants","Tina Fey", 150,567,2,3);
    books.add(i1);

    Inventory i2 = new Inventory();
    i2.get_info(2, "Night","Elie Weisel", 250,678,3,5);
    books.add(i1);
    
    Inventory i3 = new Inventory();
    i3.get_info(2, "The Art of War","Sun Tzu", 500,789,2,5);
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
         suggestion_list.add(books.get(i)); // Add non_fiction books
     Health ii = new Health();
     for(int j =0; j<ii.books.size(); j++) // Add health books
        suggestion_list.add(ii.books.get(j));
    
        int random = (int)(Math.random() * suggestion_list.size());
    System.out.println("Suggested book is " + suggestion_list.get(random).book_title + "by " + suggestion_list.get(random).book_publisher);
    System.out.println("Price is "+ suggestion_list.get(random).book_price + "ISBN is " + suggestion_list.get(random).book_isbn);
        
 }
}