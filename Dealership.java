public class Dealership
{
public static void main(String[] args)
{
Customer cust1 = new Customer();
  cust1.setName("tom");
  cust1.setAdress("123 avenue");
  cust1.setCashOnHand(12000);
  Vehicle vehicle = new Vehicle("BMW","M3",20000);
  Employee emp = new Employee();
  cust1.purchaseCar(vehicle,emp,false);
  
  Vehicle car = new Vehicle("BMW","M3",20000);

 boolean value = car.equals(vehicle);
  System.out.println(value);
  






}








}
