class No {
    String valor; // Alterado de int para String
    No anterior;
    No proximo;

    // Construtor para criar um novo nó
    public No(String valor) { // Alterado de int para String
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}