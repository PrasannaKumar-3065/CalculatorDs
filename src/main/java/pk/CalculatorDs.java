package pk;

import java.util.*;
import java.util.logging.Logger;

abstract class Calculator {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private double value;

    abstract void add(double value);

    abstract void sub(double value);

    abstract void mul(double value);

    abstract void div(double value);

    abstract void rem(double value);

    public double getValue() {
        return value;
    }

    public void setValue(double val) {
        value = val;
    }
}

public class CalculatorDs extends Calculator {
    void add(double value) {
        setValue(getValue() + value);
    }

    void sub(double value) {
        setValue(getValue() - value);
    }

    void mul(double value) {
        setValue(getValue() * value);
    }

    void div(double value) {
        setValue(getValue() / value);
    }

    void rem(double value) {
        setValue(getValue() % value);
    }

    static void prdouble() {
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
