package personagens;

import java.io.Serializable;
import inimigos.Inimigo;

public class Necromante extends Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    public Necromante(String nome) {
        super(nome, 85);
    }

    // Método que calcula o dano básico do necromante (entre 8 e 13)
    @Override
    public int calcularDano() {
        int nivel = getNivel();
        return 8 + (int)(1.3 * nivel) + (int)(Math.random() * 6); // 0 a 5 de variação
    }

    @Override
    public void usarHabilidade(Inimigo inimigo) {
        System.out.println(getNome() + " invoca ESQUELETO SOMBRIO!");

        // Calcula dano da habilidade (18 a 25)
        int dano = 18 + (int)(Math.random() * 8);
        int cura = 10;

        inimigo.receberDano(dano);
        this.recuperarHp(cura);

        System.out.println("💀 O esqueleto causou " + dano + " de dano!");
        System.out.println("🩸 " + getNome() + " drenou " + cura + " de HP do inimigo!");
    }
}
