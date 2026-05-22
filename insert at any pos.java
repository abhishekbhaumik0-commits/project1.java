class Main {
    public static void main(String[] args) {

        // Programmer defined array
        int arr[] = new int[6]; // original 5 + 1 extra space

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5; // current number of elements

        int val = 99; // value to insert
        int pos = 2;  // position to insert (0-based index)

        // Shift elements to right
        for(int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert value
        arr[pos] = val;

        // New size becomes n+1
        n++;

        System.out.println("Array after insertion:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
