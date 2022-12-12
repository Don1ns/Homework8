import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        float[] floatArray = {1.57f, 7.654f, 9.986f};
        int[] arbitraryArray = {99, 12, 443};

        System.out.println("Задача 2");
        System.out.println(integerArray[0] + ", " + integerArray[1] + ", " + integerArray[2]);
        System.out.println(floatArray[0] + ", " + floatArray[1] + ", " + floatArray[2]);
        System.out.println(arbitraryArray[0] + ", " + arbitraryArray[1] + ", " + arbitraryArray[2]);

        System.out.println("Задача 3");
        System.out.println(integerArray[2] + ", " + integerArray[1] + ", " + integerArray[0]);
        System.out.println(floatArray[2] + ", " + floatArray[1] + ", " + floatArray[0]);
        System.out.println(arbitraryArray[2] + ", " + arbitraryArray[1] + ", " + arbitraryArray[0]);

        System.out.println("Задача 4");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i]++;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}