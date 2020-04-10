package zenvia;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/**
 * @author Daniela Pereira Rigoli
 */
public class CaixaTest { 
    /**
     * Teste do método sacar, da classe Caixa.
     */
    @Test
    public void testSacar() {
        Caixa caixa = new Caixa();
        
        //lembrando no array temos {nota100, nota50, nota20, nota10}
        int[] saque1 = caixa.sacar(200);
        int[] saque2 = caixa.sacar(30);
        int[] saque3 = caixa.sacar(480);
                
        assertArrayEquals(new int[] {2,0,0,0}, saque1);
        assertArrayEquals(new int[] {0,0,1,1}, saque2);
        assertArrayEquals(new int[] {4,1,1,1}, saque3);

    }
    
}
