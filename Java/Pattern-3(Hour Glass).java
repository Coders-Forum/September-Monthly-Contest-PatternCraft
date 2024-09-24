import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int space=0;
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
        }
            for(int l=0;l<n-k;l++){
                System.out.print("*");
            }
            System.out.println();
            k+=2;
            space+=1;
        }
        
        space-=2;
        
        for(int i=0;i<n/2;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
        }
            for(int l=0;l<n-(space*2);l++){
                System.out.print("*");
            }
            System.out.println();
          
            space-=1;
        }
        
        
    }
}