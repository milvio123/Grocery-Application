import java.util.Scanner; // import the Scanner class 
// import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    int userresp = 0;
    String item = "None";
    Scanner myObj = new Scanner(System.in);
  while(userresp!=4) {
    System.out.println("Type 1 to Add item");
    System.out.println("Type 2 Edit item");
    System.out.println("Type 3 Remove item");
    System.out.println("Type 4 Exit");
    userresp = myObj.nextInt();

    if(userresp==1) {
      System.out.println("Add item: ?");
      item = myObj.next();
      System.out.println("Item is: " + item);
      }
    }

  }
  
}
