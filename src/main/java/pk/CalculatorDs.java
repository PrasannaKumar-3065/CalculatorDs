package pk;

import java.util.*;
import java.util.logging.Logger;

public class CalculatorDs extends Calculator {
    public void add(double value) {
        setValue(getValue() + value);
    }

    public void sub(double value) {
        setValue(getValue() - value);
    }

    public void mul(double value) {
        setValue(getValue() * value);
    }

    public void div(double value) {
        setValue(getValue() / value);
    }

    public void rem(double value) {
        setValue(getValue() % value);
    }

    public static void prdouble() {
        String s = "Result: " + c.getValue();
        LOGGER.info(s);
    }

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    static Calculator c = new CalculatorDs();
    static String msg = "Enter a value: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        do {
            LOGGER.info(msg);
            double data = sc.nextDouble();
            c.setValue(data);
            double l = 0;
            do {
                try {
                    LOGGER.info("1.Add 2.subract 3.divide 4.multiply 5.clear 6.exit");
                    double m = sc.nextDouble();
                    if (m == 1) {
                        LOGGER.info(msg);
                        double value = sc.nextDouble();
                        c.add(value);
                        prdouble();
                    } else if (m == 2) {
                        LOGGER.info(msg);
                        double value = sc.nextDouble();
                        c.sub(value);
                        prdouble();
                    } else if (m == 3) {
                        LOGGER.info(msg);
                        double value = sc.nextDouble();
                        c.div(value);
                        prdouble();
                    } else if (m == 4) {
                        LOGGER.info(msg);
                        double value = sc.nextDouble();
                        c.mul(value);
                        prdouble();
                    } else if (m == 5) {
                        c.setValue(0);
                        l = 1;
                    } else if (m == 6) {
                        n = 1;
                        l = 1;
                    }
                } catch (Exception e) {
                    String s = ""+e;
                    LOGGER.info(s);
                    sc.nextLine();
                }
            } while (l == 0);
        } while (n == 0);

    }
}
