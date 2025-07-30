package inimigos;

import itens.Item;
import itens.PocaoGrande;
import itens.PocaoPequena;

public class Goblin extends Inimigo {

    public Goblin() {
        super("Goblin", 40, 45);
    }

    @Override
    public int calcularDano() {
        return 5 + (int)(Math.random() * 5); // Retorna um dano entre 5 e 9
    }

    @Override
    protected Item gerarDrop() {
        double chance = Math.random();
        if (chance < 0.7) {
            return new PocaoPequena();
        } else {
            return new PocaoGrande();
        }
    }
}
