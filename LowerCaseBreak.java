import java.util.*;;

public class LowerCaseBreak {
    
public static void main( String[] args)
{
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    for (int i = 0 ;i < str.length();i++)
    {
        char c= str.charAt(i);
        if(Character.isLowerCase(c))
        {
            break;
        }

        System.out.print(c);
    }

    obj.close();
}


}
