import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Сумма с использованием цикла " + sumByFor(12,3));
        System.out.println("Сумма с использованием рекурсии " + sumByRecursion(12,3));

    }
    public static int sumByFor(int n, int m) {
       int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % m == 0) {
                sum += i;
            }
            
        }
        return sum;
    }


        public static int sumByRecursion(int n, int m) {
            if (n < m) {
                return 0;
            } else {
                return (n % m == 0 ? n : 0) + sumByRecursion(n - 1, m);
            }
        }
    }