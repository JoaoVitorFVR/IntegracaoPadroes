package org.example;

public class FactoryMethod {

    private static FactoryMethod instance = new FactoryMethod();

    private FactoryMethod() {}

    public static FactoryMethod getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}
