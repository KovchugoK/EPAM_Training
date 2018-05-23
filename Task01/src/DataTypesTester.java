public class DataTypesTester {
    public static void testInt(){
        int a = 10, b = 7, c;

        System.out.println("Arifmetical operators: ");
        //add
        c = a + b;
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = a - b;
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = a * b;
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = a / b;
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println();

        System.out.println("Bitwise operators:");
        //bitwise AND
        c = a & b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = a | b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = a >> 1;
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = a >>> 1;
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();

        System.out.println("Assignment operators");
        c = 2;
        System.out.printf("%d += %d ---> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d ---> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d ---> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d ---> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d ---> c = %d\n", c, a, c %= a);


        System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 ---> c = %d\n", c, a, c >>= 1);
        System.out.printf("%d <<= 1 ---> c = %d\n", c, a, c <<= 1);
        System.out.printf("%d >>>= 1 ---> c = %d\n", c, a, c >>>= 1);

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%d > %d ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%d >= %d ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%d < %d ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%d <= %d ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%d == %d ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%d != %d ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%d == %d) && (%d > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%d == %d) & (%d > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%d < %d) || (%d > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%d < %d) | (%d > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%d >  %d) ^ (%d > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%d >  %d) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%d > %d ? %d : %d ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        byte bt = 1;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 1.6789;
        boolean bool = false;

        c = bt;
        System.out.println("int = byte: " + c + " = "+ bt);
        c = sh;
        System.out.println("int = short: " + c + " = "+ sh);
        c = ch;
        System.out.println("int = char: " + c + " = "+ ch);
        c = (int)l;
        System.out.println("int = long: " + c + " = "+ l);
        c = (int)fl;
        System.out.println("int = float: " + c + " = "+ fl);
        c = (int) doub;
        System.out.println("int = double: " + c + " = "+ doub);
        //c = (int)bool;
    }

    public static void testByte(){
        byte a = 20, b = 3, c;

        System.out.println("Arifmetical operators: ");
        //add
        c =  (byte)(a + b);
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = (byte)(a - b);
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = (byte)(a * b);
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = (byte)(a / b);
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = (byte)(a % b);
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = (byte)-a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (byte)+a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println();

        System.out.println("Bitwise operators:");
        //bitwise AND
        c = (byte)(a & b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = (byte)(a | b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = (byte)(a ^ b);
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c =(byte) ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c =(byte) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = (byte)(a >> 1);
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = (byte)(a >>> 1);
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();

        System.out.println("Assignment operators");
        c = 2;
        System.out.printf("%d += %d ---> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d ---> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d ---> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d ---> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d ---> c = %d\n", c, a, c %= a);


        System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 ---> c = %d\n", c, a, c >>= 1);
        System.out.printf("%d <<= 1 ---> c = %d\n", c, a, c <<= 1);
        System.out.printf("%d >>>= 1 ---> c = %d\n", c, a, c >>>= 1);

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%d > %d ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%d >= %d ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%d < %d ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%d <= %d ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%d == %d ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%d != %d ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%d == %d) && (%d > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%d == %d) & (%d > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%d < %d) || (%d > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%d < %d) | (%d > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%d >  %d) ^ (%d > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%d >  %d) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%d > %d ? %d : %d ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        int i = 1;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 9.6789;
        boolean bool = false;

        c = (byte)i;
        System.out.println("byte = int: " + c + " = "+ i);
        c = (byte)sh;
        System.out.println("byte = short: " + c + " = "+ sh);
        c = (byte)ch;
        System.out.println("byte = char: " + c + " = "+ ch);
        c = (byte)l;
        System.out.println("byte = long: " + c + " = "+ l);
        c = (byte)fl;
        System.out.println("byte = float: " + c + " = "+ fl);
        c = (byte) doub;
        System.out.println("byte = double: " + c + " = "+ doub);
        //c = (byte)bool; error
    }

    public static void testShort(){
        short a = 100, b = 70, c;

        System.out.println("Arifmetical operators: ");
        //add
        c =  (short)(a + b);
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = (short)(a - b);
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = (short)(a * b);
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = (short)(a / b);
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = (short)(a % b);
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = (short)-a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (short)+a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println();

        System.out.println("Bitwise operators:");
        //bitwise AND
        c = (short)(a & b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = (short)(a | b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = (short)(a ^ b);
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c =(short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c =(short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = (short)(a >> 1);
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = (short)(a >>> 1);
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();

        System.out.println("Assignment operators");
        c = 2;
        System.out.printf("%d += %d ---> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d ---> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d ---> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d ---> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d ---> c = %d\n", c, a, c %= a);


        System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 ---> c = %d\n", c, 1, c >>= 1);
        System.out.printf("%d <<= 1 ---> c = %d\n", c, 1, c <<= 1);
        System.out.printf("%d >>>= 1 ---> c = %d\n", c, 1, c >>>= 1);

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%d > %d ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%d >= %d ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%d < %d ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%d <= %d ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%d == %d ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%d != %d ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%d == %d) && (%d > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%d == %d) & (%d > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%d < %d) || (%d > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%d < %d) | (%d > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%d >  %d) ^ (%d > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%d >  %d) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%d > %d ? %d : %d ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        int i = 1;
        byte bt = 100;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 9.6789;
        boolean bool = false;

        c = (short)i;
        System.out.println("short = int: " + c + " = "+ i);
        c = bt;
        System.out.println("short = byte: " + c + " = "+ bt);
        c = (short)ch;
        System.out.println("short = char: " + c + " = "+ ch);
        c = (short)l;
        System.out.println("short = long: " + c + " = "+ l);
        c = (short)fl;
        System.out.println("short = float: " + c + " = "+ fl);
        c = (short) doub;
        System.out.println("short = double: " + c + " = "+ doub);
        //c = (byte)bool; error
    }

    public static void testChar(){
        char a = 'k', b = 'b', c;

        System.out.println("Arifmetical operators: ");
        //add
        c =  (char)(a + b);
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        //c = (char)(a - b);
      //  System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = (char)(a * b);
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = (char)(a / b);
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = (char)(a % b);
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        //unari minus
        c = (char)-a;
        System.out.println("-" + a + " = " + c);
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);
       // System.out.println("+" + a + " = " + c);
        //prefix increment
       // System.out.printf("++%s = %s\n", a, ++a);
        //postfix increment
       // System.out.printf("%s++ = %s\n", a, a++);
        //prefix decrement
       // System.out.printf("--%s = %s\n", a, --a);
        //postfix decrement
       // System.out.printf("%s-- = %s\n", a, a--);
       // System.out.println();

        System.out.println("Bitwise operators:");
        //bitwise AND
        c = (char)(a & b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = (char)(a | b);
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = (char)(a ^ b);
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c =(char) ~a;
        System.out.printf("~%s = %s\n", a, c);
        //left shift
        c =(char) (a << 1);
        System.out.printf("%s << 1 = %s\n", a, 1);
        //right shift
        c = (char)(a >> 1);
        System.out.printf("%s >> 1 = %s\n", a, 1);
        //zero fill right shift
        a = 'c';
        c = (char)(a >>> 1);
        System.out.printf("%s >>> 1 = %s\n", a, 1);
        //zero fill right shift
        System.out.println();

        System.out.println("Assignment operators");
        a = 20;
        c = 100;
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c ---> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c ---> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c ---> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c ---> c = %c\n", c, a, c %= a);
        //        c %= 0; java.lang.ArithmeticException: / by zero
//        System.out.printf("%f %%= 0 = %f\n", a, c);
//        c /= 0;
//        System.out.printf("%f /= 0 = %f\n", a, c);


        System.out.printf("%s &= %s ---> c = %s\n", c, a, c &= a);
        System.out.printf("%s |= %s ---> c = %s\n", c, a, c |= a);
        System.out.printf("%s ^= %s ---> c = %s\n", c, a, c ^= a);
        System.out.printf("%s >>= 1 ---> c = %s\n", c, c >>= 1);
        System.out.printf("%s <<= 1 ---> c = %s\n", c, c <<= 1);
        System.out.printf("%s >>>= 1 ---> c = %s\n", c, c >>>= 1);

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        a = '5';
        c = '7';
        System.out.printf("%s > %s ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%s >= %s ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%s < %s ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%s <= %s ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%s == %s ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%s != %s ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        a = '7';
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //bitwise logical ans
        System.out.printf("(%c == %c) & (%c > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%c < %c) || (%c > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%c < %c) | (%c > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%c >  %c) ^ (%c > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%c >  %c) ---> %b\n", a, b,   !(a > b));
        System.out.println();
        a = 'f';
        b = 'k';

        System.out.println("Conditional operator");
        System.out.printf("%c > %c ? %c : %c ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        byte bt = 3;
        short sh = -31777;
        int nt = 231;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) nt;
        System.out.printf("char = int: c = '%c' --> c = %c\n", nt, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);

    }

    public static void testLong(){
        long a = 10000L, b = 122347L, c;

        System.out.println("Arifmetical operators: ");
        //add
        c = a + b;
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = a - b;
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = a * b;
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = a / b;
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        System.out.printf("--%d = %d\n", a, --a);
        //postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println();

        System.out.println("Bitwise operators:");
        //bitwise AND
        c = a & b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = a | b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = a >> 1;
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = a >>> 1;
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();

        System.out.println("Assignment operators");
        a = 10000L;
        b = 122347L;
        System.out.printf("%d += %d ---> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d ---> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d ---> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d ---> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d ---> c = %d\n", c, a, c %= a);


        System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= %d ---> c = %d\n", c, 1, c >>= 1);
        System.out.printf("%d <<= %d ---> c = %d\n", c, 1, c <<= 1);
        System.out.printf("%d >>>= %d ---> c = %d\n", c, 1, c >>>= 1);

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%d > %d ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%d >= %d ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%d < %d ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%d <= %d ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%d == %d ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%d != %d ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%d == %d) && (%d > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%d == %d) & (%d > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%d < %d) || (%d > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%d < %d) | (%d > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%d >  %d) ^ (%d > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%d >  %d) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%d > %d ? %d : %d ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        byte bt = 1;
        int i = 84;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 1.6789;
        boolean bool = false;

        c = bt;
        System.out.println("long = byte: " + c + " = "+ bt);
        c = sh;
        System.out.println("long = short: " + c + " = "+ sh);
        c = ch;
        System.out.println("long = char: " + c + " = "+ ch);
        c = i;
        System.out.println("long = int: " + c + " = "+ i);
        c = (long)fl;
        // can do c = (int)fl;
        System.out.println("long = float: " + c + " = "+ fl);
        c = (long) doub;
        System.out.println("long = double: " + c + " = "+ doub);
        //c = (int)bool;
    }

    public static void testFloat(){
        float a = 1.38427F, b = 122.347F, c;

        System.out.println("Arifmetical operators: ");
        //add
        c = a + b;
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = a - b;
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = a * b;
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = a / b;
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println();

        //there is no bitwise operators
        /*System.out.println("Bitwise operators:");
        //bitwise AND
        c = a & b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = a | b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = a >> 1;
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = a >>> 1;
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();*/


        System.out.println("Assignment operators");
        a = 10000L;
        b = 122347L;
        System.out.printf("%f += %f ---> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f ---> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f ---> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f ---> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f ---> c = %f\n", c, a, c %= a);


       /* System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 ---> c = %d\n", c, a, c >>= 1);
        System.out.printf("%d <<= 1 ---> c = %d\n", c, a, c <<= 1);
        System.out.printf("%d >>>= 1 ---> c = %d\n", c, a, c >>>= 1);*/

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%f > %f ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%f >= %f ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%f < %f ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%f <= %f ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%f == %f ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%f != %f ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%f == %f) && (%f > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%f == %f) & (%f > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%f < %f) || (%f > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%f < %f) | (%f > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%f >  %f) ^ (%f > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%f >  %f) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%f > %f ? %f : %f ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        byte bt = 1;
        int i = 84;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 1.6789;
        boolean bool = false;

        c = bt;
        System.out.println("float = byte: " + c + " = "+ bt);
        c = sh;
        System.out.println("float = short: " + c + " = "+ sh);
        c = ch;
        System.out.println("float = char: " + c + " = "+ ch);
        c = i;
        System.out.println("float = int: " + c + " = "+ i);
        c = l;
        System.out.println("float = long: " + c + " = "+ l);
        c = (float) doub;
        // can do c = (int)fl; c = (long)fl;
        System.out.println("float = double: " + c + " = "+ doub);
        //c = (int)bool;
    }

    public static void testDouble(){
        double a = 56.38563427, b = 234.347, c;

        System.out.println("Arifmetical operators: ");
        //add
        c = a + b;
        System.out.println( a + " + " + b + " = "  + c);
        //sub
        c = a - b;
        System.out.println( a + " - " + b + " = "  + c);
        //mul
        c = a * b;
        System.out.println(a + " * " + b + " = "  + c);
        //div
        c = a / b;
        System.out.println(a + " / " + b + " = "  + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = "  + c);
        //assignment
        a = 9;
        //unari minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.printf("++%f = %f\n", a, ++a);
        //postfix increment
        System.out.printf("%f++ = %f\n", a, a++);
        //prefix decrement
        System.out.printf("--%f = %f\n", a, --a);
        //postfix decrement
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println();

        //there is no bitwise operators
        /*System.out.println("Bitwise operators:");
        //bitwise AND
        c = a & b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise OR
        c = a | b;
        System.out.println(a + " & " + b + " = "  + c);
        //bitwise XOR
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = "  + c);
        //bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        //left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        //right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        //right shift
        a = -10;
        c = a >> 1;
        System.out.printf("-%d >> 1 = %d\n", a, c);
        //zero fill right shift
        a = 10;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        //zero fill right shift
        a = -10;
        c = a >>> 1;
        System.out.printf("-%d >>> 1 = %d\n", a, c);
        System.out.println();*/


        System.out.println("Assignment operators");
        a = 10000L;
        b = 122347L;
        System.out.printf("%f += %f ---> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f ---> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f ---> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f ---> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f ---> c = %f\n", c, a, c %= a);


       /* System.out.printf("%d &= %d ---> c = %d\n", c, a, c &= a);
        System.out.printf("%d |= %d ---> c = %d\n", c, a, c |= a);
        System.out.printf("%d ^= %d ---> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 ---> c = %d\n", c, a, c >>= 1);
        System.out.printf("%d <<= 1 ---> c = %d\n", c, a, c <<= 1);
        System.out.printf("%d >>>= 1 ---> c = %d\n", c, a, c >>>= 1);*/

        System.out.println();
        System.out.println("Relational operators:");

        //grater than
        System.out.printf("%f > %f ---> %b\n", c, a, c > a);
        //grater than or equal to
        System.out.printf("%f >= %f ---> %b\n", c, a, c >= a);
        //less than
        System.out.printf("%f < %f ---> %b\n", c, a, c < a);
        //less than or equal to
        System.out.printf("%f <= %f ---> %b\n", c, a, c <= a);
        //equal to
        System.out.printf("%f == %f ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%f != %f ---> %b\n", c, a, c != a);
        System.out.println();

        System.out.println("Logical operators:");
        //logical and
        System.out.printf("(%f == %f) && (%f > 0) ---> %b\n", a, b, a,  (a == b) && (a != 0));
        //bitwise logical and
        System.out.printf("(%f == %f) & (%f > 0) ---> %b\n", a, b, a,  (a == b) & (a != 0));
        //logical or
        System.out.printf("(%f < %f) || (%f > 0) ---> %b\n", a, b, a,  (a < b) || (a > 0));
        //bitwise logical or
        System.out.printf("(%f < %f) | (%f > 0) ---> %b\n", a, b, a,  (a < b) | (a > 0));
        //logical xor
        System.out.printf("(%f >  %f) ^ (%f > 0) ---> %b\n", a, b, a,  (a > b) ^ (a > 0));
        //logical not
        System.out.printf("!(%f >  %f) ---> %b\n", a, b,   !(a > b));
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf("%f > %f ? %f : %f ---> %b\n", a, b, a, b, (a > b ? a : b));
        System.out.println();

        byte bt = 1;
        int i = 84;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 1.6789;
        boolean bool = false;

        c = bt;
        System.out.println("double = byte: " + c + " = "+ bt);
        c = sh;
        System.out.println("double = short: " + c + " = "+ sh);
        c = ch;
        System.out.println("double = char: " + c + " = "+ ch);
        c = i;
        System.out.println("double = int: " + c + " = "+ i);
        c = l;
        System.out.println("double = long: " + c + " = "+ l);
        c = fl;
        // can do c = (int)fl; c = (long)fl;
        System.out.println("double = float: " + c + " = "+ fl);
        //c = (int)bool;
    }

    public static void testBoolean(){
        boolean a = true, b = false, c = false;
        System.out.printf("%b|%b: " + (a | b) + '\n', a, b);
        System.out.printf("%b&%b: " + (a & b) + '\n', a, b);
        System.out.printf("%b^%b: " + (a ^ b) + '\n', a, b);
        System.out.println();

        System.out.println("Assignment operators");
        System.out.printf("%b &= %b ---> c = %b\n", c, a, c &= a);
        System.out.printf("%b |= %b ---> c = %b\n", c, a, c |= a);
        System.out.printf("%b ^= %b ---> c = %b\n", c, a, c ^= a);

        //equal to
        System.out.printf("%b == %b ---> %b\n", c, a, c == a);
        //not equal to
        System.out.printf("%b != %b ---> %b\n", c, a, c != a);

        System.out.println("Logical operators:");
        //logical and
        c = a&&b;
        System.out.printf("(%b == %b) = %b\n", a, b, c);
        //logical or
        c = a||b;
        System.out.printf("(%b == %b) = %b\n", a, b, c);
        //logical not
        c = !a;
        System.out.printf("(%b == %b) = %b\n", a, b, c);
        System.out.println();

        System.out.println("Conditional operator");
        System.out.printf(" %b ? %b : %b --> %b", c, a, b, (c ? a : b));
        System.out.println();
        int i = 1;
        byte bt = 23;
        short sh = 2345;
        char ch = 'a';
        long l = 100000000000L;
        float fl = 1.5F;
        double doub = 9.6789;
        boolean bool = false;

       /* c = (boolean)i;
        System.out.println("boolean = int: " + c + " = "+ i);
        c = (boolean)sh;
        System.out.println("boolean = short: " + c + " = "+ sh);
        c = (boolean)ch;
        System.out.println("boolean = char: " + c + " = "+ ch);
        c = (boolean)l;
        System.out.println("boolean = long: " + c + " = "+ l);
        c = (boolean)fl;
        System.out.println("boolean = float: " + c + " = "+ fl);
        c = (boolean) doub;
        System.out.println("boolean = double: " + c + " = "+ doub);
        c = (boolean) bt;
        System.out.println("boolean = byte: " + c + " = "+ bt);
        */

    }

}
