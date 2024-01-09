import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] arr) {
        while (true) {
            int sub, swap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sub = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = sub;
                    swap++;
                }
            }
            if (swap == 0)
            {
                break;
            }
        }

        return arr;

    }

    public static String[] bubbleSort(String[] arr) {
        while (true) {
            String sub = "";
            int swap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1]) > 0) {
                    sub = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = sub;
                    swap++;
                }
            }
            if (swap == 0)
            {
                break;
            }
        }

        return arr;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        while (true) {
            int sub = 0, swap = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i+1)) {
                    sub = arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,sub);
                    swap++;
                }
            }
            if (swap == 0)
            {
                break;
            }
        }

        return arr;

    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length;j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int sub = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = sub;
        }

        return arr;

    }

    public static String[] selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length;j++) {
                if (arr[j].compareToIgnoreCase(arr[smallest])< 0) {
                    smallest = j;
                }
            }
            String sub = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = sub;
        }

        return arr;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int smallest = i;
            for (int j = i+1; j < arr.size();j++) {
                if (arr.get(j).compareToIgnoreCase(arr.get(smallest)) < 0) {
                    smallest = j;
                }
            }
            String sub = arr.get(i);
            arr.set(i,arr.get(smallest));
            arr.set(smallest,sub);
        }
        return arr;

    }

}
