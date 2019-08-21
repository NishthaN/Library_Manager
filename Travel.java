import java.util.ArrayList;

public class Travel extends Inventory{
    ArrayList<Inventory> books = new ArrayList<Inventory>();

public Travel(){
    Inventory i1;

    i1 = new Inventory();
    i1.get_info(5, "A Walk in the Woods","Bill Bryson", 600,101112,1,4);
    books.add(i1);
 

    i1 = new Inventory();
    i1.get_info(5, "India","The Lonely Planet", 500, 6910, 2,5);
    books.add(i1);


    
    i1 = new Inventory();
    i1.get_info(5, "Blood River","Tim Butcher", 400, 79100,1,4);
    books.add(i1);

}
void display(){
 for(int i=0; i<books.size(); i++){
    System.out.println("Book title:" + books.get(i).book_title); 
    System.out.println("Book author:" +books.get(i).book_publisher);
    System.out.println("Book isbn:" + books.get(i).book_isbn); 
    System.out.println("Book price:" + books.get(i).book_price);
 }
 }

 public void suggest(){
     ArrayList<Inventory> suggestion_list = new ArrayList<Inventory>();

     for(int i=0; i< books.size(); i++) 
         suggestion_list.add(books.get(i)); // Add travel books
     Non_fiction ii = new Non_fiction();
     for(int j =0; j<ii.books.size(); j++) // Add non_fiction books
        suggestion_list.add(ii.books.get(j));
     Health hi = new Health();
     for(int k=0; k<hi.books.size(); k++) // Add health books
        suggestion_list.add(hi.books.get(k));
     
        int random = (int)(Math.random() * suggestion_list.size());
    System.out.println("Suggested book is " + suggestion_list.get(random).book_title + "by " + suggestion_list.get(random).book_publisher);
    System.out.println("Price is "+ suggestion_list.get(random).book_price + "ISBN is " + suggestion_list.get(random).book_isbn);
    
        
 }
}