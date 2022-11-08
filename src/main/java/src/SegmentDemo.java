package src;

public class SegmentDemo
{
    public static void main(String[] args)
    {
        final Segment segment1 = new Segment(3.0,5.0);
        final Segment segment2= new Segment(5.0,3.0);

//        System.out.println("["+segment1.getA()+","+segment1.getB()+"]");
//        System.out.println("["+segment2.getA()+","+segment2.getB()+"]");

        System.out.println(segment1);
        System.out.println(segment2);
    }

}
