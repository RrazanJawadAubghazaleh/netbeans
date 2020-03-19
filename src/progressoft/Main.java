
package progressoft;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<Snack> snackArrayList=new ArrayList<>();
    
    public static void main(String[] args) {
      
        //to start the machine with a set of snacks 
        SnackMachine.prepareArray();
      
        int t=7;
        while (t>0) {
       
      int id;
      double chang=0;
      
     System.out.println("Please enter the meal number and then the money");
     // to talk from the cutomer  order 
     Scanner in = new Scanner(System.in);
    // id of the snacks
     id=in.nextInt();
     // Money set by the user
     Money money = new Money();
     money.setPrice(in.nextDouble());

     // if the user inter number biger than id snacks
     if(SnackMachine.checkID(id))
    {
     
         if( money.checkPrice(money.getPrice()))
        {
             // checkSnackPrice   
             if(SnackMachine.checkSnackPrice(id,money.getPrice()))
                {   
                     if(SnackMachine.checkQuantity (id)) 
                          { //reducing the quantity inside the machine
                            int Quantity=snackArrayList.get(id).getSnackQuantity();
                            Quantity--;
                            snackArrayList.get(id).setSnackQuantity(Quantity);
                            chang=money.getPrice()-snackArrayList.get(id).getSnackPrice();
                            Money.setMoneyInsideMachine(snackArrayList.get(id).getSnackPrice());
       
                         if(chang>0)
                           System.out.println("chang : "+chang);
          
     
                           System.out.println("your snack :"+snackArrayList.get(id).getSnackName());
                           System.out.println("MoneyInsideMachine :"+Money.getMoneyInsideMachine());
                        } 
                }
       }
     }
     
    t--;}
    }
   /* if i have databae i will 
    Call Data Base and do without this method*/ 
    
    
    public static class SnackMachine {
        
         private static ArrayList<Snack> prepareArray()
    {
        SnackType snackType = null;
        Snack snack=new Snack();
        
        snack.setSnackName("Lays");
        snack.setSnackId(0);
        snack.setSnackPrice(0.5);
        snack.setSnackQuantity(5);
        snack.setSnackType(snackType.Chips.toString());
        snackArrayList.add (snack);

        snack=new Snack();
        snack.setSnackName("Milk");
        snack.setSnackId(1);
        snack.setSnackPrice(1);
        snack.setSnackQuantity(5);
        snack.setSnackType(snackType.drinks.toString());
        snackArrayList.add (snack);

        snack=new Snack();
        snack.setSnackName("Popeyes chicken sandwich");
        snack.setSnackId(2);
        snack.setSnackPrice(10);
        snack.setSnackQuantity(5);
        snack.setSnackType(snackType.Sandwich.toString());
        snackArrayList.add (snack);


        snack=new Snack();
        snack.setSnackName("Orange juice");
        snack.setSnackId(3);
        snack.setSnackPrice(5);
        snack.setSnackQuantity(5);
        snack.setSnackType(snackType.drinks.toString());
        snackArrayList.add (snack);

        snack=new Snack();
        snack.setSnackName("Water");
        snack.setSnackId(3);
        snack.setSnackPrice(.25);
        snack.setSnackQuantity(5);
        snack.setSnackType(snackType.drinks.toString());
        snackArrayList.add (snack);

        snack=new Snack();
         snack.setSnackName("kit kat chocolate");
        snack.setSnackId(4);
        snack.setSnackPrice(1);
        snack.setSnackQuantity(5);
       snack.setSnackType(snackType.chocolate.toString());
        snackArrayList.add (snack);


        return snackArrayList;

    }

    
   // to check the id is enter from the cutomer is existing inside the machine
         private static boolean checkID (int Id)
          {
            if(Id<snackArrayList.size())
                 return true;
    
           else 
            {  System.out.println( "sorry ,the id of snack does not exist. ");
            return false;}
          }
         
      
         
         // to check the money is enter from the cutomer is equaling the snackPrice 
         private static boolean checkSnackPrice  (int id,double price)
          {
           if(snackArrayList.get(id).getSnackPrice()<=price)
                 return true;
    
           else 
            {  System.out.println( "sorry , Your money is not enough to buy ");
            return false;}
          }
       
         
         // to check at the snack quantity 
         private static boolean checkQuantity (int id)
          {
            if(snackArrayList.get(id).getSnackQuantity()>0)
                 return true;
    
           else 
            {  System.out.println( "sorry , the Quantity of snack is 0 ");
            return false;}
          }
    }
}
