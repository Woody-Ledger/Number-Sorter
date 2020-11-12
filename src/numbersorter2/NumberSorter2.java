
package numbersorter2;

import java.util.Scanner;
import java.util.Arrays;

public class NumberSorter2 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int x = 0;
        double average = 0;
        
        System.out.println("How many numbers are you going to put in?");
        int nums = input.nextInt();
        System.out.println("Input your numbers one at a time.");
        int[]num = new int [nums];
        for(i = 0; i < nums; i++){
            num[i] = input.nextInt();
    }
        
        for(i = 0; i < nums; i++){
            for(int s = 0; s < nums; s++){
                int ord = 0;
                if(num[i] > num[s]){
                    ord = num[i];
                    num[i] = num[s];
                    num[s] = ord;
                }
            }
        }
        System.out.println();
        for(i = 0; i < nums; i++){
            System.out.print(num[i] + " ");
        }
        
        for(i = 0; i < nums; i++){
            x = x + num[i];
        }
        
        average = (double) x/i;
        
        System.out.println();
        System.out.println("The minimum number is " + num[nums - 1]);
        System.out.println("The maximum number is " + num[0]);
        System.out.println("The average number is " + average);
    }
    
}
