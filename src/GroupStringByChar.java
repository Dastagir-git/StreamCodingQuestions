import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByChar {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("xyz","xas","prabhas", "ram", "das","pv");

       Map<Character,List<String>> res= names.stream().collect(Collectors.groupingBy(s->s.charAt(0)));

       System.out.println(res);
    }
}
