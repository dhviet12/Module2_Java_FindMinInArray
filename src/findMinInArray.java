
public class findMinInArray {
    public static int minValue(int[] array){
        int min= array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9,-2};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: "+ arr[index]);
    }
}
