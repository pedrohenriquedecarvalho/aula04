
class Livro {
    String titulo;
    String autor;
    double preco;
    int quantidade;

    public Livro(String titulo, String autor, double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

  
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }
}


