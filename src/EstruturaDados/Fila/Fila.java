package EstruturaDados.Fila;

public class Fila {
    
    private No refNoEntradaFila;

    public Fila (){
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        if(refNoEntradaFila == null){
            return true;
        }else {
            return false;
        }
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                   primeiroNo =  primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = refNoEntradaFila;
                   primeiroNo =  primeiroNo.getRefNo();
                }else{
                    primeiroNo.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }


    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto = " + noAuxiliar.getObject() + "}] ----> ";
                noAuxiliar = noAuxiliar.getRefNo();
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null;";
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }


}
