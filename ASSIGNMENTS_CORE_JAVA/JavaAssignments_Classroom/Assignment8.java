public class Assignment8 {
    public static void main(String[] args) {
        exceptionHandling();
    }
    public static void exceptionHandling()
    {
        try {
            String str1 = "This is like chipping "; // length is 22
            char c = str1.charAt(24); // accessing 25th element
            System.out.println(c);
            String a = null; //null value
            System.out.println(a.charAt(0));
            int arr[] = new int[5];
            arr[6] = 9;
        }
        catch(StringIndexOutOfBoundsException|NullPointerException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside Finally Block");
        }
    }
}
