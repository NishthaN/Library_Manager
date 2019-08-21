import java.util.ArrayList;

public class Bill{
    ArrayList<Cart> bill_history = new ArrayList<Cart>();
    ArrayList<Integer> paid_history = new ArrayList<Integer>(); 

    void bill_calculate(Cart c1){

        bill_history.add(c1);
        int pay=0;
        int quan;

        for(int i=0; i<c1.books_in_cart.size(); i++){
            quan = c1.num_of_the_book.get(i);
            pay = pay + (c1.books_in_cart.get(i).book_price)*quan;
        }

        paid_history.add(pay);

        System.out.println("Your total bill is for Rs " + pay);
        System.out.println("The bill details are: ");
        for(int j=0; j<c1.books_in_cart.size(); j++){
        System.out.println("Book Title: " + c1.books_in_cart.get(j).book_title + "Quantity: " + c1.num_of_the_book.get(j));
        c1.books_in_cart.get(j).book_amount = (c1.books_in_cart.get(j).book_amount) -1;
        if(c1.books_in_cart.get(j).book_amount <= c1.books_in_cart.get(j).book_min)
        System.out.println("**Warning to admin: Book quantity is running low, get copies.**");
        }

    }

    void display_bill_history(){
        System.out.println("Your past bills are as follows:");

        for(int i=0; i<bill_history.size(); i++){

            System.out.println("Bill Number " + (i+1));
            System.out.println("Books are as follows: ");

            for(int j=0; j<bill_history.get(i).books_in_cart.size(); j++){
                
                System.out.println("Title: "+ bill_history.get(i).books_in_cart.get(j).book_title + " Price: "+ bill_history.get(i).books_in_cart.get(j).book_price + "Quantity: "+ bill_history.get(i).num_of_the_book.get(j));

            }

            System.out.println("Money paid for bill:" + paid_history.get(i) );
        }


    }
}