import java.util.Scanner;

class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        String result = str.replace('d', 'f');

        // Display result
        System.out.println("Modified string: " + result);

        sc.close();
    }
}
