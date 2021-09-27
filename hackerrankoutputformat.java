//https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class hackerrankoutputformat {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String degisken = "";         
        System.out.println("================================");   
        for(int i=0;i<3;i++){
            String space = " ";
            String s1=sc.next();                       
            int x=sc.nextInt();
            degisken = Integer.toString(x);
            while(true){
                if (degisken.length()==3){
                    break;
                }
                else{
                    degisken = "0" + degisken;
                }
            }          
            int spacesayisi = 17-((s1+degisken).length());
            for (int j = 0; j < spacesayisi; j++) {
                space = space + " ";
            }
            System.out.println(s1+space+degisken);       
        }                 
         System.out.println("================================");                
       
      
         
       
    }
}
