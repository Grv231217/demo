import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            //include this statement if you want to include capital letters also.
            //str=str.toLowerCase(Locale.ROOT);
            arr[str.charAt(i) - 'a']=1;
            //using Ascii to mark whether a character is present in the string or not
        }
        int ctr=1;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("All characters are not present in the string!");
                ctr=0;
                break;
            }
        }
        if(ctr==1)
        {
            System.out.println("All characters are present ");
        }
    }
    /*
    Time complexity: O(N);
    space complexity: O(N);
     */
}
