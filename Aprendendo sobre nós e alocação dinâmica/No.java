public class No <T>{
    private T conteudo;
    private No <T>ProximoNo;

    public No(T cont){
        this.ProximoNo = null;
        this.conteudo = cont;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return ProximoNo;
    }

    public void setProximoNo(No<T> ProximoNo) {
        this.ProximoNo = ProximoNo;
    }
    @Override 
    public String toString(){
        return "No{"+"conteudo: " +conteudo+"}";
    }
}
