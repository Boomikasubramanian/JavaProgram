import java.util.*;;

public class DigitFrequency {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        String userInput = scanner.next();
        
        // array tostore frequency of each digit
        int[] digitCount = new int[10];

        //caculate the frequency of each digit
        for(char digit: userInput.toCharArray())
        {
            if(Character.isDigit(digit))
            {
                digitCount[digit - '0']++;
            }
        }

        //print the frequency of each digit
        for(int i = 0;i<10;i++)
        {
            System.out.println(i + " occurs " + digitCount[i] + " time" + (digitCount[i] != 1 ? "s" : ""));
        }

        scanner.close();
    }


}
