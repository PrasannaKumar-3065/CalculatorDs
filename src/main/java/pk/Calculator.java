package pk;

import java.util.logging.Logger;

public abstract class Calculator {
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
