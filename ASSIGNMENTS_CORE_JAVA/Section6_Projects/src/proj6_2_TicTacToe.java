import java.util.*;
//implementation of tic tac toe GAME...
public class proj6_2_TicTacToe {
    public static void main(String[] args) {
        int check = 0;
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        int x,y;
        System.out.println("WELCOME TO TIC TAC TOE GAME.... ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=' ';
            }
        }
        while(check==0)
        {
            System.out.println("Player 1 can let us know row & column(using 0,1 or 2):");
            printGame(arr);
            x = sc.nextInt();
            y = sc.nextInt();
            while(arr[x][y]!=' ')
            {
                System.out.println("INVALID ENTRY , pls enter again");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            arr[x][y]='X';
            if(checkGame(arr)==true)
            {
                System.out.println("congratulations! Player 1 won...");
                printGame(arr);
                break;
            }
            if(checkOver(arr)==true)
            {
                System.out.println("It's a draw!");
                printGame(arr);
                break;
            }
            System.out.println("Player 2 can let us know row & column(using 0,1 or 2):");
            printGame(arr);
            x = sc.nextInt();
            y = sc.nextInt();
            while(arr[x][y]!=' ')
            {
                System.out.println("INVALID ENTRY , pls enter again");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            arr[x][y]='O';
            if(checkGame(arr)==true)
            {
                System.out.println("congratulations! Player 2 won...");
                printGame(arr);
                break;
            }
            if(checkOver(arr)==true)
            {
                System.out.println("It's a draw!");
                printGame(arr);
                break;
            }
        }
    }
    public static void printGame(char[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println("--------------");
            for(int j=0;j<arr.length;j++)
            {
                System.out.print("| "+arr[i][j]+" |");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }
    public static boolean checkGame(char[][] arr)
    {
        int chk=0;
        for(int i=0;i< arr.length;i++)
        {
            chk=0;
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][j]!=' '&&arr[i][j-1]!=' '&&arr[i][j]==arr[i][j-1])
                {
                    chk+=1;
                }
            }
            if(chk==2)
            {
                return true;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            chk=0;
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[j][i]!=' '&&arr[j-1][i]!=' '&&arr[j][i]==arr[j-1][i])
                {
                    chk+=1;
                }
            }
            if(chk==2)
            {
                return true;
            }
        }
        if(arr[1][1]==arr[2][2]&&arr[1][1]==arr[0][0]&&arr[0][0]!=' '&&arr[1][1]!=' ')
        {
            return true;
        }
        if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]&&arr[1][1]!=' '&&arr[0][2]!=' ')
        {
            return true;
        }
        return false;
    }
    public static boolean checkOver(char[][] arr)
    {
        int grv=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]!=' ')
                {
                    grv+=1;
                }
            }
        }
        if(grv==9)
        {
            return true;
        }
        return false;
    }
}
