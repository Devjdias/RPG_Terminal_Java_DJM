package itens;

import personagens.Personagem;

public class ArmaduraDeFerro extends Armadura {
    public ArmaduraDeFerro() {
        super("Armadura de Ferro", 10);
    }

    @Override
    public void usar(Personagem personagem) {
        personagem.setDefesaExtra(this.defesa);
        System.out.println(personagem.getNome() + " equipou " + getNome() + " (+" + defesa + " DEF)!");
    }
}