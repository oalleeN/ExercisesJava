import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Alan");
        set.add("Rafael");
        set.add("Lucas");

        set.removeIf(x -> x.length() >= 4);

        for (String s : set) {
            System.out.println(s);
        }
    }
}