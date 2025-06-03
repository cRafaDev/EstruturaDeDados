public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada minhaLista = new ListaDuplamenteEncadeada();

        System.out.println("--- Início dos Testes ---");

        // 1) Adicione Homer e Marge na lista e depois imprima o resultado.
        System.out.println("\n--- Teste 1 ---");
        minhaLista.inserir("Homer");
        minhaLista.inserir("Marge");
        System.out.print("Lista após adicionar Homer e Marge: ");
        minhaLista.exibir();

        // 2) Esvazie a lista e imprima.
        System.out.println("\n--- Teste 2 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        // 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        System.out.println("\n--- Teste 3 ---");
        minhaLista.inserir("Homer");
        minhaLista.adicionarNaPosicao(0, "Bart"); // Adiciona Bart no início
        minhaLista.adicionarNaPosicao(1, "Moll"); // Adiciona Moll na posição 1 (depois de Bart)
        System.out.print("Lista após adições específicas: ");
        minhaLista.exibir();

        // 4) Esvazie a lista.
        System.out.println("\n--- Teste 4 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        // 5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista.
        //    Imprima o resultado e o tamanho da lista.
        System.out.println("\n--- Teste 5 ---");
        minhaLista.inserir("Homer");
        minhaLista.inserir("Bart");
        minhaLista.adicionarNoInicio("Lisa");
        System.out.print("Lista após Homer, Bart e Lisa no início: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());

        // 6) Esvazie a lista e imprima.
        System.out.println("\n--- Teste 6 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        // 7) Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0
        //    e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        System.out.println("\n--- Teste 7 ---");
        minhaLista.inserir("Homer");
        minhaLista.inserir("Maggie");
        minhaLista.adicionarNaPosicao(0, "Bart");
        minhaLista.adicionarNaPosicao(1, "Marge");
        System.out.print("Lista após Bart(0), Marge(1), Homer, Maggie: ");
        minhaLista.exibir();
        System.out.println("Lisa está na lista? " + minhaLista.contem("Lisa"));

        // 8) Esvazie a lista.
        System.out.println("\n--- Teste 8 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        // 9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("\n--- Teste 9 ---");
        minhaLista.inserir("Homer");
        minhaLista.inserir("Bart");
        System.out.print("Lista após Homer e Bart: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());

        // 10) Verifique se Marge, Homer, Bart e Maggie estão na lista
        //     e depois imprima o resultado e o tamanho da lista.
        System.out.println("\n--- Teste 10 ---");
        System.out.println("Marge está na lista? " + minhaLista.contem("Marge"));
        System.out.println("Homer está na lista? " + minhaLista.contem("Homer"));
        System.out.println("Bart está na lista? " + minhaLista.contem("Bart"));
        System.out.println("Maggie está na lista? " + minhaLista.contem("Maggie"));
        System.out.print("Lista atual: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 11) Esvazie a lista.
        System.out.println("\n--- Teste 11 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        // 12) Adicione Homer e Bart no começo da lista. Depois adicione Marge,
        //     e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista
        //     e Sr. Burns no Final da lista imprima a lista
        System.out.println("\n--- Teste 12 ---");
        minhaLista.adicionarNoInicio("Homer"); // Lista: Homer
        minhaLista.adicionarNoInicio("Bart");  // Lista: Bart, Homer
        minhaLista.inserir("Marge");           // Lista: Bart, Homer, Marge (inserir no final)
        minhaLista.adicionarNaPosicao(1, "Maggie"); // Lista: Bart, Maggie, Homer, Marge
        minhaLista.adicionarNoInicio("Ned Flanders"); // Lista: Ned Flanders, Bart, Maggie, Homer, Marge
        minhaLista.inserir("Sr. Burns");       // Lista: Ned Flanders, Bart, Maggie, Homer, Marge, Sr. Burns
        System.out.print("Lista após várias inserções: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());

        // 13) Remova do fim da lista e imprima a lista.
        System.out.println("\n--- Teste 13 ---");
        String removidoFim = minhaLista.removerDoFim();
        System.out.println("Removido do fim: " + removidoFim);
        System.out.print("Lista após remover do fim: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 14) Remova a posição 1, depois imprima a lista e o tamanho da lista.
        System.out.println("\n--- Teste 14 ---");
        String removidoPos1 = minhaLista.removerDaPosicao(1);
        System.out.println("Removido da posição 1: " + removidoPos1);
        System.out.print("Lista após remover da posição 1: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 15) Verifique se Marge, Homer, Bart e Maggie estão na lista
        //     e depois imprima o resultado e o tamanho da lista.
        System.out.println("\n--- Teste 15 ---");
        System.out.println("Marge está na lista? " + minhaLista.contem("Marge"));
        System.out.println("Homer está na lista? " + minhaLista.contem("Homer"));
        System.out.println("Bart está na lista? " + minhaLista.contem("Bart"));
        System.out.println("Maggie está na lista? " + minhaLista.contem("Maggie"));
        System.out.print("Lista atual: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 16) Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        System.out.println("\n--- Teste 16 ---");
        String removidoInicio = minhaLista.removerDoInicio();
        System.out.println("Removido do início: " + removidoInicio);
        System.out.print("Lista após remover do início: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 17) Verifique se Marge, Homer, Bart e Maggie na lista e
        //     depois imprima o resultado e o tamanho da lista.
        System.out.println("\n--- Teste 17 ---");
        System.out.println("Marge está na lista? " + minhaLista.contem("Marge"));
        System.out.println("Homer está na lista? " + minhaLista.contem("Homer"));
        System.out.println("Bart está na lista? " + minhaLista.contem("Bart"));
        System.out.println("Maggie está na lista? " + minhaLista.contem("Maggie"));
        System.out.print("Lista atual: ");
        minhaLista.exibir();
        System.out.println("Tamanho da lista: " + minhaLista.tamanho());


        // 18) Esvazie a lista e imprima.
        System.out.println("\n--- Teste 18 ---");
        minhaLista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        minhaLista.exibir();

        System.out.println("\n--- Fim dos Testes ---");
    }
}