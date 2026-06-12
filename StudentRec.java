import java.util.Scanner;

public class StudentRec{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects=");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the marks of each subject:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Total Marks = " + total(a,n));
        System.out.println("Highest Mark = " + high(a, n));
        System.out.println("Lowest Mark = " + low(a, n));
        System.out.println("Average Mark = " + avg(total(a,n), n));
    }

    static int total(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    static int high(int a[], int n) {
        int high =0;
        for (int i =0; i < n; i++) {
            if (a[i] > high) {
                high = a[i];
            }
        }
        return high;
    }

    static int low(int a[], int n) {
        int low = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i]<low) {
                low = a[i];
            }
        }
        return low;
    }
    static int avg(int s, int n) {
        return s / n;
    }
}