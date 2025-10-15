import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConcatenateStrings {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("xyz","das","prabhas", "ram", "das","xyz");

        String str =names.stream().collect(Collectors.joining(" "));

        System.out.println(str);
    }
}
