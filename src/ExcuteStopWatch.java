public class ExcuteStopWatch {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        st.Start();
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        st.stop();
        System.out.println(st.getElapsedTime());

    }

}
