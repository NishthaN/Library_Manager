import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Customer extends Main{
    String name;
    String address;
    int number;

    public Customer(int x)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    if(x==1){
    System.out.println("Enter name");
    this.name = br.readLine();
    System.out.println("Enter address");
    this.address = br.readLine();
    System.out.println("Enter phone number");
    this.number = Integer.parseInt(br.readLine());}
       

    }

    void display(){
        System.out.println("Dear Customer, your details are as follows:");
        System.out.println("Name:" + name + " Address:" + address + "Phn no:" + number);

    }
}