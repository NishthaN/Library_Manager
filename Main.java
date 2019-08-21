import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main{

static ArrayList<Customer> customers = new ArrayList<Customer>();
static ArrayList<Integer> customer_id = new ArrayList<Integer>();
static ArrayList<Cart> customer_cart = new ArrayList<Cart>();
static ArrayList<Bill> customer_bill = new ArrayList<Bill>();

public static void main(String args[])throws IOException{
    
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n=0;
Customer c1;

do{
    System.out.println("Dear Customer, enter 1 if existing customer, 2 if new customer.");
    int m = Integer.parseInt(br.readLine());
    if(m==2){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(br.readLine());
        c1 = new Customer(1);
        customers.add(c1);
        customer_id.add(id);
        Cart cart1 = new Cart();
        customer_cart.add(cart1);
        Bill b1 = new Bill();
        customer_bill.add(b1);
        main_choice(c1,id, cart1, b1);

    }
  
    if(m==1){
    System.out.println("Enter ID: ");
    int id = Integer.parseInt(br.readLine());   
    int a = customer_id.indexOf(id);
    Bill b1 = customer_bill.get(a);
    c1 = customers.get(a);
    Cart cart1 = customer_cart.get(a);
    main_choice(c1,id, cart1, b1);

    }


    System.out.println("Enter -999 to exit, any other number for different customer");
    n=Integer.parseInt(br.readLine());
} while (n!=-999); 
    
}

static void main_choice(Customer c1, int id, Cart cart1, Bill b1)throws IOException{

    int n=0;
    int ch=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (n!=-999){
        System.out.println("1.View customer details 2.View Cart 3.Add to Cart 4.Checkout and view Bill 5.View Bill History");
        ch = Integer.parseInt(br.readLine());
        switch(ch){
            case 1:
            c1.display();
            break;

            case 2:
            cart1.display_cart();
            break;

            case 3:
            cart1.add_cart();
            break;

            case 4:
            b1.bill_calculate(cart1);
            cart1.empty_cart();
            break;

            case 5:
            b1.display_bill_history();
            break;

            default:
            break;

        }

        System.out.println("Enter -999 to exit, any other number to repeat: ");
        n  = Integer.parseInt(br.readLine());
    }
}

}
