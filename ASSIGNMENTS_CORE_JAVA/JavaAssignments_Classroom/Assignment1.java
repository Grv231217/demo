import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

//Assignment to locate a specific file in a specific directory/folder
public class Assignment1 {
    public static void main(String[] args) {
        //Directory to be searched into
        //File fl = new File("C:/Users/gv231/IdeaProjects");
        String str;
        String path = "C:/Users/gv231/IdeaProjects";
        Scanner sc = new Scanner(System.in);
        int ab=0;
        System.out.println("Enter the name-expression of file");
        str = sc.nextLine();
        searchDicrectory(path,str);
        //list containing list of all files
//        String[] files = fl.list();
//        for(String s:files)
//        {
//            //iterating through the list to find the desired file
//            boolean val = str.equals(s);
//            if(val)
//            {
//                ab=1;
//                System.out.println("File Found: ");
//                System.out.println(s);
//                //getting the full path of the file found
//                System.out.println("path: "+fl.getAbsolutePath());
//            }
//        }
//        if(ab==0)
//        {
//            System.out.println("File not found");
//        }
    }

    //function to go through directories and also to find full path
    public static void searchDicrectory(String path, String regex) {
        File head = new File(path);
        File[] list = head.listFiles();
        if (list.length > 0) {
            File[] var4 = list;
            int var5 = list.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                File file = var4[var6];
                if (file.isDirectory()) {
                    searchDicrectory(file.getAbsolutePath(), regex);
                } else if (Pattern.matches(regex, file.getName())) {
                    System.out.println("File full location : " + file.getAbsoluteFile());
                }
            }
        }
    }
}
