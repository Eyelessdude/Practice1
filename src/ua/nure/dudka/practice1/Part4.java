package ua.nure.dudka.practice1;

public class Part4 {
    public static void main(String[] args) {
        int firstNymber = Integer.parseInt(args[0]);
        int secondNymber = Integer.parseInt(args[1]);

        while (secondNymber != 0) {
            int temp = firstNymber % secondNymber;
            firstNymber = secondNymber;
            secondNymber = temp;
        }

        System.out.println(firstNymber);
    }
}
