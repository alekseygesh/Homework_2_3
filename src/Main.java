import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 2
        double tips = 1242243423323.42313232;
        byte turtleAge = 127;

        //task 3
        int[] myArray = {1, 2, 3, 4, 5};
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = temp;
        if((myArray.length % 2 != 0) & (myArray.length >= 3)){
            int summ = myArray[0] + myArray[(myArray.length-1) / 2];
            System.out.println(summ);
        }
    }
}