import java.util.*;

class LoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int q=1;
            int s=a;
            for(int j=0;j<n;j++){
                s+=q*b;
                q*=2;
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}