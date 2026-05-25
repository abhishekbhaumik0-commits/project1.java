import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int n;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // delete last element
        if(n == 0) {
            System.out.println("Array is empty, nothing to delete");
        } else {
            n = n - 1;   // just reduce size
        }

        System.out.println("Array after deleting last element:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
