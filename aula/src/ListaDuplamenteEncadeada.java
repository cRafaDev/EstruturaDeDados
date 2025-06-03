class ListaDuplamenteEncadeada {
    No inicio; // Referência para o início da Lista
    No fim;    // Referência para o final da lista
    int tamanho; // Adicionado para rastrear o tamanho da lista

    // Construtor para inicializar a lista vazia
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0; // Inicializa o tamanho
    }

    /**
     * Insere um novo valor no final da lista.
     * @param valor O valor a ser inserido.
     */
    public void inserir(String valor) { // Alterado de int para String
        No novoNo = new No(valor);
        if (this.inicio == null) { // Lista vazia: novo nó será o início e o fim
            this.inicio = novoNo;
            this.fim = novoNo;
        } else { // Adiciona o novo nó ao final da lista
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
        this.tamanho++; // Incrementa o tamanho da lista
    }

    /**
     * Adiciona um valor no início da lista.
     * @param valor O valor a ser adicionado.
     */
    public void adicionarNoInicio(String valor) {
        No novoNo = new No(valor);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    /**
     * Adiciona um valor em uma posição específica da lista.
     * @param posicao A posição onde o valor deve ser inserido (0-indexed).
     * @param valor   O valor a ser inserido.
     */
    public void adicionarNaPosicao(int posicao, String valor) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida para inserção: " + posicao);
            return;
        }
        if (posicao == 0) {
            adicionarNoInicio(valor);
        } else if (posicao == tamanho) {
            inserir(valor); // inserir() já insere no final
        } else {
            No novoNo = new No(valor);
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
            // atual agora é o nó que estará na posicao
            novoNo.proximo = atual;
            novoNo.anterior = atual.anterior;
            atual.anterior.proximo = novoNo;
            atual.anterior = novoNo;
            this.tamanho++;
        }
    }


    /**
     * Exibe todos os valores da lista.
     */
    public void exibir() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        No atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println(); // Quebra de linha no final
    }

    /**
     * Remove a primeira ocorrência de um valor da lista.
     * @param valor O valor a ser removido.
     */
    public void remover(String valor) { // Alterado de int para String
        if (inicio == null) {
            System.out.println("A lista está vazia. Não é possível remover.");
            return;
        }

        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) { // Usar .equals() para comparar Strings
                if (atual.anterior != null) { // Não é o primeiro nó
                    atual.anterior.proximo = atual.proximo;
                } else { // Removendo o primeiro nó
                    this.inicio = atual.proximo;
                }

                if (atual.proximo != null) { // Não é o último nó
                    atual.proximo.anterior = atual.anterior;
                } else { // Removendo o último nó
                    this.fim = atual.anterior;
                }
                this.tamanho--; // Decrementa o tamanho
                return; // Valor encontrado e removido, sai da função
            }
            atual = atual.proximo;
        }
        System.out.println("Valor '" + valor + "' não encontrado na lista.");
    }

    /**
     * Remove o nó na posição especificada.
     * @param posicao A posição (0-indexed) do nó a ser removido.
     * @return O valor do nó removido, ou null se a posição for inválida.
     */
    public String removerDaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida para remoção: " + posicao);
            return null;
        }
        String valorRemovido = null;
        if (posicao == 0) {
            valorRemovido = removerDoInicio();
        } else if (posicao == tamanho - 1) {
            valorRemovido = removerDoFim();
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
            valorRemovido = atual.valor;
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
            tamanho--;
        }
        return valorRemovido;
    }


    /**
     * Remove o primeiro nó da lista.
     * @return O valor do nó removido, ou null se a lista estiver vazia.
     */
    public String removerDoInicio() {
        if (inicio == null) {
            return null;
        }
        String valorRemovido = inicio.valor;
        if (inicio == fim) { // A lista tem apenas um elemento
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valorRemovido;
    }

    /**
     * Remove o último nó da lista.
     * @return O valor do nó removido, ou null se a lista estiver vazia.
     */
    public String removerDoFim() {
        if (fim == null) {
            return null;
        }
        String valorRemovido = fim.valor;
        if (inicio == fim) { // A lista tem apenas um elemento
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valorRemovido;
    }

    /**
     * Retorna o tamanho atual da lista.
     * @return O número de elementos na lista.
     */
    public int tamanho() {
        return this.tamanho;
    }

    /**
     * Esvazia completamente a lista.
     */
    public void esvaziar() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        System.out.println("Lista esvaziada.");
    }

    /**
     * Verifica se a lista contém um determinado valor.
     * @param valor O valor a ser procurado.
     * @return true se o valor estiver na lista, false caso contrário.
     */
    public boolean contem(String valor) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}