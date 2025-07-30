package itens;

import personagens.Personagem;
import java.io.Serializable;

public class PocaoPequena extends Item implements Serializable {
    private static final long serialVersionUID = 1L;

    public PocaoPequena() {
        super("Poção Pequena");
    }

    @Override
    public void usar(Personagem personagem) {
        int cura = 20;
        personagem.recuperarHp(cura);
        System.out.println(personagem.getNome() + " usou Poção Pequena! +" + cura + " HP");
    }
}
