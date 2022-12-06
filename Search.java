import java.util.Scanner;
class Search {
    public static void main(String args[]) {
        int n, Key;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        System.out.println("Enter Key to be searched");
        Key = s.nextInt();
        int found = 0;
        //use for-each style for to search nums for val
        for (int x: a) {
            if (x == Key) {
                found = 1;
                break;
            }
        }
        if (found == 1)
            System.out.println("Value found");
        else
            System.out.println("Value not found!");
    }
}