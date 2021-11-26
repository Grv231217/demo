public class ArithmeticFun {
    public static void main(String[] args) {
        //These are called binary operator as they involve 2 operands..
        int a = 20;
        int b = 25;
        int result= a + b;
        int product= a * b;
        int diff= a - b;
        int quotient= a / b;
        int remainder= a % b;
        //when + is used when operand is of type string the + is used as concatenation operator
        System.out.println("the result is "+result);
        System.out.println("the product is "+product);
        System.out.println("the diff is "+diff);
        System.out.println("the quotient is "+quotient);
        System.out.println("the remainder is "+remainder);
        //Compound operators are the one where we need to operate on operands among one is the same result
        result+=20;
        System.out.println("the result now is "+result);

        product*=2;
        System.out.println("the product now is "+product);

        //Unary operator are the ones which gets used when we need to increase/decrease by a single unit
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);

        //ASSIGNMENT:
        product*=2;
        System.out.println("The new product as per details in assignment is "+product);
    }
}
