import java.util.Scanner;

class Item
{
  private int price;
  void setPrice(int price)
  {
    this.price = price;
  }
  int getPrice()
  {
    return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  void setProduct(String prod)
  {
    this.product = prod;
  }
  void setQty(int quantity)
  {
    this.quantity = quantity;
  }
  int getQty()
  {
    return quantity;
  }
}

class Bill extends Customer
{
void calc()
{
  int total = getPrice()*getQty();
  System.out.println("Total Price is : "+total);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int cost = sc.nextInt();
    int qty = sc.nextInt();
    obj.setProduct(name);
    obj.setPrice(cost);
    obj.setQty(qty);
    obj.calc();
  }
}