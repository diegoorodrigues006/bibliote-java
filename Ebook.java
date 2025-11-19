public class Ebook extends Livro {
    
    private String waterMark;
    
    public Ebook(Autor autor) {
        super(autor); 
    }
    
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public String getWaterMark() {
        return waterMark;
    }
    
    // MÉTODO REESCRITO (Override) para omitir a linha "Impresso: true"
    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro ");
        // Usamos os getters da classe Livro (pai)
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn()); 
        
        // A linha 'Impresso: true' é intencionalmente omitida aqui
        
        if(this.temAutor()) {
            this.autor.mostrarDetalhes(); 
        }
        
        System.out.println("--");
    }

    // MÉTODO REESCRITO (Override) para a regra de 15%
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        this.valor -= this.valor * porcentagem; 
        return true;
    }
}