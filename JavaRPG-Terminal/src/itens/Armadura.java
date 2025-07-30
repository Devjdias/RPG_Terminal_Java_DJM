package itens;

import java.io.Serializable;
import personagens.Personagem;

public abstract class Armadura extends Item implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int defesa;

    public Armadura(String nome, int defesa) {
        super(nome);
        this.defesa = defesa;
    }

    public abstract void usar(Personagem personagem);
}
