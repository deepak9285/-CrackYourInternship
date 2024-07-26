import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int[] A=new int[N];
            int X=sc.nextInt();
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }int ans=0;
            Arrays.sort(A);
            for(int j=N-1;j>=0;j--){
                if(A[j]>X){
                    ans++;
                    y=A[j]-X;
                }
                else if(A[ij==X){
                    ans++;
                }
                else{
                    A[j]+=y;
                    i++;
                }
            }
            System.out.println(ans);
        }

    }
}
