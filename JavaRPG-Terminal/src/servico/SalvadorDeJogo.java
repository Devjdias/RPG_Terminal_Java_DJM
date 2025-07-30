package servico;

import personagens.Personagem;

import java.io.*;
import personagens.Personagem;
import java.io.*;

public class SalvadorDeJogo {

    public static void salvar(Personagem jogador) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jogo_salvo.ser"))) {
            oos.writeObject(jogador);
            System.out.println("Jogo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o jogo: " + e.getMessage());
        }
    }

    public static Personagem carregar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jogo_salvo.ser"))) {
            return (Personagem) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum jogo salvo encontrado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar o jogo: " + e.getMessage());
        }
        return null;
    }
}
