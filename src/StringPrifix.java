import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringPrifix {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("das bas","pra bas", "ram", "das sha");

//        List<String> string=list.stream().filter(str-> str.startsWith("das s")).collect(Collectors.toList());

        List<String> string= list.stream().map(String::toUpperCase).toList();
        System.out.println(string);
    }
}
