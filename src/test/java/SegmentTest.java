import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Segment;

public class SegmentTest
{
    @Test
    public void shouldCheckIfCorrectlyConstructed()
    {
        final Segment segment = new Segment(3.0,5.0);

        Assertions.assertEquals(3.0,segment.getA());
        Assertions.assertEquals(5.0,segment.getB());
    }

    @Test
    public void shouldCreateSegmentWithReversedValue()
    {
        final Segment segment = new Segment(5.0,3.0);

        Assertions.assertEquals(3.0,segment.getA());
        Assertions.assertEquals(5.0,segment.getB());
    }
}
