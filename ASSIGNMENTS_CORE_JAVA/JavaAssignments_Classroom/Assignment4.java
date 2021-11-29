import java.util.ArrayList;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str1,str2;str1="";str2="";
        int n;
        n = sc.nextInt();
        ArrayList<String> startDate = new ArrayList<String>();
        ArrayList<String> endDate = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the date ranges please in the format (DD-MM-YYYY) : ");
            System.out.println("Enter sign-up date: ");
            str1 = sc.next();
            System.out.println("Enter current date: ");
            str2 = sc.next();
            while(valid(str1)==false||valid(str2)==false)
            {
                System.out.println("Invalid date format! please enter again in the format (DD-MM-YYYY) : ");
                System.out.println("Enter sign-up date: ");
                str1 = sc.next();
                System.out.println("Enter current date: ");
                str2 = sc.next();
            }
            startDate.add(str1);
            endDate.add(str2);
        }
        System.out.println("grv");
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int d1,m1,y1,d2,m2,y2;
        for(int i=0;i<n;i++)
        {
            str1 = startDate.get(i);
            str2 = endDate.get(i);
            d1=Integer.parseInt(str1.substring(0,2));
            m1=Integer.parseInt(str1.substring(3,5));
            y1=Integer.parseInt(str1.substring(6));
            d2=Integer.parseInt(str2.substring(0,2));
            m2=Integer.parseInt(str2.substring(3,5));
            y2=Integer.parseInt(str2.substring(6));
            if(((y2 % 4 == 0) && (y2 % 100 != 0)) || (y2 % 400 == 0))
            {
                days[1]++;
            }
            if(y2<=y1)
            {
                System.out.println("No range");
            }
            else
            {
                int validStartM,validStartD,validStartY,validEndM,validEndD,validEndY;
                if(m1>=2)
                {
                    if(m1<=11)
                    {
                        System.out.println("check1");
                        if(days[m1-2]==30)
                        {
                            System.out.println("check2");
                            validStartD = d1;
                            validStartM = m1-1;
                            validStartY = y2;
                            validEndY = y2;
                            validEndD = d1-1;
                            validEndM = m1+1;
                        }
                        else if(days[m1-2]==31)
                        {
                            System.out.println("check 4");
                            if(days[m1-1]==28)
                            {
                                validStartD = d1+1;
                                validStartM = m1-1;
                                validStartY = y2;
                                validEndY = y2;
                                validEndD = d1+2;
                                validEndM = m1+1;
                            }
                            else if(days[m1-1]==29)
                            {
                                validStartD = d1+1;
                                validStartM = m1-1;
                                validStartY = y2;
                                validEndY = y2;
                                validEndD = d1+1;
                                validEndM = m1+1;
                            }
                            else {
                                validStartD = d1 + 1;
                                validStartM = m1 - 1;
                                validStartY = y2;
                                validEndY = y2;
                                validEndD = d1;
                                validEndM = m1 + 1;
                            }
                        }
                        else if(days[m1-2]==28)
                        {
                            validStartD = d1-2;
                            validStartM = m1-1;
                            validStartY = y2;
                            validEndY = y2;
                            validEndD = d1-1;
                            validEndM = m1+1;
                        }
                        else
                        {
                            validStartD = d1-1;
                            validStartM = m1-1;
                            validStartY = y2;
                            validEndY = y2;
                            validEndD = d1-1;
                            validEndM = m1+1;
                        }
                    }
                    else
                    {
                        validStartD = d1;
                        validStartM = m1-1;
                        validStartY = y2;
                        validEndY = y2+1;
                        validEndD = d1-1;
                        validEndM = 1;
                    }
                }
                else
                {
                    validStartD = d1-1;
                    validStartM = m1-1;
                    validStartY = y2-1;
                    validEndY = y2;
                    validEndD = d1-1;
                    validEndM = m1+1;
                }
                if(m2==m1)
                {
                    System.out.println(validStartD+"-"+validStartM+"-"+validStartY+"  "+d2+"-"+m2+"-"+y2);
                }
                else if(m2<m1)
                {
                    if(m2==m1-1)
                    {
                        if(d2<validStartD)
                        {
                            System.out.println("No-range");
                        }
                        else
                        {
                            System.out.println(validStartD+"-"+validStartM+"-"+validStartY+"  "+d2+"-"+m2+"-"+y2);
                        }
                    }
                    else
                    {
                        System.out.println("No-range");
                    }
                }
                else
                {
                    if(m1==m2-1)
                    {
                        if(d2>validEndD)
                        {
                            System.out.println(validStartD+"-"+validStartM+"-"+validStartY+"  "+validEndD+"-"+validEndM+"-"+validEndY);
                        }
                        else
                        {
                            System.out.println(validStartD+"-"+validStartM+"-"+validStartY+"  "+d2+"-"+m2+"-"+y2);
                        }
                    }
                    else
                    {
                        System.out.println(validStartD+"-"+validStartM+"-"+validStartY+"  "+validEndD+"-"+validEndM+"-"+validEndY);
                    }
                }
            }
        }
    }
    public static String reverse(String str)
    {
        String s="";
        for(int i=str.length()-1;i>-1;i--)
        {
            s+=str.charAt(i);
        }
        return s;
    }

    public static boolean valid(String str)
    {
        if(str.length()<10)
        {
            return false;
        }
        //31-12-yyyy
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int d=Integer.parseInt(str.substring(0,2));
        int m=Integer.parseInt(str.substring(3,5));
        int y=Integer.parseInt(str.substring(6));
        if(y>1900 && y<=9999)
        {
            if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
            {
                days[1]++;
            }
            if(m>0 && m<=12)
            {
                if(d>0 && d< days[m-1])
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}