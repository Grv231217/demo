//Implementation of logical operators...
public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isWarm = false;

        boolean combined=isRaining&&isWarm;
        System.out.println("is it raining AND warm?? "+combined);

        combined=isRaining||isWarm;
        System.out.println("is it raning OR warm?? "+combined);

        System.out.println("is it NOT raining?? "+!isRaining);

        //ASSIGNMENT
        isRaining = false;
        isWarm = true;

        combined=isRaining&&isWarm;
        System.out.println("is it raining AND warm?? "+combined);

        combined=isRaining||isWarm;
        System.out.println("is it raning OR warm?? "+combined);

        System.out.println("is it NOT raining?? "+!isRaining);

        isRaining = true;
        isWarm = false;

        combined=isRaining&&isWarm;
        System.out.println("is it raining AND warm?? "+combined);

        combined=isRaining||isWarm;
        System.out.println("is it raning OR warm?? "+combined);

        System.out.println("is it NOT raining?? "+!isRaining);

        isRaining = true;
        isWarm = true;

        combined=isRaining&&isWarm;
        System.out.println("is it raining AND warm?? "+combined);

        combined=isRaining||isWarm;
        System.out.println("is it raning OR warm?? "+combined);

        System.out.println("is it NOT raining?? "+!isRaining);
    }
}
