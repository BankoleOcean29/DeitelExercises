package ChapterFour;

public class Calculate {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x <= 10) {
            sum += x;
            x++;
        }

        System.out.println(sum);
    }
}