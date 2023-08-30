import java.util.*;

public class i_StringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
