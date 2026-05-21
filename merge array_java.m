import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n1;
        System.out.println("Enter size of first array:");
        n1 = sc.nextInt();
        int arr[] = new int[n1];
        System.out.println("Enter array elements:");
        for(int i=0 ; i<n1;i++){
             arr[i] = sc.nextInt();
        }
        int n2;
        System.out.println("Enter size of second array:");
        n2 = sc.nextInt();
        int arr1[] = new int[n2];
        System.out.println("Enter array elements:");
        for(int i=0; i<n2; i++){
            arr1[i] = sc.nextInt();
        }
    int merged [] = new int [n1 + n2];
    for(int i=0; i<n1; i++){
        merged[i] = arr[i];
    }
    for(int i=0; i<n2 ; i++){
        merged[n1 + i] = arr1[i];
    }
    System.out.println("Enter merged array:");
    for(int i=0 ; i<merged.length ; i++){
        System.out.println(merged[i]);
    }
}
}
