import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class maxInteger {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>();
        System.out.println("Please enter 5 number: ");
        for (int i= 0 ; i < 5 ; i++ ) {

            iList.add(sc.nextInt());
        }
        int max = iList.get(0);
        for (int x: iList){

            if(x > max){
                max = x;
            }
        }
        System.out.println("The minimum value of your list is: " + max);
    }
}
