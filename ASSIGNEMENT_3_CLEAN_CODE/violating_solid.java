import java.util.*;
interface for_name_marks{
    public void addname(String name,Integer marks);
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
class adding_marks_name extends details_specification implements for_name_marks{
    public void addname(String name,Integer marks)
    {
        namelist[roll_no]=name;
        addmark(marks);
    }
    public void addmark(Integer marks)
    {
        marklist[roll_no]=marks;
        roll_no+=1;
    }
}
class print_marks extends adding_marks_name implements to_print{
    String details="";
    public void printd(Integer roll_call)
    {
        details=Integer.toString(roll_call)+" "+namelist[roll_call-1]+" "+Integer.toString(marklist[roll_call-1])+" "+comment[roll_call-1];
        System.out.println(details);
    }
}
public class violating_solid
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		print_marks obj=new print_marks();
		obj.addname("gaurav",95);
		obj.addmark(95);
		obj.printd(1);
	}
}