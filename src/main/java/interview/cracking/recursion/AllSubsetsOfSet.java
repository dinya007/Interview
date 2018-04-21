package interview.cracking.recursion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AllSubsetsOfSet {

    public static <T> Set<Set<T>> returnAllSubsets(Set<T> set) {
        Set<Set<T>> result = new HashSet<>(Factorial.factorial(set.size()));

        for (T element : set) {
            HashSet<Set<T>> newSubSets = new HashSet<>();
            for (Set<T> existedSubsets : result) {
                HashSet<T> newSubSet = new HashSet<>(existedSubsets);
                newSubSet.add(element);
                newSubSets.add(newSubSet);

            }
            result.addAll(newSubSets);
            result.add(new HashSet<>(Collections.singletonList(element)));
        }

        return result;
    }

}
