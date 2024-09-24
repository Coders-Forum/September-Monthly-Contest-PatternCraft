import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int l=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<2*n-i-l;j++){
                System.out.print(" ");
            }
            
            for(int k=i;k<2*i;k++){
                System.out.print(k);
                System.out.print(" ");
            }
             
            for(int k=i*2-2;k>=i;k--){
                System.out.print(k);
                System.out.print(" ");
            }
            
            System.out.println();
            l+=1;
               
        }      
    }
}