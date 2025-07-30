package itens;

import personagens.Personagem;
import java.io.Serializable;

public class PocaoGrande extends Item implements Serializable {
    private static final long serialVersionUID = 1L;

    public PocaoGrande() {
        super("Poção Grande");
    }

    @Override
    public void usar(Personagem personagem) {
        int cura = 40;
        personagem.recuperarHp(cura);
        System.out.println(personagem.getNome() + " usou Poção Grande! +" + cura + " HP");
    }
}