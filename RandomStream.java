import java.util.stream.Collectors;
import java.util.stream.Stream;

class RandomAlgorithm{
    private long a, c, m, seed;
    RandomAlgorithm(long a, long c, long m, long seed){
        this.a = a;
        this.c = c;
        this.m = m;
        this.seed = seed;
    }
    public long getSeed(){
        return seed;
    }

    public long getA() {
        return a;
    }

    public long getC() {
        return c;
    }

    public long getM() {
            return m;
    }
}
public class RandomStream {
    public static void main(String[] args) {
        RandomAlgorithm r = new RandomAlgorithm(25214903917L, 11L, (long) Math.pow(2, 48), 1L);
        try {
            Stream<Long> stream = Stream.iterate(
                    r.getSeed(), x -> 1 * (r.getA() * x + r.getC()) % r.getM()
            );
            stream.limit(10)
                    .forEach(System.out::println);
        }catch (Exception ex){
            System.out.println("You try to divide by zero!");
        }
    }
}
