import Calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() throws Exception {
        calculadora = new Calculadora();
    }

    @Test
    public void Una_nueva_calculadora_debe_iniciar_en_cero() {
        Assert.assertEquals(0, calculadora.valor());
    }

    @Test
    public void Sumar_2_mas_3_debe_dar_5() {
        calculadora.suma(2,3);
        Assert.assertEquals(5,calculadora.valor());
    }

    @Test
    public void Sumar_4_mas_3_debe_dar_7() {
        calculadora.suma(4,3);
        Assert.assertEquals(7,calculadora.valor());
    }

    @Test
    public void El_valor_de5_a_la_3es_125() {
        calculadora.multiplicacion(5, 3);
        Assert.assertEquals(125, calculadora.valor());
    }

    @Test
    public void al_ingresar_2valores_se_realizan_las_4_operaciones_aritmeticas() {
        calculadora.OperacionAritmetica(9, 8);
        Assert.assertEquals(17, calculadora.valor() );
    }
}
