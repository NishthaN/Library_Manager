import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Cart extends Main{

    ArrayList<Inventory> books_in_cart = new ArrayList<Inventory>();
    ArrayList<Integer> num_of_the_book = new ArrayList<Integer>();

    void add_cart()throws IOException{

        int ch =0;
        Inventory i2;
        while(ch!=-999){
            int i = 0;
            System.out.println("Enter 1 to search book using ISBN, Enter 2 to view books:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            i=Integer.parseInt(br.readLine());

            if(i==1){
                Inventory in = search_with_isbn();
                in.suggest();
            }

            if(i==2){
        
            System.out.println("Choose books category: 1. Mystery & Drama 2. Non Fiction 3. Health 4. Poetry & Romance 5. Travel");
        
            int n = Integer.parseInt(br.readLine());

            if (n==1){
            i2 = new Mystery_Drama();
            i2.display();
            System.out.println("Choose index of book you want to buy: ");
            int book_no = Integer.parseInt(br.readLine());
            i2 = i2.books.get(book_no);

        }
            if (n==2){
            i2 = new Non_fiction();
            i2.display();
            System.out.println("Choose index of book you want to buy: ");
            int book_no = Integer.parseInt(br.readLine());
            i2 = i2.books.get(book_no);

        }
            if (n==3){
            i2 = new Health();
            i2.display();
            System.out.println("Choose index of book you want to buy: ");
            int book_no = Integer.parseInt(br.readLine());            
            i2 = i2.books.get(book_no);

        }
        if (n==4){
            i2 = new Poetry_Romance();
            i2.display();
            System.out.println("Choose index of book you want to buy: ");
            int book_no = Integer.parseInt(br.readLine());            
            i2 = i2.books.get(book_no);

        }    
        if (n==5){
            i2 = new Travel();
            i2.display();
            System.out.println("Choose index of book you want to buy: ");
            int book_no = Integer.parseInt(br.readLine());            
            i2 = i2.books.get(book_no);

        }
        else {
            i2 = null;
        }
        
        books_in_cart.add(i2);
        System.out.println("Choose quantity of the book you want to buy: ");
        int m = Integer.parseInt(br.readLine());
        num_of_the_book.add(m);
        
        System.out.println("Book added to cart. Do you want suggestion based on the current book? Press 1:");
        int a = Integer.parseInt(br.readLine());
        if (a==1){
            i2.suggest();
        }
            }

        
        System.out.println("To add more to cart press any number, enter -999 to exit");
        ch = Integer.parseInt(br.readLine());
        }
    }


    
    
 Inventory search_with_isbn()throws IOException{

    Mystery_Drama o1 = new Mystery_Drama();
    Non_fiction o2 = new Non_fiction();
    Health o3 = new Health();
    Poetry_Romance o4 = new Poetry_Romance();
    Travel o5 = new Travel();
    System.out.println("Enter ISBN of book you want to search:");
    int isbn;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    isbn = Integer.parseInt(br.readLine());
    int n=0;
    int num;

    ArrayList<Inventory> all_books = new ArrayList<Inventory>();
    for(int i=0; i<o1.books.size(); i++)
        all_books.add(o1.books.get(i));
    for(int i=0; i<o2.books.size(); i++)
        all_books.add(o2.books.get(i));
    for(int i=0; i<o3.books.size(); i++)
        all_books.add(o3.books.get(i));  
    for(int i=0; i<o4.books.size(); i++)
        all_books.add(o4.books.get(i)); 
    for(int i=0; i<o5.books.size(); i++)
        all_books.add(o5.books.get(i));

    for(int i=0; i<all_books.size(); i++){
            if(isbn == all_books.get(i).book_isbn){
                System.out.println("Book Titled: " + all_books.get(i).book_title +" Price: "+ all_books.get(i).book_price+ " added to cart");
                books_in_cart.add(all_books.get(i));
                System.out.println("Enter quantity of book: ");
                num = Integer.parseInt(br.readLine());
                num_of_the_book.add(num);
                n=1;
                int a= all_books.get(i).category_id;
                if(a==1)
                return o1;
                if(a==2)
                return o2;
                if(a==3)
                return o3;
                if(a==4)
                return o4;
                if(a==5)
                return o5;
            
            
            }
        } 
        
        if(n==0)
        System.out.println("Sorry book not found");   
        return null;

 }

 void display_cart(){

        if (books_in_cart.isEmpty())
        System.out.println("Shopping cart is empty");

        else{
        System.out.println("Details of the books added to cart are: ");

        for(int i=0; i< books_in_cart.size(); i++){
            System.out.println("Book title:" + books_in_cart.get(i).book_title); 
            System.out.println("Book isbn:" + books_in_cart.get(i).book_isbn); 
            System.out.println("Book price:" + books_in_cart.get(i).book_price);
            System.out.println( "Quantity: " + num_of_the_book.get(i)); 
            
        }
        }
    }

    void empty_cart(){
        books_in_cart.clear();
        num_of_the_book.clear();
    }

}