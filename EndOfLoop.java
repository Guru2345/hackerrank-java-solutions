import java.util.*;
public class EndOfLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(lineNumber + " " + s);
            lineNumber++;
        }
    }
}
}
