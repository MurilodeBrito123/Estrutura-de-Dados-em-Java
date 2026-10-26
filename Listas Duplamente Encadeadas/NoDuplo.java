public class NoDuplo <T>{
    private T conteudo;
    private NoDuplo<T> Next;
    private NoDuplo<T> Prev;

    public NoDuplo(T content){
        this.conteudo = content;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNext() {
        return Next;
    }

    public void setNext(NoDuplo<T> Next) {
        this.Next = Next;
    }

    public NoDuplo<T> getPrev() {
        return Prev;
    }

    public void setPrev(NoDuplo<T> Prev) {
        this.Prev = Prev;
    }

    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }
    
}
