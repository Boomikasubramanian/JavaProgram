import java.util.*;


public class Fibonacci {
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number for fibonacci ");
        int n = obj.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 3; i <= n ; i++)
        {
            int sum = a + b;
           System.out.print(sum +  " "); 
           a=b;
           b=sum;
        }
        obj.close();
    }

}
