import org.example.Funcionario;
import org.example.FuncionarioStateAlocado;
import org.example.FuncionarioStateDesligado;
import org.example.FuncionarioStateFerias;
import org.example.FuncionarioStateFolga;
import org.example.FuncionarioStateOcioso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setup(){
        funcionario = new Funcionario();
    }

    //Funcionario alocado


    @Test
    void deveIniciarFeriasFuncionarioAlocado(){
        assertTrue(funcionario.iniciarFerias());
        assertEquals(FuncionarioStateFerias.getInstance(), funcionario.getFuncionarioState());
    }
    @Test
    void deveFolgarFuncionarioAlocado(){
        assertTrue(funcionario.folgar());
        assertEquals(FuncionarioStateFolga.getInstance(), funcionario.getFuncionarioState());
    }
    @Test
    void deveDesligarFuncionarioAlocado(){
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioStateDesligado.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveFicarOciosoFuncionarioAlocado(){
        assertTrue(funcionario.ocioso());
        assertEquals(FuncionarioStateOcioso.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void naoDeveAlocarFuncionarioAlocado(){
        assertFalse(funcionario.alocar());
    }


    //Funcionario desligado

    @Test
    void naoDeveIniciarFeriasFuncionarioDesligado(){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        assertFalse(funcionario.iniciarFerias());
    }
    @Test
    void naoDeveFolgarFuncionarioDesligado(){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        assertFalse(funcionario.folgar());
    }
    @Test
    void naoDeveDesligarFuncionarioDesligado(){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        assertFalse(funcionario.desligar());
    }

    @Test
    void naoDeveFicarOciosoFuncionarioDesligado(){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        assertFalse(funcionario.ocioso());
    }

    @Test
    void naoDeveAlocarFuncionarioDesligado(){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        assertFalse(funcionario.alocar());
    }


    // Funcionario ferias

    @Test
    void naoDeveIniciarFeriasFuncionarioFerias(){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        assertFalse(funcionario.iniciarFerias());
    }
    @Test
    void naoDeveFolgarFuncionarioFerias(){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        assertFalse(funcionario.folgar());
    }
    @Test
    void deveDesligarFuncionarioFerias(){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioStateDesligado.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveFicarOciosoFuncionarioFerias(){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        assertTrue(funcionario.ocioso());
        assertEquals(FuncionarioStateOcioso.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveAlocarFuncionarioFerias(){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        assertTrue(funcionario.alocar());
        assertEquals(FuncionarioStateAlocado.getInstance(), funcionario.getFuncionarioState());
    }

    //Funcionario folga

    @Test
    void deveIniciarFeriasFuncionarioFolga(){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        assertTrue(funcionario.iniciarFerias());
        assertEquals(FuncionarioStateFerias.getInstance(), funcionario.getFuncionarioState());
    }
    @Test
    void naoDeveFolgarFuncionarioFolga(){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        assertFalse(funcionario.folgar());
    }
    @Test
    void deveDesligarFuncionarioFolga(){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioStateDesligado.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveFicarOciosoFuncionarioFolga(){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        assertTrue(funcionario.ocioso());
        assertEquals(FuncionarioStateOcioso.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveAlocarFuncionarioFolga(){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        assertTrue(funcionario.alocar());
        assertEquals(FuncionarioStateAlocado.getInstance(), funcionario.getFuncionarioState());
    }


    //Funcionario ocioso

    @Test
    void deveIniciarFeriasFuncionarioOcioso(){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertTrue(funcionario.iniciarFerias());
        assertEquals(FuncionarioStateFerias.getInstance(), funcionario.getFuncionarioState());
    }
    @Test
    void deveFolgarFuncionarioOcioso(){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertTrue(funcionario.folgar());
        assertEquals(FuncionarioStateFolga.getInstance(), funcionario.getFuncionarioState());
    }
    @Test
    void deveDesligarFuncionarioOcioso(){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioStateDesligado.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void naoDeveFicarOciosoFuncionarioOcioso(){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertFalse(funcionario.ocioso());
    }

    @Test
    void deveAlocarFuncionarioOcioso(){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertTrue(funcionario.alocar());
        assertEquals(FuncionarioStateAlocado.getInstance(), funcionario.getFuncionarioState());
    }
}
