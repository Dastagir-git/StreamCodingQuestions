import java.util.Arrays;
import java.util.List;

public class ReverseStringInAList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abz","abc","435");

        List<String> list2=  list.stream().map(s -> String.valueOf(new StringBuilder(s).reverse())).toList();

        System.out.println(list2);
    }
}
