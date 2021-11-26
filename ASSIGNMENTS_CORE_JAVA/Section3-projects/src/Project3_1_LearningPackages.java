import java.util.*;
//First mini project
public class Project3_1_LearningPackages {
    public static void main(String[] args) {
        int pckg;
        Scanner sc = new Scanner(System.in);
        System.out.println("which package do you want? 1,2 or 3?");
        pckg = sc.nextInt();
        int numberOfCourses;
        System.out.println("How many courses are you interested in?");
        numberOfCourses = sc.nextInt();
        int ans=0;
        if(pckg==1)
        {
            ans+=10;
            if(numberOfCourses>2)
            {
                ans+=(numberOfCourses-2)*6;
            }
        }
        else if(pckg==2)
        {
            ans+=12;
            if(numberOfCourses>4)
            {
                ans+=(numberOfCourses-4)*4;
            }
        }
        else
        {
            ans+=15;
            if(numberOfCourses>6)
            {
                ans+=(numberOfCourses-6)*3;
            }
        }
        System.out.println("The total cost is $"+ans);
    }
}
