/*
Program 13
Java program to display all the multiples of 3 within the range 10 to 50
*/
public class Program13 {

    public static void main(String[] args) {
        System.out.println("Multiples of 3 in range of [10,50] \n");
        for(int i = 10 ;i <= 50 ;i++){
            if (i % 3 == 0)
                System.out.println(i);
        }
    }

}
