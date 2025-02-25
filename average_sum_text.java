// Finding the average of the elements. The elements are present in text.
// Example :
// user input values = "This is number 45",
//                     "This is number 20",
//                     "This is number 30"
// Output :
// Average = 31.667

import java.util.Scanner;
public class average_sum_text {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] array = {"This is number 45", "This is number 20", "This is number 30"};
        int avg =0;
        int sum =0;
        for(int i = 0;i <array.length;i++){
            // String str = input.nextLine();

            String name = array[i].substring(15);

            // int number = Integer.parseInt(name);
            int number = Integer.parseInt(name);
            sum +=number;
            
        }
       avg = sum / array.length;
       System.out.println(avg);
       input.close();
    }
}
