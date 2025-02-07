import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        LocalDate now = LocalDate.now();

        System.out.println(now.getYear());

        if(now.getMonthValue() < 10){
            System.out.println("0" + now.getMonthValue());
        }
        else{
            System.out.println(now.getMonthValue());
        }

        if(now.getDayOfMonth() < 10){
            System.out.println("0" + now.getDayOfMonth());
        }
        else{
            System.out.println(now.getDayOfMonth());
        }
    }
}