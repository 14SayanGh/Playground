import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

		String source = sc.nextLine();

		String dest = sc.nextLine();

		String result = source.replace(source, dest);
		
      String arr[] = result.split(" ");
      for (String temp: arr){
	      System.out.println(temp);
	}
    }
}