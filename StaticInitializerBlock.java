import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
    static boolean flag = true;
    static int B, H;
    static {
        Scanner sc=new Scanner(System.in);
        B = sc.nextInt();
        sc.nextLine();
        H = sc.nextInt();
        sc.close();
        if (B<=0||H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
