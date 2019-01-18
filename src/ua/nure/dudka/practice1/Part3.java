package ua.nure.dudka.practice1;

public class Part3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            stringBuilder.append(args[i]).append(" ");
        }
        System.out.print(stringBuilder.toString().trim());
    }
}
