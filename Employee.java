public class Employee
{
 public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
 {
   if(finance==true)
   {
     double loanAmount = vehicle.getprice()-cust.getCashonHand();
     runCreditHistory(cust,loanAmount);
   
   }
   else if(vehicle.getPrice()<=cust.getCashonHand())
   {
   
   processTransaction(cust,vehicle);
   }
   else
   {
    System.out.println("customer will need more money to purchase vehicle" +vehicle);
   
   }
 
 
 
 
 }
  public void runCreditHistory(Customer cust, double loanAmount)
  {
    System.out.println("Ran credit history for customer...");
     System.out.println("customer has benn approved to purchase the vehicle");
  
  }
  public void processTransaction(Customer cust, Vehicle vehicle)
  {
  System.out.println("customer has purchased  the vehicle:"+vehicle+"for the price"+vehicle.getPrice());
  }



}
