import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exp = sc.nextInt();
      int res =1;
      for(int i =1;i<=exp;++i)
      { res*=base;
      }
      System.out.println(res);
    }
}