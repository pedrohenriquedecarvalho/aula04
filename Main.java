public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java para iniciantes", "Ana silva", 59.90, 10);
        Livro livro2 = new Livro("Devops na pratica", "carlos souza", 35.50, 15);

        System.out.println("--- Livro 1 ---");
        livro1.exibirInformacoes();
        System.out.println("Valor total em estoque: R$ " + livro1.calcularValorEstoque());
        
        System.out.println();

        System.out.println("--- Livro 2 ---");
        livro2.exibirInformacoes();
        System.out.println("Valor total em estoque: R$ " + livro2.calcularValorEstoque());
    }
}