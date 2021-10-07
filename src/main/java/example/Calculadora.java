package example;

public class Calculadora {

    private int result;

    private int result2;

    public void add(int n1, int n2){
        this.result = n1 + n2;
    }

    public int getResult(){
        return result;
    }

    public void mult(int n1, int n2){
        this.result2 = n1*n2;
    }

    public int getResult2(){
        return result2;
    }
}
