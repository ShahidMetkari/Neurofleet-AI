public class TypePromotion {
    // java automatically promotes each byte, short, or char operand to int when
    // evaluating an expression.
    //
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(a - b); // -1
        // type promotion sirf tab hota hai jab operations ho rhe ho us expression pe
        // agar hamne a print karaya aabhi to a hi print hoga pr agar a-b print karaya
        // to -1 print hoga

        // 2. if one operand is long, float or double the whole expression is promoted
        // to long, float, or double respectively.

    }
}
