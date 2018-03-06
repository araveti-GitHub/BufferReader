
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BufferReader {
    public static void main(String[] args) {
    String str1 = "VEERA";
    System.out.println("Enter manager name in Buffer Reader: ");
    BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
    try {
        str1 = readInput.readLine();
        //readInput.close();
        System.out.println("No exception in Buffer reader");
    }catch (IOException e) {
        str1 = "cannot read buffer";
        e.printStackTrace();
    }catch (NullPointerException n) {
        str1 = "Null Pointer exception";
        n.printStackTrace();
    }


    System.out.println("You Enetered the following Name:");
    System.out.println(str1);
    str1 = "SEKHAR";
    System.out.println("Enter Manager name in console:");
    if (System.console()!= null) {
        str1 = System.console().readLine();
    }
    else {
        str1 = "null object returned by console";
    }
    System.out.println("You Enetered the following Name in Console:");
    System.out.println(str1);
      Scanner rdScan = new Scanner(System.in);
        if (rdScan!= null) {
            System.out.println("Enter Manager name in Scanner:");
            try {
                str1 = rdScan.nextLine();
            } catch (NullPointerException n) {
                str1 = "problem in scanner";
                n.printStackTrace();
            }
        }
        else
            str1="scanner returned NULL";
        System.out.println("You Enetered the following Name in Scanner:");
        System.out.println(str1);
        //readInput.close();
        rdScan.close();
        str1 = null;
    }
}
