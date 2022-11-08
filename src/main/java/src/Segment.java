package src;

public class Segment
{
    private final double a;
    private final double b;

    public Segment(final double a, final double b)
    {
        if(a<=b)
        {
            this.a=a;
            this.b=b;
        }
        else
        {
            this.a=b;
            this.b=a;
        }
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public Segment(final double start)
    {
        this(start,start+1);
    }

    @Override
    public String toString()
    {
        return "[" + a + ","+ b + ']';
    }

    public boolean contains(final double value)
    {
        return a<=value && value<=b;
    }

}
