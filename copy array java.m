import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // copy array
        for (int i = 0; i < n; i++) {
            a[i] = arr[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
