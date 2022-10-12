package KI35.Okilka.Lab5;

public class Calculator   {
    /**
     * Method that calculate by own formula
     * @param x
     * @return result of formula
     */
    public double calculate(double x){

        if(x == 0) throw new RuntimeException("Trying to devide by zero");
        return Math.sin(x) / (Math.cos(8*x)/Math.sin(8*x));
    }
}
