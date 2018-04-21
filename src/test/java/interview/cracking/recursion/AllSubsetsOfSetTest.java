package interview.cracking.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AllSubsetsOfSetTest {

    @Test
    public void testGetAllSubSets() {
        List<Integer> elements = Arrays.asList(1, 2, 3);
        Set<Integer> set = new HashSet<>(elements);

        Set<Set<Integer>> subsets = AllSubsetsOfSet.returnAllSubsets(set);

        Assert.assertEquals(Factorial.factorial(elements.size()) + 1, subsets.size());
        Assert.assertTrue(subsets.contains(new HashSet<>(Collections.singletonList(1))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Collections.singletonList(2))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Collections.singletonList(3))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1, 2))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1, 3))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Arrays.asList(2, 3))));
        Assert.assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1, 2, 3))));
    }
}