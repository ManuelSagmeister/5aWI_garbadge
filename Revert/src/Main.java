import java.util.Random;

public class Main {

    public static void main(String[] args){
        int[] randomArray = getRandomArray(10, 100);
    }




    public static int[] getRandomArray(int size, int randomSize) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            Random randomValue = new Random();
            randomArray[i] = randomValue.nextInt(randomSize);
        }
        return randomArray;
    }
}