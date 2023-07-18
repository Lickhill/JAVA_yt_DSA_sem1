public class radixsort {

    static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findthemaxele(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    static void countarray(int arr[], int digit, int j) {
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / j) % 10]++;
        }

        newcountcumulative(count, arr, j, digit);
    }

    static void newcountcumulative(int count[], int arr[], int j, int digit) {

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        newarray(count, arr, j, digit);
    }

    static void newarray(int count[], int arr[], int j, int digit) {
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }

        for (int i = newarr.length - 1; i >= 0; i--) {
            arr[count[(newarr[i] / j) % 10] - 1] = newarr[i];
            count[(newarr[i] / j) % 10]--;
        }
        if (j == Math.pow(10, digit - 1))
            display(arr);
    }

    static void radix(int arr[]) {
        int max = findthemaxele(arr);
        int count = 0;
        while (max > 0) {
            max /= 10;
            count++;
        }
        int j = 1;
        for (int i = 1; i <= count; i++) {
            countarray(arr, count, j);
            j *= 10;
        }

    }

    public static void main(String args[]) {
        // int arr[] = { 5, 4, 6, 7, 8, 4, 3, 12, 0, 8, 4, 5, 4, 4 };
        int arr[] = { 17, 2, 45, 807, 0, 89, 345, 32, 6, 7, 8, 34567 };
        // int arr[] = { 2, 3, 2, 4, 0, 1, 4, 1, 0, 2 };
        radix(arr);

    }

}
