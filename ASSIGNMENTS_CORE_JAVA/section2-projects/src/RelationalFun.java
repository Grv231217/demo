
//Implementation of relational operators
public class RelationalFun {
    public static void main(String[] args) {
        boolean myValue = true;
        boolean yourValue = false;
        int currentAge = 22;
        int yourAge = 16;
        int bobsAge = 16;
        System.out.println("myValue is "+myValue);
        System.out.println("yourValue is "+yourValue);
        boolean ageComparison = currentAge>yourAge;
        System.out.println("currentAge>yourAge? "+ageComparison);
        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge>bobsAge? "+ageComparison);
        ageComparison = yourAge==bobsAge;
        System.out.println("yourAge==bobsAge? "+ageComparison);

        /*Now these relational operators cannot be applied to string since they are refenced data type,so
        we use .equals for comparison*/
        String myName = "Gaurav";
        String yourName = "Gaurav";
        boolean nameComparison = myName.equals(yourName);
        System.out.println("nameComparison value is "+nameComparison);

        //ASSIGNMENT
        boolean result = currentAge>21;
        System.out.println("currentAge>21? "+result);
    }
}
