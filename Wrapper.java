public class Wrapper {
    public static Integer test1(String s)
    {
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        Integer b=Integer.valueOf("0123456");//return type->object (Integer)
        Integer c=Integer.parseInt("09766");//return type->primitive int
        Integer x=128;
        Integer y=128;
        System.out.println(x==y);
        System.out.println(x.equals(y));
        int a=b.intValue();//unboxing(optional method it automatically calls)
        System.out.println(a);
        System.out.println(test1("232"));
    }
}
