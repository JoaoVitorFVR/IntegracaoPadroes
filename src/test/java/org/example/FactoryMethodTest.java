package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração PF emitida", cliente.executarEmissaoProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração PJ emitida", cliente.executarEmissaoProcuracao());
    }

    @Test
    void deveAssinarContratoPF() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato assinado PF", cliente.executarAssinaturaContrato());
    }

    @Test
    void deveAssinarContratoPJ() {
        FabricaAbstrata fabrica = FactoryMethod.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato assinado PJ", cliente.executarAssinaturaContrato());
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FactoryMethod.getInstance().obterFabrica("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInvalida() {
        try {
            FactoryMethod.getInstance().obterFabrica("Method");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

}