package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Paladino extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    public Paladino(String nome) {
        super(nome, 110);
    }

    // Método que calcula o dano básico do paladino (entre 9 e 12)
    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 9 + (int)(1.4 * nivel) + (int)(Math.random() * 4); // 0 a 3 de variação
    }

    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " invoca LUZ SAGRADA!");

        // Calcula dano da habilidade (15 a 24)
        int dano = 15 + (int)(Math.random() * 10);
        int cura = 15;

        inimigo.receberDano(dano);
        this.recuperarHp(cura);

        System.out.println("☀️ A luz sagrada causou " + dano + " de dano ao inimigo!");
        System.out.println("✨ " + getNome() + " recuperou " + cura + " de HP!");
    }
}
