import java.util.*;
interface for_name{
    public void addname(String name);
}
interface for_marks{
    public void addmark(Integer marks);
}
interface to_print{
    public void printd(Integer roll_call);
}
class details_specification{
    static Integer roll_no=0;
    String namelist[]=new String[5];
    Integer marklist[]=new Integer[5];
    String comment[]=new String[5];
}
class adding_marks extends details_specification implements for_marks{
    public void addmark(Integer marks)
    {
        marklist[roll_no]=marks;
        roll_no+=1;
    }
}
class adding_name extends adding_marks  implements for_name{
    public void addname(String name)
    {
        namelist[roll_no]=name;
    }
}
class print_marks extends adding_name implements to_print{
    String details="";
    public void printd(Integer roll_call)
    {
        details=Integer.toString(roll_call)+" "+namelist[roll_call-1]+" "+Integer.toString(marklist[roll_call-1])+" "+comment[roll_call-1];
        System.out.println(details);
    }
}
class adding_comment extends print_marks{
    public void addcomment(Integer roll_call,String comm)
    {
        details+=" "+comm;
        comment[roll_call-1]=comm;
    }
}
public class right_solid
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		adding_comment obj=new adding_comment();
		obj.addname("gaurav");
		obj.addmark(95);
		obj.printd(1);
		obj.addcomment(1,"good");
		obj.printd(1);
		
	}
}