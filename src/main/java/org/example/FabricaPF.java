package org.example;

public class FabricaPF implements FabricaAbstrata {

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }

    @Override
    public Contrato criarContrato() {
        return new ContratoPF();
    }
}
