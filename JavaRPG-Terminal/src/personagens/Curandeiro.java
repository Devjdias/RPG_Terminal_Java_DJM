package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Curandeiro extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    public Curandeiro(String nome) {
        super(nome, 100);
    }

    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 6 + (int)(1.0 * nivel) + (int)(Math.random() * 5); // 0 a 4 de variação
    }

    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " invoca CURA DIVINA!");

        int cura = 25 + (int)(Math.random() * 10);
        this.recuperarHp(cura);

        System.out.println("✨ " + getNome() + " recuperou " + cura + " de HP!");
    }
}
