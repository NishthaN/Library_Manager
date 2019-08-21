import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Inventory implements Suggest{
    ArrayList<Inventory> books = new ArrayList<Inventory>();

    int category_id;
    String book_title;
    String book_publisher;
    int book_price;
    int book_isbn;
    int book_amount;
    int book_min;
   

    void get_info(int id, String title, String publisher, int price, int isbn, int amt, int min){

        this.category_id = id;
        this.book_title = title;
        this.book_publisher = publisher;
        this.book_price = price;
        this.book_isbn = isbn;
        this.book_amount = amt;
        this.book_min = min;

    
    }
    public void suggest(){}
    void display(){}
}