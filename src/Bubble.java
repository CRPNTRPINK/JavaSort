import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble implements Container{
    private double[] arrayD;
    @Override
    public void sort(int[] array){
        boolean flag = false;
        while(!flag){
            flag = true;
            for (int i=0;i<array.length - 1;i++){
                if (array[i + 1] < array[i]){
                    int anchor = array[i];
                    array[i] = array[i+1];
                    array[i+1] = anchor;
                    flag = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void foreach(int[] array){
        arrayD = new double[array.length];
        for (int i=0; i < array.length; i++){
            arrayD[i] = Math.sqrt(array[i]);
        }
        System.out.println(Arrays.toString(arrayD));
    }
}
