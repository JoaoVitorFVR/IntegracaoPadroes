package org.example;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }

    @Override
    public Contrato criarContrato() {
        return new ContratoPJ();
    }
}
