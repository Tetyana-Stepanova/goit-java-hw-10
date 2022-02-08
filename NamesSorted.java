import java.util.*;
import java.util.stream.Collectors;


public class NamesSorted {
    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Tanya", "Ivan", "Arina", "Tymur", "Tamara");
        List<String> result = listNames.stream()
                .map(x -> x.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

                result.forEach(x ->{
                    if(result.get(result.size()-1).equals(x)){
                        System.out.format("%s",x);
                    }
                    else{
                        System.out.format("%s, ", x);
                    }
                });
    }
}
