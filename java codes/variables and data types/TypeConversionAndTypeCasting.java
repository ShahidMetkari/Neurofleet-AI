public class TypeConversionAndTypeCasting {
    public static void main(String[] args) {
        // ek type ka data dusre type ke data me convert karna means type conversion
        int a = 25;
        long b = a;
        // System.out.println(b); // this will run
        // int to long convert hoga par long to int nahi
        // jiska size chhota hai vo bade me convert hoga but bade se chhota nahi hoga
        // byte>short>int>float>long>double
        // to ye apne aap convert nahhi karta java,
        // chhote se bade me convert ho sakte hai , and this is called implicit/
        // widening conversion

        // TYPE CASTING
        // isme ham conversion karte hai jise jaava allow nahi karta
        // eg. float to int
        // isme loss ho sakta hai
        float c = 25.12f;
        int d = (int) c;
        System.out.println(d);
    }
}