import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String champion = "";
        int count = 0;

        while(sc.hasNext()) {
            String word = sc.next();
            count++;

            if(Math.random() < 1.0 / count) {
                champion = word;
            }
        }

        System.out.println("The champion word is: "+ champion );

    }
}
