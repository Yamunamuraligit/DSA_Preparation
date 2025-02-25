//#1
//User enter the input values, we are finding the sum of multiples of user values.
//Example:
//User_entered : 10
//Output: 10*1 + 10*2 + 10*3 + 10*4 + 10*5 + 10*6 + 10*7 + 10*8 + 10*9 + 10*10
//Output : 550

import java.util.*;
class sum_of_multiples_of_n
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user value: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            int number = i*num;
                sum += number;
        }
        System.out.println(sum);
        sc.close();
    }
}