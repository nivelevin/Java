import java.util.*;
public class Tricky1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a String with odd number Length");
        String s = "WELCOMETOOVISTEON";

        int i = 0;
        int j = s.length()-1;
        
        while(i<=j)
        {

            for(int space = 0;space<i;space++)
            {
                System.out.print(" ");
            }
            if(i==j)
            {
                System.out.print(s.charAt(i));
            }
            else{
            System.out.print(s.charAt(i));
            for(int space = i+1;space<j;space++)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(j));
        }
            System.out.println();

            i++;
            j--;
        }

        while(i<s.length() && j>=0)
        {

            for(int space = 0;space<j;space++)
            {
                System.out.print(" ");
            }
            
            System.out.print(s.charAt(j));
            for(int space = j+1;space<i;space++)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            System.out.println();

            i++;
            j--;
        }
    }
}
