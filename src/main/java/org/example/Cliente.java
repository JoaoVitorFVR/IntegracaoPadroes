package org.example;

public class Cliente {

    private FabricaAbstrata fabrica;

    public Cliente(FabricaAbstrata fabrica) {
        this.fabrica = fabrica;
    }

    public String executarEmissaoProcuracao() {
        Procuracao procuracao = fabrica.criarProcuracao();
        return procuracao.emitir();
    }

    public String executarAssinaturaContrato() {
        Contrato contrato = fabrica.criarContrato();
        return contrato.assinar();
    }
}
