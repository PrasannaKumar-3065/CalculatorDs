package pk;
import java.util.*;
import java.util.logging.Logger;

abstract class Calculator{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    private int value;
    abstract void add(int value);
    abstract void sub(int value);
    abstract void mul(int value);
    abstract void div(int value);
    abstract void rem(int value);

    public int getValue(){
        return value;
    }
    public void setValue(int val){
        value = val;
    }
}

public class CalculatorDs extends Calculator{
    void add(int value){
        setValue(getValue()+value);
    }
    void sub(int value){
        setValue(getValue()-value);
    }
    void mul(int value){
        setValue(getValue()*value);
    }
    void div(int value){
        setValue(getValue()/value);
    }
    void rem(int value){
        setValue(getValue()%value);
    }
    static void print(){
        String s = "Result: "+c.getValue();
        LOGGER.info(s);
    }
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    static Calculator c = new CalculatorDs();
    static String msg = "Enter a value: ";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            LOGGER.info(msg);
            int data = sc.nextInt();
            c.setValue(data);
            int l = 0;
            do{
                LOGGER.info("1.Add 2.subract 3.divide 4.multiply 5.clear 6.exit");
                int m = sc.nextInt();
                if(m == 1){
                    LOGGER.info(msg);
                    int value = sc.nextInt();
                    c.add(value);
                    print();
                }
                else if(m == 2){
                    LOGGER.info(msg);
                    int value = sc.nextInt();
                    c.sub(value);
                    print();
                }
                else if(m == 3){
                    LOGGER.info(msg);
                    int value = sc.nextInt();
                    c.div(value);
                    print();
                }
                else if(m == 4){
                    LOGGER.info(msg);
                    int value = sc.nextInt();
                    c.mul(value);
                    print();
                }
                else if(m == 5){
                    c.setValue(0);
                    l = 1;
                }
                else if(m == 6){
                    n=1;
                    l = 1;
                }
            }while(l==0);
        }while(n == 0);
        
    }
}
