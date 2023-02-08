package pk;
import java.util.*;
import java.util.logging.Logger;

abstract class calculator{
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

public class CalculatorDs extends calculator{
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
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    static calculator c = new CalculatorDs();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            LOGGER.info("Enter a value: ");
            int data = sc.nextInt();
            c.setValue(data);
            int l = 0;
            do{
                LOGGER.info("1.Add 2.subract 3.divide 4.multiply 5.clear");
                int m = sc.nextInt();
                if(m == 1){
                    LOGGER.info("Enter a value: ");
                    int value = sc.nextInt();
                    c.add(value);
                    String s = "Result: "+c.getValue();
                    LOGGER.info(s);
                }
                else if(m == 2){
                    LOGGER.info("Enter a value: ");
                    int value = sc.nextInt();
                    c.sub(value);
                    String s = "Result: "+c.getValue();
                    LOGGER.info(s);
                }
                else if(m == 3){
                    LOGGER.info("Enter a value: ");
                    int value = sc.nextInt();
                    c.div(value);
                    String s = "Result: "+c.getValue();
                    LOGGER.info(s);
                }
                else if(m == 4){
                    LOGGER.info("Enter a value: ");
                    int value = sc.nextInt();
                    c.mul(value);
                    String s = "Result: "+c.getValue();
                    LOGGER.info(s);
                }
                else if(m == 5){
                    c.setValue(0);
                    l = 1;
                }
            }while(l==0);
        }while(n == 0);
        
    }
}
