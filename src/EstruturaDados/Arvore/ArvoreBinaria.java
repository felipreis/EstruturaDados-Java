package EstruturaDados.Arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    
    private NoArvore<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoArvore<T> novoNo = new NoArvore<>(conteudo);

        this.raiz = inserir(raiz,novoNo)
    }

    private NoArvore<T> inserir(NoArvore<T> atual, NoArvore<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
        }else {
            atual.setNoEsq(inserir(atual.getNoDir(),novoNo));
        }
        return atual;
    }

    //Exibição em ordem

    public void exibirInOrdem(){
        System.out.println("Exibir em Ordem");
        exibirInOrdem(this.raiz);
    }
    

    public void exibirInOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDir());
        }
    }


    //Exibição Pós Ordem

    public void exibirPosOrdem(){
        System.out.println("Exibir Pós Ordem");
        exibirPosOrdem(this.raiz);
    }
    

    public void exibirPosOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ",");
        }
    }

    //Exibir pre ordem

    public void exibirPreOrdem(){
        System.out.println("Exibir Pós Ordem");
        exibirPreOrdem(this.raiz);
    }
    

    public void exibirPreOrdem(NoArvore<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());  
        }
    }
}
