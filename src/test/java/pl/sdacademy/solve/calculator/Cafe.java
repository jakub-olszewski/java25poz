package pl.sdacademy.solve.calculator;

public class Cafe {

    boolean hasCafe;

    public Cafe(){
        hasCafe = false;
    }

    public void serveCoffe() {
        hasCafe = true;
    }

    public boolean canServeCoffee() {
        return hasCafe;
    }
}
