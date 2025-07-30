package inimigos;

import itens.PocaoPequena;
import itens.Item;
import itens.PocaoGrande;

public class Orc extends Inimigo {

    public Orc() {
        super("Orc", 80, 60);
    }

    @Override
    public int calcularDano() {
        return 10 + (int)(Math.random() * 10);
    }

    @Override
    protected Item gerarDrop() {
        double chance = Math.random();
        if (chance < 0.5) {
            return new PocaoPequena();
        } else {
            return new PocaoGrande();
        }
    }
}