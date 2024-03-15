pgdpackage BigNumber;
import java.util.*;
import java.math.BigDecimal;

public class BigDecimalMain {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        // double ans = y - x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

        System.out.println(X.add(Y));
        System.out.println(Y.multiply(X));
        System.out.println(Y.pow(2));
        System.out.println(Y.negate());
    }
}
