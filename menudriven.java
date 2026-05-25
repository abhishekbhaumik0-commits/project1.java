import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];
        int n, ch, val, pos;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {

                case 1:

                    System.out.print("Enter value: ");
                    val = sc.nextInt();

                    for(int i = n; i > 0; i--) {
                        a[i] = a[i - 1];
                    }

                    a[0] = val;
                    n++;

                    break;

                case 2:

                    System.out.print("Enter value: ");
                    val = sc.nextInt();

                    a[n] = val;
                    n++;

                    break;

                case 3:

                    System.out.print("Enter position: ");
                    pos = sc.nextInt();

                    System.out.print("Enter value: ");
                    val = sc.nextInt();

                    for(int i = n; i > pos; i--) {
                        a[i] = a[i - 1];
                    }

                    a[pos] = val;
                    n++;

                    break;

                case 4:

                    System.out.println("Array elements are:");

                    for(int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }

                    System.out.println();

                    break;

                case 5:

                    System.out.println("Program End");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(ch != 5);
    }
}
