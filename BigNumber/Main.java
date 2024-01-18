ggdpackage BigNumber;

import java.math.BigInteger;

 class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(34);
        BigInteger C = new BigInteger("3728397520");
        BigInteger x = new BigInteger("89");
        // constants
        BigInteger D = BigInteger.ONE;

        BigInteger s = C.add(x);
        int r = C.intValue();
        
        BigInteger x2 = C.multiply(x);

        // System.out.println(x2);

        System.out.println(Factorial.fact(345));

    }

}
