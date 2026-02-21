/*
Program 36
Java program to sum even numbers from 1 to 100 using for loop
*/
public class Program36 {
    public static boolean isEven(int n){
        return n%2 == 0;
    }

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 101 ; i++){
            if (isEven(i))
                sum+=i;
        }
        System.out.println("sum even numbers from 1 to 100 using for loop is " + sum);
    }

}
