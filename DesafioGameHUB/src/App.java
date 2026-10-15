public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador("Rafaela", "rafa123", 20);

        System.out.println("-----Informações do jogador------");
        System.out.println("jogador: " + jogador.getNome());
        System.out.println("nickname: " + jogador.getNickname());
        System.out.println("Idade: " + jogador.getIdade()); 
        jogador.adicionarCreditos(80); 
        System.out.println("Creditos: " + jogador.getCreditos());
        System.out.println("Reputação: "  + jogador.getReputacao());
        System.out.println(" ");

        System.out.println("-----Informações do item------");
        ItemDigital itemDigital = new ItemDigital("Item Barato", 20, 6, true, true);

        System.out.println("Item: " + itemDigital.getNome());
        System.out.println("Estoque: " + itemDigital.getEstoque());
        System.out.println("Disponivel para venda? " + itemDigital.iSDisponivelParaVenda());

        System.out.println(" ");
        System.out.println("----- testes da etapa 4 ------");

        // 1. Verificar desconto antes de atingir 50 pontos (Reputação deve ser 0 aqui)[cite: 2]
        System.out.println("-> TESTE: Compra com menos de 50 de reputação (0% desconto)");
        jogador.comprar(itemDigital); // Sucesso: ganha 10 pontos de reputação[cite: 2]
        
        // 2. Testar compra recusada (Diminui 5 pontos)[cite: 2]
        System.out.println("-> TESTE: Compra recusada (Item sem estoque)");
        ItemDigital itemSemEstoque = new ItemDigital("Jogo Falso", 10, 0, true, false);
        jogador.comprar(itemSemEstoque); // Falha: perde 5 pontos de reputação[cite: 2]

        // testar os descontos de 50 e 100 pontos sem precisar criar dezenas de compras para somar +10 de cada vez

        // 3. Verificar depois de atingir 50 pontos (5% desconto)[cite: 2]
        System.out.println("-> TESTE: Compra com 50 pontos (5% desconto)");
        jogador.setReputacao(50); // Simulando que atingiu 50 pontos
        jogador.adicionarCreditos(100); // Adicionando saldo para garantir
        ItemDigital item50 = new ItemDigital("Jogo Medio", 40, 5, true, false);
        jogador.comprar(item50);

        // 4. Verificar depois de atingir 100 pontos (10% desconto)[cite: 2]
        System.out.println("-> TESTE: Compra com 100 pontos (10% desconto)");
        jogador.setReputacao(100); // Simulando que atingiu 100 pontos
        ItemDigital item100 = new ItemDigital("Jogo Caro", 50, 5, true, false);
        jogador.comprar(item100);
        
        
        System.out.println(" ");
        System.out.println("-----Informações atualizadas do item------");
        System.out.println("Estoque: " + itemDigital.getEstoque());
    }
}
