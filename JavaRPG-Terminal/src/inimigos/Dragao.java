package inimigos;

import itens.Arma;
import itens.Item;
import itens.ArmaduraDeFerro;
import itens.PocaoGrande;


public class Dragao extends Inimigo {

    public Dragao() {
        super("Dragão", 150, 100);
    }

    @Override
    public int calcularDano() {
        return 20 + (int)(Math.random() * 15); // Retorna um dano entre 20 e 34
    }

    @Override
    protected Item gerarDrop() {
        double chance = Math.random();
        if (chance < 0.4) {
            return new ArmaduraDeFerro();
        } else if (chance < 0.8) {
            return new PocaoGrande();
        } else {
            return new Arma("Garra de Dragão", 15);
        }
    }
}
