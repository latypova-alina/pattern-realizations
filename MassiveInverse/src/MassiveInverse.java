/**
 * Created by alina on 12.06.17.
 */
public class MassiveInverse {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] inversed_array = inverse(array);
        for(int i: inversed_array){
            System.out.println(i);
        }
    }

    public static int[] inverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        return array;
    }
}


