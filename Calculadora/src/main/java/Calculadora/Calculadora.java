package Calculadora;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Calculadora {

    private int resultado=0;
    private int primernumero=0;
    private int segundonumero=0;

    public int valor() {
        return resultado;
    }

    public void suma(int primernumero, int segundonumero) {
        this.primernumero=primernumero;
        this.segundonumero=segundonumero;
        resultado=primernumero+segundonumero;
    }

    public void multiplicacion(int primernumero, int segundonumero) {

        int multi=1;

        for (int i = 0; i < segundonumero; i++) {
            this.resultado=multi*primernumero;
            multi=this.resultado;

        }

    }

    public void OperacionAritmetica(int primernumero, int segundonumero) {
        int[] aritmetico = new int[4];

        aritmetico[0]=aritmetico[primernumero+segundonumero];

        this.resultado=aritmetico[0];
    }
}
