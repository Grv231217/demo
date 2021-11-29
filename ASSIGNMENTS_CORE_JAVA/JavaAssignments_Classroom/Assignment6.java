public class Assignment6 {
    //Task2:  Create a class with two (overloaded) constructors. Using this, call the
    // second constructor inside the first one.
    String name;
    public Assignment6()
    {
        this.name="Gaurav";
        Assignment6 obj = new Assignment6(name);
    }
    public Assignment6(String str)
    {
        System.out.println("Name is "+str);
    }

    //TASK1
    public static void main(String[] args) {
        //FOR TASK 2
        Assignment6 obj1 = new Assignment6();

        //FOR TASK 3
        Assignment6[] arr = new Assignment6[5];

        //FOR TASK 1
        int cnt=0;int val=1;int l;
        while(cnt<=100)
        {
            l=numberOfDigits(val);
            if(l%2==0)
            {
                for(int j=1;j<=val/2;j++)
                {
                    if(numberOfDigits(j)==(l/2)&&numberOfDigits(val/j)==(l/2)&&checkDigitsPresence(val,j,val/j)==true&&j%10!=0&&(val/j)%10!=0)
                    {
                        System.out.println("Line"+cnt+" "+val);
                        cnt++;
                        break;
                    }
                }
            }
            val++;
        }
    }
    public static int numberOfDigits(int x)
    {
        String str = String.valueOf(x);
        return str.length();
    }
    public static boolean checkDigitsPresence(int x,int y,int z)
    {
        String str1 = String.valueOf(x);
        String str2 = String.valueOf(y);
        String str3 = String.valueOf(z);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0;i<str2.length();i++)
        {
            arr2[str2.charAt(i)-'0']=1;
        }
        for(int i=0;i<str3.length();i++)
        {
            arr2[str3.charAt(i)-'0']=1;
        }
        for(int i=0;i<str1.length();i++)
        {
            arr1[str1.charAt(i)-'0']=1;
        }
        for(int i=0;i<10;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
