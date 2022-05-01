import java.util.Scanner;

public class PerfectNumber {
    public void findPerf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int num = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println(num + " mükemmel sayıdır.");
        } else {
            System.out.println(num + " mükemmel sayı değildir.");
        }

    }
}
