import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Notes
/*
Each ProcessBuilder instance manages a collection of process attributes. The start() method creates a new
Process instance with those attributes. The start() method can be invoked repeatedly from the same instance
to create new subprocesses with identical or related attributes.
*/

public class Assignment3
{
    // method for finding the ping statics of website
    static void commandsPing(String url)
            throws Exception
    {
        // creating the sub process, execute system command

        /*
        Basically this ProcessBuilder takes some command string as input to operate on it depending on
        the type of data present in the string it works accordingly.Here using ping along with it does the
        work for us.
        */
        ProcessBuilder build = new ProcessBuilder(new String[]{"ping", url});
        Process process = build.start();

        /* By default, the subprocess writes standard output and standard error to pipes. Java code can
        access these pipes via the input streams returned by Process.getInputStream() and
        Process.getErrorStream(). However, standard output and standard error may be redirected to other
        destinations using redirectOutput and redirectError. In this case, Process.getInputStream() and/or
        Process.getErrorStream() will return a null input stream  */
        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;

        System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
        }
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }
    }

    // Main method
    public static void main(String[] args) throws Exception
    {
        //To get total execution time of the program
        long start = System.nanoTime();
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL we need to ping: ");
        str = sc.nextLine();
        Assignment3.commandsPing(str);
        long end = System.nanoTime();
        long range = 1000000000;
        System.out.println("Total program execution time: "+(end-start)/range+" Seconds");
    }
}
