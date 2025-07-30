package itens;

import personagens.Personagem;
import java.io.Serializable;

public abstract class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void usar(Personagem personagem);
}