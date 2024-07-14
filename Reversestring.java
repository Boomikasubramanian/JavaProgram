import java.util.*;

class Reversestring
{
    public static void reverse(char s[])
    {
        char[] temp = new char[s.length];
        int x = 0;


        //extract letters from inputs
        for(int i = 0; i < s.length ; i++ )
        {
              if(Character.isLetter(s[i])){
                temp[x] = s[i];
                x++;
              }  
        }

        //reverse array containing the letters
       int left = 0;
       int right = x -1;
       while (left > right) {
        char tempchar   = temp[left];
            temp[left] = temp[right];
            temp[right] = tempchar;
            left++;
            right--;
       }
       
       //place reversed array leters innyo original array
       x  = 0;
       for(int  i = 0; i < s.length; i ++)
       {
         if(Character.isLetter(s[i]) ){
            s[i] = temp[x];
            x++;
         }
       }
       
        String revStr = new String(s);
        System.out.println("reversed string is : " + revStr);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        reverse(charArray);
    }
}