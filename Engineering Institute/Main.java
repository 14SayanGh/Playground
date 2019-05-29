import java.util.Scanner;

class Faculty
{
    static int base;
    public void setBase(int base)
    {
      this.base = base;
      
      System.out.println("Base Salary: "+base);
    }
    public int getBase()
    {
      return base;
    }
}
class CSE extends Faculty
{
  public void salary()
  {
    int bonus=3000;
    System.out.println("CSE Faculty: "+(bonus+ super.getBase()));
  }
}
class IT extends Faculty
{
  public void salary()
  {
    int bonus=5000;
    System.out.println("IT Faculty: "+(bonus+ super.getBase()));
  }
}
class ECE extends Faculty
{
  public void salary()
  {  
    int bonus=4500;
    System.out.println("ECE Faculty: "+(bonus+ super.getBase()));
  }
}

class Main
{
  public static void main(String[] args)
  {
    CSE obj1 = new CSE();
    IT obj2 = new IT();
    ECE obj3 = new ECE();
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    obj1.setBase(base);
    obj1.salary();
    obj2.salary();
    obj3.salary();
  }
}