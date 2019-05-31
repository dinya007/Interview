package preparation2019.datastructure.arrayandstrings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramDetectorTest {

    @Test
    public void testIsAnagramTrue1() {
        Assert.assertTrue(AnagramDetector.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramTrue2() {
        Assert.assertTrue(AnagramDetector.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramFalse1() {
        Assert.assertFalse(AnagramDetector.isAnagram("listenn", "silent"));
    }

    @Test
    public void testIsAnagramFalse2() {
        Assert.assertFalse(AnagramDetector.isAnagram("listen", "silentt"));
    }

    @Test
    public void testIsAnagramFalse3() {
        Assert.assertFalse(AnagramDetector.isAnagram("listenr", "silentk"));
    }

}
