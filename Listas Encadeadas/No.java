public class No<T> {
    private T conteudo;
    private No<T> next;

    public No(){
        this.next = null;
    }

    public No(T conteudo){
        this.next = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> next){
        this.conteudo = conteudo;
        this.next = next;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado(){
        String str = "No{"+
                    "conteudo= "+ conteudo+
                    '}';
        if(next!= null){
            str += "->"+ next.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}
