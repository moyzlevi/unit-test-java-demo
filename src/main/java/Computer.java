public class Computer {

    private Calculator calculator;

    public Computer(Calculator calculator) {this.calculator = calculator;}

    public double average(int a,int b){return calculator.divide(calculator.add(a,b),2);}

}
