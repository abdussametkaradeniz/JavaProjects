//https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class hackerrankjavadateandtime {

    public static DayOfWeek findDay(int month, int day, int year) {
        LocalDate t = LocalDate.of(year, month, day);
        DayOfWeek s  = t.getDayOfWeek();
        return s;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));       
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        DayOfWeek s = findDay(month, day, year); 
        System.out.println(s);     
        bufferedReader.close();
        
    }
}

