package ua.nure.dudka.practice1;

public class Part6 {
    private static boolean isPrime(int var) {
        int divider = 2;

        if (var < divider) {
            return false;
        }

        double s = Math.sqrt(var);
        for (int i = divider; i <= s; i++) {
            if (var % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int [] array = new int[limit];
        int value = 2;
        int indexK = 0;

        while (indexK < limit) {
            while (indexK != limit) {
                if (isPrime(value)) {
                    array[indexK] = value;
                    System.out.print(value + " ");

                    indexK++;
                }
                value++;
            }
        }


    }
}
