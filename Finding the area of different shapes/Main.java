import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int ch = sc.nextInt();
      switch(ch)
      {
        case 1: 
          int side = sc.nextInt();
          System.out.println(side*side);
          break;
        case 2: 
          int len = sc.nextInt();
          int br = sc.nextInt();
          System.out.println(len*br);
          break;
        case 3: 
          int base = sc.nextInt();
          int h = sc.nextInt();
          System.out.println(0.5*base*h);
          break;
        case 4:
          int rad = sc.nextInt();
          System.out.println(3.14*rad*rad);
          break;
        default:
          System.out.println("Wrong Item");
      }
    }
}