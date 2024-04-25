package EstruturaDados.Arvore;

public class NoArvore<T extends Comparable<T>> {
    
    private T conteudo;
    private NoArvore<T> noEsq;
    private NoArvore<T> noDir;

    public NoArvore(T conteudo){
        this.conteudo = conteudo;
        this.noDir = this.noEsq = null;
    }

    public NoArvore(){
        
    }

    public T getConteudo() {
        return conteudo;
    }
    
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore getNoDir() {
        return noDir;
    }

    public void setNoDir(NoArvore noDir) {
        this.noDir = noDir;
    }

    public NoArvore getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoArvore noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "No{ " + 
                "conteudo = " + this.getConteudo()
                +  "}";
    }
}
