package EstruturaDados.Intrudoção;

public class No<T>{
    // encadeamento de nó

   private T conteudo;
   private No<T> proximoNo;

    public No (T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo(){
        return proximoNo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setProximoNo(No<T> proximoNo){
        this.proximoNo = proximoNo;
    }
}
