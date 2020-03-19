package progressoft;


public class Money {
   
  private double price;
  private static double moneyInsideMachine=0;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //add Money Inside Machine
    public static double getMoneyInsideMachine() {
        return moneyInsideMachine;
    }

    public static void setMoneyInsideMachine(double moneyInsideMachine) {
        Money.moneyInsideMachine += moneyInsideMachine;
    }
    
    public boolean checkPrice(double price) {
            if(price == .25 || price == .5 || price == 1.0|| price == 5.0 || price == 10.0)
                 return true;
    
           else 
            {System.out.println( "sorry ,the operation could not be completed. ");
            return false; }
         }
   
    
     
}
