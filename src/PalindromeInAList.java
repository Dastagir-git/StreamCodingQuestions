import java.util.Arrays;
import java.util.List;

public class PalindromeInAList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aba","abc","434");

        List<String> res =list.stream().filter(s -> s.contentEquals(new StringBuilder(s).reverse())).toList();

        System.out.println(res);

    }
}
