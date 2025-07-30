package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Guerreiro extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;

    public Guerreiro(String nome) {
        super(nome, 120);
    }

    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 10 + (int)(1.5 * nivel) + (int)(Math.random() * 6);
    }

    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " usa GOLPE PODEROSO!");

        int dano = 2500;

        inimigo.receberDano(dano);
    }
}
