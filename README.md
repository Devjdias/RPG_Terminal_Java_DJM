# RPG de Terminal em Java

Um jogo de RPG de aventura por turnos, totalmente baseado em texto e jogável diretamente no seu terminal! 

Crie seu personagem, enfrente inimigos desafiadores, colete itens, suba de nível e torne-se uma lenda.

---

## 🎮 Como Jogar

Para mergulhar nesta aventura, você só precisa ter o Java instalado e seguir os passos abaixo.

### Pré-requisitos

- **Java JDK 8** ou superior instalado e configurado no seu sistema.

### Instalação e Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Devjdias/RPG_Terminal_Java_DJM.git](https://github.com/Devjdias/RPG_Terminal_Java_DJM.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd RPG_Terminal_Java_DJM
    ```

3.  **Compile os arquivos Java:**
    ```bash
    javac -d bin src/jogo/Jogo.java
    ```

4.  **Execute o jogo:**
    ```bash
    java -cp bin jogo.Jogo
    ```

---

## ✨ Funcionalidades

-   ✅ **7 Classes de Personagens**: Escolha entre Guerreiro, Mago, Arqueiro, Ladrão, Curandeiro, Necromante e Paladino, cada um com habilidades únicas.
  
-   ✅ **Sistema de Batalha por Turnos**: Use estratégia para atacar, defender, usar habilidades especiais ou consumir itens.
  
-   ✅ **Progressão de Personagem**: Derrote inimigos para ganhar pontos de experiência (XP), subir de nível e aprimorar seus atributos.
  
-   ✅ **Loja de Itens**: Utilize o XP acumulado para comprar poções de cura, armaduras e outros equipamentos.
  
-   ✅ **Salvamento Automático**: Seu progresso é salvo automaticamente ao final de cada sessão, permitindo que você continue sua jornada mais tarde.

---

## 👾 Visão Geral do Jogo

### 💫 Classes de Personagens
Cada classe possui atributos e habilidades distintas.

| Classe     | HP  | Dano    | Habilidade Especial                  |
| :--------- | :-- | :------ | :----------------------------------- |
| Guerreiro  | 120 | 10-15   | Golpe Poderoso (dano massivo)        |
| Mago       | 80  | 8-12    | Bola de Fogo (30-39 de dano)         |
| Arqueiro   | 90  | 9-14    | Flecha precisa (dano expressivo)     |
| Ladrão     | 85  | 7-16    | Golpe furtivo (dano inesperado)      |
| Curandeiro | 100 | 6-10    | Cura divina (recupera vida)          |
| Necromante | 85  | 8-13    | Drenar Vida (cura 10 HP ao atacar)   |
| Paladino   | 110 | 9-12    | Luz sagrada (dano e cura)            |

### 🛡️ Itens Disponíveis
Equipe-se com itens para ganhar vantagens em combate.

| Item              | Efeito      | Como Obter                         |
| :---------------- | :---------- | :--------------------------------- |
| Armadura de Ferro | +10 Defesa  | Loja (30 XP) ou drop do Dragão     |
| Poção Grande      | +40 HP      | Loja (20 XP) ou drop de inimigos   |
| Poção Pequena     | +20 HP      | Loja (10 XP) ou drop de inimigos   |

### 🎯 Inimigos
Prepare-se para enfrentar criaturas perigosas em sua jornada.

| Inimigo | HP  | Dano    | Recompensa (XP) | Drop Comum                           |
| :------ | :-- | :------ | :-------------- | :----------------------------------- |
| Dragão  | 150 | 20-34   | 100 XP          | Drop do Dragão (chance de 20%)       |
| Goblin  | 40  | 5-9     | 45 XP           | Poção Pequena (chance de 70%)        |
| Orc     | 80  | 10-15   | 60 XP           | Poção Pequena ou Grande (chance de 50%) |

---

## 🛠️ Estrutura do Projeto

A organização dos arquivos fonte (src) está estruturada da seguinte forma:

src/

├── inimigos/                        - Contém as classes dos inimigos

├── itens/                           - Contém os itens e a lógica do inventário

├── jogo/

│   └── Jogo.java                    - Lógica principal e loop do jogo

├── personagens/                     - Contém as classes jogáveis

├── servico/

│    ├── Loja.java                   - Sistema de compra e venda de itens

│    └── SalvadorDeJogo.java         - Lógica de salvamento e carregamento



---

## 📌 Exemplo de Gameplay

===== RPG TERMINAL =====

1 - Novo Jogo

2 - Carregar Jogo

Escolha: 1

-
Digite o nome do seu herói: Aragorn

Escolha sua classe:

1 - Guerreiro | 2 - Mago | 3 - Arqueiro ...

Opção: 1

-
Você encontrou um Dragão feroz!

-
=== SEU TURNO ===

1 - Atacar

2 - Defender

3 - Usar Habilidade

4 - Abrir Inventário

Escolha: 3

-
Aragorn usa Golpe Poderoso! Causa 2500 de dano.

O Dragão foi derrotado! Você ganhou 100 XP.

🎁 Drop encontrado: Armadura de Ferro!


---

## 💡 Como Contribuir

Contribuições são sempre bem-vindas! Se você tem ideias para novos itens, inimigos, classes ou funcionalidades, sinta-se à vontade para colaborar.

1.  **Faça um Fork** do projeto.
2.  **Crie uma Branch** para sua nova feature (`git checkout -b feature/nova-classe`).
3.  **Faça o Commit** das suas alterações (`git commit -m 'Adiciona a classe Druida'`).
4.  **Faça o Push** para a sua Branch (`git push origin feature/nova-classe`).
5.  **Abra um Pull Request**.

---

## 📜 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

MIT © 2025 - Débora Santos, Josilene Dias e Matheus Menezes

---

**Divirta-se jogando! 🎉**
