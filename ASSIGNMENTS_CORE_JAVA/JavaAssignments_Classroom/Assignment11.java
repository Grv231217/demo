import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment11 {

    public static void main(String[] args) {
        try {
            Scanner inpf = new Scanner(new File("C:\\Users\\gv231\\IdeaProjects\\Assignments\\src\\Gaurav\\assignment\\Assignment11_inp"));
            PrintWriter opf = new PrintWriter("C:\\Users\\gv231\\IdeaProjects\\Assignments\\src\\Gaurav\\assignment\\Assignment11_Op");
            HashMap mp = new HashMap();

            while(inpf.hasNext()) {
                char[] charArray = inpf.next().toCharArray();
                char[] var5 = charArray;
                int var6 = charArray.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    char ch = var5[var7];
                    if (mp.containsKey(ch)) {
                        mp.put(ch, (Integer)mp.get(ch) + 1);
                    } else {
                        mp.put(ch, 1);
                    }
                }
            }

            Iterator var10 = mp.entrySet().iterator();

            while(var10.hasNext()) {
                Entry<Character, Integer> entry = (Entry)var10.next();
                Object var10001 = entry.getKey();
                opf.println(var10001 + ": " + entry.getValue());
            }

            inpf.close();
            opf.close();
        } catch (FileNotFoundException var9) {
            System.out.println(var9.getMessage());
        }

    }
}