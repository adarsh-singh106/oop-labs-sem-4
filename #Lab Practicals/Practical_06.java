import java.util.Random;

public class Practical_06 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("<------- Program Starts Here ------>");
        RandomeNumber thread_1 = new RandomeNumber();
        Square thread_2 = new Square();
        Cube thread_3 = new Cube();

        int num = thread_1.genrateRandom();
        System.out.println("Genrated Random number is " + num);
        if (isEven(num)) {
            thread_2.compute(num);
        } else {
            thread_3.compute(num);
        }
    }
}

class RandomeNumber extends Thread {

    public int genrateRandom() {
        Random random = new Random();
        return random.nextInt(1, 10);
    }
}

class Square extends Thread {

    public void compute(int x) {
        if (x % 2 == 0) {
            System.out.println(x * x);
        }
    }

}

class Cube extends Thread {

    public void compute(int x) {
        if (x % 2 == 1) {
            System.out.println(x * x * x);
        }
    }
}