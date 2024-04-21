package EstruturaDados.Listas;

public class Lista<T> {

    No<T> refEntrada;
    
    public Lista(){

        this.refEntrada = null;

    }

    public boolean isEmpty(){
        if(refEntrada == null){
            return true;
        }else{
            return false;
        }
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAuxiliar = refEntrada;
        while(true){
            if(refAuxiliar != null){
                tamanhoLista += 1;
                if(refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;

        for(int i = 0; i < this.size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public No<T> getNo(int index){

       


        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size() - 1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public void validaIndice(int index){
        if(index >= size()){

            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("não existe conteúdo no índice "  + index + " desta lista. Essa lista só vai até o índice " + ultimoIndice);
        }

    }
}   

