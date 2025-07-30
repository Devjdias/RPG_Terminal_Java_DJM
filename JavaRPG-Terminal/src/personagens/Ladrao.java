package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Ladrao extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    // Construtor que define o nome e HP inicial do ladrão
    public Ladrao(String nome) {
        super(nome, 85);  // HP médio-baixo para ladrão
    }

    // Método que calcula o dano básico do ladrão (entre 7 e 16)
    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 7 + (int)(1.4 * nivel) + (int)(Math.random() * 10); // 0 a 9 de variação
    }


    // Método que executa a habilidade especial do ladrão
    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " usa GOLPE FURTIVO!");

        // Calcula dano especial da habilidade (22 a 31)
        int dano = 22 + (int)(Math.random() * 10);

        // Aplica dano ao inimigo
        inimigo.receberDano(dano);

        // Verifica se o inimigo foi derrotado após o golpe
        if (!inimigo.estaVivo()) {
            System.out.println("⚔️ O golpe furtivo eliminou o inimigo!");
        } else {
            System.out.println("⚔️ O golpe furtivo causou " + dano + " de dano!");
        }
    }
}
