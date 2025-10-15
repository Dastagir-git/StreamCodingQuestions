import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestSting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("xyz","das","prabhas", "ram", "das","xyz");

        Optional<String> string=names.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();

        System.out.println(string.get());
    }
}
