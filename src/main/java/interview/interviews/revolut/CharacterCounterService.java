package interview.interviews.revolut;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterCounterService {

    public static Map<Character, Integer> count(Stream<Character> input) {
        if (input == null) {
            throw new IllegalArgumentException("...");
        }

        return input.collect(Collectors.toMap(t -> t, t -> 1, Integer::sum));
    }

}
