import java.util.Scanner;

public class ExtractDigits{
   
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter a string");
        String input   =  scanner.nextLine();
        String result = extractDigits(input);
        System.out.println(result);
     }


     public static String extractDigits(String input)
     {
        StringBuilder digits = new StringBuilder();
        boolean foundDigit = false;


        for (char ch: input.toCharArray())
        {
            if (Character.isDigit(ch))
            {
                if(!foundDigit && ch == '0' && digits.length() == 0 )
                {
                    continue;
                }

                foundDigit  =true;
                digits.append(ch);
            }
        }

        if(digits.length() == 0)
        {
            return "0";
        }

        return digits.toString();
     }
}