import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioGerenteTest {

    @Test
    void devePromoverFuncionario() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setNivel(2);
        gerente.setNome("João");

        // Simulando a promoção
        gerente.promover();

        assertEquals("Funcionário João promovido por gerente", gerente.getInfo());
    }

    @Test
    void deveDemitirFuncionario() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setNivel(2);
        gerente.setNome("Maria");

        // Simulando a demissão
        gerente.demitir();

        assertEquals("Funcionário Maria demitido por gerente", gerente.getInfo());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setNivel(2);
        gerente.setNome("Carlos");

        assertEquals("Funcionário{contrato=0, nome='Carlos', salario=" + gerente.calcularSalario() + '}', gerente.getInfo());
    }
}