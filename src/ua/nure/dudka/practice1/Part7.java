package ua.nure.dudka.practice1;

public class Part7 {
    private static final int NUMBER_SYSTEM = 26;
    private static final int ASCII_CODE = 64;
    public static void main(String[] args) {
        String[] testFields = {"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        int intNumber;
        String stringNumber;
        
        for (String number : testFields) {
            intNumber = str2int(number);
            stringNumber = int2str(intNumber);
            System.out.println(number + " ==> " + intNumber + " ==> " + stringNumber);
        }
    }

    public static int str2int(String number) {
        int result = 0;
        double counter = number.length() - 1.0;

        for (int i = 0; i < number.length(); i++) {
            result += ((number.charAt(i) - ASCII_CODE) * Math.pow(NUMBER_SYSTEM, counter - i));
        }

        return result;
    }

    public static String int2str(int number) {
        int quotient = number;

        if (quotient <= 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        int remainder;
        do {
            remainder = quotient % NUMBER_SYSTEM;
            quotient = quotient / NUMBER_SYSTEM;

            if (remainder == 0) {
                quotient--;
                remainder = NUMBER_SYSTEM;

            }

            result.append((char) (remainder + ASCII_CODE));
        } while (quotient != 0);

        return result.reverse().toString();
    }

    public static String rightColumn(String number) {
        int result = str2int(number);
        return int2str(result + 1);
    }
}
