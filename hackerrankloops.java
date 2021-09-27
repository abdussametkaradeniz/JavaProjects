//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;

class hackerrankloops{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int k = a;
            for(int j=0;j<n;j++){
                k += Math.pow(2, j)*b;
                System.out.printf("%s ",k);
            }
            System.out.println();
        }
        in.close();  
    }




}