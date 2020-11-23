public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 2};
        Bubble bubble = new Bubble();
        bubble.sort(arr);
        bubble.foreach(arr);
        int[] array = {3, 6, 7, 1, 5};
        Choice choice = new Choice();
        choice.sort(array);
        choice.foreach(array);
    }
}
