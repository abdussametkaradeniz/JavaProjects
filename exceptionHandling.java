import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.namespace.QName;

class Hata1 extends Exception{
    String hataMetni="ozel hata durumu";
    String hataTipi="hata tipim";

    public String toString(){
        hataMetni+=String.format( " : " + hataTipi);
        return hataMetni;
    }
}

class Not{
    public int vizenotual() throws Hata1{
        Scanner scan = new Scanner(System.in);
        int vizenotu = scan.nextInt();
        if(vizenotu<0 || vizenotu>100){
            throw new Hata1();
        }
        return vizenotu;
    }
}
public class exceptionHandling {
    

    public static void main(String[] args) {

        Not n1 = new Not();
        try {
            n1.vizenotual();
        } catch (Hata1 e) {
            System.out.println(e.toString());
        }









       // metot2();
        /*
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            double result = bol(a,b);
            System.out.println(result);
            System.out.println("bu kod satiri okundu");
        } catch (Exception e) {
            System.out.println(e.toString());       
        }
        FileInputStream fileoutputstream = null;
        try(fileoutputstream) {

            Scanner scan = new Scanner(System.in);       
            int sayi = scan.nextInt();
            int sayi2 = scan.nextInt();
            double result = sayi/sayi2;
            System.out.println(result);

        } catch (ArithmeticException ex) {
            System.out.println("bir hata olustu"+ex);
        }
        catch(Exception q){
            System.out.println(q);
        }finally{
            try {
                int[] dizi = {1,2,3};
                System.out.println(dizi[2]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        */
        
    }


/*
    public static int bol(int a,int b){
        if(b == 0){
            throw new ArithmeticException("bolen sayi 0 olmamali");
        }
        int result = a/b;
        return result;
    }
    public static void metot() throws Exception{
        int[] dizi = new int[] {1,2,3,4,5,6,7};
        System.out.println(dizi[8]);       
    }
    public static void metot2() {
        System.out.println("metodu cagiriyorum");
        try {
            metot();
        } catch (Exception e) {
            System.out.println("hata olustu");
        }     
    }
    */

}
