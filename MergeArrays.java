import java.util.Arrays;

public class MergeArrays 
{
    public static void main(String[] args) {
        int[] array1 = {11, 12, 45};
        int[] array2 = {51, 63, 72};

        int length1 = array1.length;
        int length2 = array2.length;

        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}