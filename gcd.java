// public class gcd {
//     public static int gcd_no(int num1, int num2) {
//         while (num1 > 0 && num2 > 0) {
//             if (num1 > num2) {
//                 num1 = num1 % num2;
//             } else {
//                 num2 = num2 % num1;
//             }
//         }
//         if (num1 == 0) {
//             return num2;
//         } else {
//             return num1;
//         }

//     }

//     public static void main(String[] args) {
//         int num1 = 5;
//         int num2 = 15;
//         int result = gcd_no(num1, num2);
//         System.out.println(result);
//     }
// }
import java.util.Scanner;

public class gcd {
    public static int gcd_no(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        if (num1 == 0) {
            return num2;
        } else {
            return num1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = sc.nextInt(n);
        int num2 = sc.nextInt(n);
        int result = gcd_no(num1, num2);
        System.out.println(result);
    }
}
