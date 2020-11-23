import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class Choice implements Container{
    private double[] arrayD;
    public void swap(int[] array, int one, int two){
        array = array;
        int indone = array[one];
        array[one] = array[two];
        array[two] = indone;
    }
    public void sort(int[] array){
        for(int i=0; i < array.length; i++) {
            int anchor = i;
            for (int j = i; j < array.length; j++) {
                if (array[anchor] > array[j]) {
                    anchor = j;
                }
            }
            swap(array, i, anchor);
        }
        System.out.println(Arrays.toString(array));
    }
    public void foreach(int[] array){
        arrayD = new double[array.length];
        for (int i = 0; i < array.length; i ++){
            arrayD[i] = Math.log(array[i]);
        }
        System.out.println(Arrays.toString(arrayD));
    }
}
