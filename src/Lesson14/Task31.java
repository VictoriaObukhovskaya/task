package Lesson14;

public class Task31 {
    public static void main(String[] args) {
        File file = new File("./text.txt");
        String text = "1, 2, 3, 4, 5. Вышел зайчик погулять, запереть его забыли. 1, 2, 3, 4 ";
        File.record(file, text);
        File.read(file);
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                char number = text.charAt(i);
                sum = sum + Character.getNumericValue(number);
                System.out.print("\nnumber in text " + number);
            }
        }
        System.out.print("\nsum of numbers " + sum);
        StringBuilder sb = new StringBuilder();
        text.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.print("\n" + sb);
    }
}

