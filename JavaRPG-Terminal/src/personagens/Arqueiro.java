package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Arqueiro extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;

    public Arqueiro(String nome) {
        super(nome, 90);
    }

    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 9 + (int)(1.3 * nivel) + (int)(Math.random() * 6);
    }

    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " dispara FLECHA PRECISA!");

        int dano = 2000 + (int)(Math.random() * 15);
        if (Math.random() < 0.3) {
            dano *= 2;
            System.out.println("🎯 ACERTO CRÍTICO!");
        }

        inimigo.receberDano(dano);

        System.out.println("➹ A flecha causou " + dano + " de dano!");
    }
}
