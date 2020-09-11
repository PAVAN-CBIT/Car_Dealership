public class Customer
{
  private String name;
  private String address;
  private double cashOnHand;
  
  public String getName()
  {
     return name;
  }
  public void setName(String name)
  {
  this.name = name;
  }
  public String getAdress()
  {
     return adress;
  }
  public void setAdress(String adress)
  {
  this.adress = adress;
  }
  public double  getCashOnHand()
  {
     return CashonHand;
  }
  public void setCashOnHand(double cashonHand)
  {
    this.cashonHand=cashonHand;
  
  }
 public void purchaseCar(Vehicle vehicle ,Employee emp,boolean finance)
 {
    emp.handleCustomer(cust,finance,vehicle);
   
 }





}
