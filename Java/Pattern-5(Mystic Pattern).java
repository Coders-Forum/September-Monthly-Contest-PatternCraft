import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || j==n/2){
                    System.out.print("*");
                }
                else if(i<n/2 && j==0){
                    System.out.print("*");
                }
                else if(i>n/2 && j==n-1){
                    System.out.print("*"); 
                }
                else if(j>n/2 && i==0){
                    System.out.print("*");
                }
                else if(j<n/2 && i==n-1){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}