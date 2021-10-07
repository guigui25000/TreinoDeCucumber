package example;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Steps {

    private Calculadora calculadora = new Calculadora();


    @Dado("^Uma Calculadora$")
    public void uma_calculadora(){
        assertNotNull(calculadora);
    }

    @Quando("^Somar (\\d+) e (\\d+)$")
    public void somar(int n1, int n2){
        calculadora.add(n1,n2);
    }

    @Entao("^O resultado deve ser (\\d+)")
    public void o_resultado_deve_ser(int resultado){
        assertEquals(resultado, calculadora.getResult());
    }

    @Quando("^Multiplicar (\\d+) e (\\d+)")
    public void multiplique(int n1, int n2){
        calculadora.mult(n1,n2);
    }

    @Entao("^O resultado da mult deve ser (\\d+)")
    public void o_resultado_mult_deve_ser(int resultado){
        assertEquals(resultado, calculadora.getResult2());
    }
}
