public class ConceptOfWideningAndNarrowing
{
    public static void main(String[]args)
    {
        byte b=12;
        short s=234;
        s = b;    //widening
        System.out.println(b);  //12
        b = (byte)s;    //narrowing
        System.out.println(b);  //234
    }
}
