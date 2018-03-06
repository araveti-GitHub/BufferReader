import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class AscOrder {
    private static int[] sortArray = new int[5];

    public static void main (String[] args){
        int count=0;
        String sortDirection="";

        //int[] inputNos = new int[5];
        BufferedReader numberRead = new BufferedReader(new InputStreamReader(System.in));
        while (count < 5) {
            //boolean input = false;
            //while (input == false) {
                System.out.println("Enter Number" + count);
                try {
                    sortArray[count] = Integer.parseInt(numberRead.readLine());
                    count = count+1;
                    //System.out.print(sortArray[count]);
                } catch (IOException e) {
                    System.out.println("The entered value is not an integer: IO Exception");
                    //input = false;
                    //e.printStackTrace();
                } catch (NumberFormatException n) {
                    System.out.println("The entered value is not an integer: IO Exception");
                    //input = false;
                    //n.printStackTrace();
                }
                //count = count + 1;
                //numberRead.close();
            //}
        }
        //numberRead.close();
        System.out.println("The numbers in the order of entry are: ");
        for(count=0; count<5; count++){
            System.out.print(sortArray[count]+" ");
        }

        while(true) {
            System.out.println("Do you want to order in Ascending or Descending order? Enter A or D");
            try {
                sortDirection = numberRead.readLine();
            } catch (IOException I) {
                I.printStackTrace();
            }
            System.out.println("Entered option is:" + sortDirection);
            if (sortDirection.equals("A")) {
                SortNumbersAsc();

                System.out.println("The numbers in the ascending are:");
                for(count=0; count<5; count++){
                    System.out.print(sortArray[count]+" ");
                }
                System.out.println("\n END OF THE PROGRAM");
                return;
            }
            else if (sortDirection.equals("D")) {
                SortNumbersDesc();
                System.out.println("The numbers in the descending are:");
                for(count=0; count<5; count++){
                    System.out.print(sortArray[count]+" ");
                }
                System.out.println("\n END OF THE PROGRAM");
                return;
            }
            else
                System.out.println("Invalid Option");
        }
       /*
        for(count=0; count<5; count++){
            System.out.print(sortArray[count]+" ");
        }
        System.out.println("\n END OF THE PROGRAM");
        */
    }

    public static void SortNumbersAsc(){
        //AscOrder.sortArray = sortArray;
        int count, temp, lCount=1;

        boolean flag=false;
        System.out.println("inside function");

        while (flag==false) {
            System.out.println("inside while loop");
            flag = true;

            for (count=0; count < sortArray.length-lCount; count++) {
                System.out.println("Inside for loop"+count);
                if(sortArray[count] > sortArray[count+1]) {
                    temp = sortArray[count+1];
                    sortArray[count+1] = sortArray[count];
                    sortArray[count] = temp;
                    flag =false;
                }
            }
            lCount=lCount+1;
        }
    }

    public static void SortNumbersDesc(){
        //AscOrder.sortArray = sortArray;
        int count, temp, lCount=1;

        boolean flag=false;
        System.out.println("inside function");

        while (flag==false) {
            System.out.println("inside while loop");
            flag = true;

            for (count=0; count < sortArray.length-lCount; count++) {
                System.out.println("Inside for loop"+count);
                if(sortArray[count] < sortArray[count+1]) {
                    temp = sortArray[count+1];
                    sortArray[count+1] = sortArray[count];
                    sortArray[count] = temp;
                    flag =false;
                }
            }
            lCount=lCount+1;
        }
    }
}
