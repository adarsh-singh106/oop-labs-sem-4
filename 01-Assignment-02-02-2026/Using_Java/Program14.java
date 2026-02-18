/*
Program 14
Java program to display all integers within the range 100–150 whose sum of digits is even
*/
public class Program14 {

    public static void main(String[] args) {
        for(int i = 100; i<=150;i++){
            int temp = i,sum = 0;
            while (temp > 0){
                sum += temp%10;
                temp/=10;
            }
            if (sum%2 == 0)
                System.out.println(i + " --> " + sum);
        }
    }

}
