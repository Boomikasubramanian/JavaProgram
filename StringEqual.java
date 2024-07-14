import java.util.*;
class StringEqual
{
  public static void main(String[]args)
  {
    Scanner obj=new Scanner(System.in);
    String str1=obj.nextLine();
    String str2=obj.nextLine();
    if(str1.equals(str2))
    System.out.print("Equal");
    else
    System.out.print("Not Equal");
    obj.close();
  }
}