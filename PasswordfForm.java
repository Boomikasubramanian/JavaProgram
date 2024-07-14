import java.util.*;;

public class PasswordfForm {
    
public static void main(String[] args)
{
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter text");
    String str = obj.nextLine();
    String passwordForm = "*".repeat(str.length());
    System.out.print(passwordForm);
    obj.close();
    
}


}
