package preparation2019;

import org.junit.Assert;
import org.junit.Test;
import preparation2019.TrackMedian;

public class TrackMedianTest {

    @Test
    public void testGetMedian() {
        TrackMedian trackMedian = new TrackMedian();

        trackMedian.add(3);
        trackMedian.add(10);
        trackMedian.add(5);

        Assert.assertEquals(5, trackMedian.getMedian().intValue());
    }
}