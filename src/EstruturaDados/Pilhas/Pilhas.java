package EstruturaDados.Pilhas;

public class Pilhas {
    
    // Estudo de Pilhas

    private No refNoEntradaPilha;

    public Pilhas(){

        this.refNoEntradaPilha = null;

    }

    public No pop(){
        if(!this.isEmpty()){

            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;
        }else{
            return null;
        }
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {

        String stringRetorno = "----------\n";

        stringRetorno += " Pilha \n";
        stringRetorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No {dado" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }

        stringRetorno += "=============\n";
        return stringRetorno;
    }
    
}
