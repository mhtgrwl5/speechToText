import java.util.Arrays;
import java.util.Scanner;
class Arrays{
  public static void main()
  {
    int i;
    int[]X=new int[5];
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter number");
    for(i=0;i<5;i++)
    X[i]=Sc.nextInt();
    Arrays.Sort(X);
    for(i=4;i<=1;i++)
    System.out.println(X[i]);
  }
}
