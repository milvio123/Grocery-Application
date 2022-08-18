import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;



class Main {
  public static void main(String[] args) {
    ArrayList<String> grocitems = new ArrayList<String>();
    ArrayList<Integer> grocprices = new ArrayList<Integer>();

    int userresp = 0;
    int total = 0;
    Scanner myObj = new Scanner(System.in);
  while(userresp!=6) {
    System.out.println("Type 1 to Add item");
    System.out.println("Type 2 Edit item");
    System.out.println("Type 3 Remove item");
    System.out.println("Type 4 Total Price");
    System.out.println("Type 5 Save Bill");
    System.out.println("Type 6 Exit");
    userresp = myObj.nextInt();

    if(userresp==1) {
      int i = 0;
      System.out.println("How many items do you want to add?");
      int numberofitem = myObj.nextInt();
      
        while(i<numberofitem){
        System.out.println("What item do you want to add?");
        String item = myObj.next();
        System.out.println("What is the price of the item?");
        int price = myObj.nextInt();

        System.out.println(item + ": " + price);
        grocitems.add(item);
        grocprices.add(price);
        i++;

        }      

      }
    if(userresp==2) {
      System.out.println("What item do you want to edit?");
      String itemtoedit = myObj.next();
      boolean ans = grocitems.contains(itemtoedit);

        if(ans == true) {
          int indexofedit = grocitems.indexOf(itemtoedit);
          System.out.println("What do you want to change the item to?");
          String itemtochange = myObj.next();  
          grocitems.set(indexofedit, itemtochange);
          System.out.println("What should the new price be?");
          int pricetochange = myObj.nextInt();
          grocprices.set(indexofedit, pricetochange);
        }
      
      System.out.println(grocitems);
      System.out.println(grocprices);


    }
    if(userresp==3) {
      System.out.println("What item do you want to remove?");
      String itemtoremove = myObj.next();
      boolean rem = grocitems.contains(itemtoremove);
      if(rem == true) {
        int indexofremove = grocitems.indexOf(itemtoremove);
        grocitems.remove(indexofremove);
        grocprices.remove(indexofremove);
      }
      System.out.println(grocitems);
      System.out.println(grocprices);

    }

    if(userresp==4) {
     
      for (int a = 0; a < grocprices.size(); a++) {
        total+=grocprices.get(a);
      }
      System.out.println(total);

    }

    if(userresp==5) {

      try {  
        FileWriter myWriter = new FileWriter("bill.txt");
        myWriter.write("This is the item list: " + grocitems.toString() + System.lineSeparator());
        myWriter.write("This is the price list: " + grocprices.toString() + System.lineSeparator());
        myWriter.write(total);
        myWriter.close();
        System.out.println("File is saved as bill.txt.");

      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
  
  
    }

    }

  }
  
}
