public class CadastroDeLivros {
    
    public static void main(String [] args) {
        
        // --- 1. CONFIGURAÇÃO AUTOR 1 (Rodrigo Turini) ---
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789-10");
        
        System.out.println("\n---## LIVROS DE RODRIGO TURINI ##---\n");
        
        // --- ITEM 1: JAVA 8 PRÁTICO (Livro Impresso) ---
        Livro livroImpresso = new Livro(autor);
        livroImpresso.setNome("Java 8 Prático (IMPRESSO)");
        livroImpresso.setDescricao("Novos recursos da linguagem");
        livroImpresso.setValor(59.90);
        livroImpresso.setIsbn("978-85-66250-46-6");
        livroImpresso.aplicaDescontoDe(0.10); 
        livroImpresso.mostrarDetalhes();

        // --- ITEM 2: JAVA 8 PRÁTICO (Ebook) ---
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático (EBOOK)");
        ebook.setDescricao("Novos recursos da linguagem (Digital)");
        ebook.setValor(39.90);
        ebook.setIsbn("978-85-66250-46-6");
        ebook.aplicaDescontoDe(0.10); 
        ebook.mostrarDetalhes();

        // --- 4. CONFIGURAÇÃO AUTOR 2 (Paulo Silveira) ---
        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");
        
        System.out.println("\n---## LIVROS DE PAULO SILVEIRA ##---\n");

        // --- ITEM 3: LÓGICA DE PROGRAMAÇÃO (Livro Impresso) ---
        Livro outroLivroImpresso = new Livro(outroAutor);
        outroLivroImpresso.setNome("Lógica de Programação (IMPRESSO)");
        outroLivroImpresso.setDescricao("Crie seus primeiros programas");
        outroLivroImpresso.setValor(50.00);
        outroLivroImpresso.setIsbn("978-85-66250-22-0");
        outroLivroImpresso.aplicaDescontoDe(0.25); 
        outroLivroImpresso.mostrarDetalhes();
        
        // --- ITEM 4: LÓGICA DE PROGRAMAÇÃO (Ebook) ---
        Ebook outroEbook = new Ebook(outroAutor);
        outroEbook.setNome("Lógica de Programação (EBOOK)");
        outroEbook.setDescricao("Crie seus primeiros programas (Digital)");
        outroEbook.setValor(30.00);
        outroEbook.setIsbn("978-85-66250-22-0");
        outroEbook.aplicaDescontoDe(0.10); 
        outroEbook.mostrarDetalhes();
    }
}