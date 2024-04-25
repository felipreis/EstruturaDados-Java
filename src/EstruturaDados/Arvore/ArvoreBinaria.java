package EstruturaDados.Arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    
    private NoArvore<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoArvore<T> novoNo = new NoArvore<>(conteudo);

        this.raiz = inserir(raiz,novoNo);
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
        System.out.print("Exibir em Ordem");
        exibirInOrdem(this.raiz);
    }
    

    public void exibirInOrdem(NoArvore<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDir());
        }
    }


    //Exibição Pós Ordem

    public void exibirPosOrdem(){
        System.out.print("Exibir Pós Ordem");
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

    //Método Remove

    public void remove(T conteudo){
        try{
            NoArvore<T> atual = this.raiz;
            NoArvore<T> noPai = null;
            NoArvore<T> noFilho = null;
            NoArvore<T> temp = null;

            while(atual != null && atual.getConteudo().equals(conteudo)){
                noPai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual =atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.err.println("Conteudo não encontrado. Bloco try");
            }

            if(noPai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for(temp = atual, noFilho = atual.getNoEsq();
                     noFilho.getNoDir() != null; 
                     temp = noFilho, noFilho = noFilho.getNoEsq()){

                        if(noFilho != atual.getNoEsq()){
                            temp.setNoDir(noFilho.getNoEsq());
                            noFilho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    noFilho.setNoDir(raiz.getNoDir());
                        raiz = noFilho;
                }
            }else if(atual.getNoDir( ) == null){
                if(noPai.getNoEsq() == atual){
                    noPai.setNoEsq(atual.getNoEsq());
                }else{
                    noPai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq( ) == null){
                if(noPai.getNoEsq() == atual){
                    noPai.setNoEsq(atual.getNoDir());
                }else{
                    noPai.setNoDir(atual.getNoDir());
                }
            }else{
                for(temp = atual,noFilho = atual.getNoEsq();
                noFilho.getNoDir() != null;
                temp = noFilho, noFilho = noFilho.getNoDir()
                ){
                    if(noFilho != atual.getNoEsq()){
                        temp.setNoDir(noFilho.getNoEsq());
                        noFilho.setNoEsq(atual.getNoEsq());
                    }
                    noFilho.setNoDir(atual.getNoDir());

                    if(noPai.getNoEsq() == atual){
                        noPai.setNoEsq(noFilho);
                    }else{
                        noPai.setNoDir(noFilho);
                    }
                }
            }


        }catch(NullPointerException e){
            System.err.println("Conteudo não encontrado. Bloco catch");
        }
    }
}
