import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Stream en java
public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // map()
        System.out.println("Map method in stream");
        list.stream().map(x -> x + 1).forEach(System.out::println);

        // filter()
        System.out.println("Filter method in stream");
        list.stream().filter(x -> x%2 ==0).forEach(System.out::println);

        // sorted()
        System.out.println("Sorted method in stream");
        List<Integer> storedList = Arrays.asList(7,4,5,8,2);
        storedList.stream().sorted().forEach(System.out::println);

        // collect()
        System.out.println("Collect method in stream");
        List<Integer> nbr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> even = nbr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        var result = even.stream().map(x -> x+5).collect(Collectors.toList());
        System.out.println(result);

        // reduce()
        System.out.println("Reduce method in stream");
        int[] nbr2 = {1, 2, 3};
        int somme = Arrays.stream(nbr2).reduce(0, (a, b) -> a + b);
        System.out.println(somme);
    }
}
