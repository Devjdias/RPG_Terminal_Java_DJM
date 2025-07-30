package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Mago extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    // Construtor que define o nome e HP inicial do mago
    public Mago(String nome) {
        super(nome, 80);  // HP menor, equilibrado com dano mais forte
    }

    // Método que calcula o dano básico do mago (entre 8 e 12)
    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 8 + (int)(1.2 * nivel) + (int)(Math.random() * 5); // 0 a 4 de variação
    }


    // Método que executa a habilidade especial do mago
    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " conjura BOLA DE FOGO!");

        // Calcula dano da habilidade (30 a 39)
        int dano = 30 + (int)(Math.random() * 10);

        // Aplica dano ao inimigo
        inimigo.receberDano(dano);

        // Mensagem informando o dano causado
        System.out.println("🔥 A bola de fogo causou " + dano + " de dano!");
    }
}
