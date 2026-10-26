public class listaDuplamenteEncadeada<T> {
    private NoDuplo<T> Head;
    private NoDuplo<T> Tail;

    private int tamLista = 0;

    public listaDuplamenteEncadeada(){
        this.Head = null;
        this.Tail = null;
        this.tamLista = 0;
    }

    public void add(T content){
        NoDuplo<T> NewNo = new NoDuplo<>(content);
        NewNo.setNext(null);
        NewNo.setPrev(Tail);
        if(Head == null){
            Head = NewNo;
            Tail = NewNo;
        }
        if(Tail != null){
            Tail.setNext(NewNo);
        }
        Tail = NewNo;
        tamLista ++;

    }

        public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNext(noAuxiliar);

        if(novoNo.getNext() != null){
            novoNo.setPrev(noAuxiliar.getNext());
            novoNo.getNext().setPrev(novoNo);
        }else {
            novoNo.setPrev(Tail);
            Tail = novoNo;
        }
        if(index == 0){
            Head = novoNo;
        }else {
            novoNo.getNext().setNext(novoNo);
        }
        tamLista++;
    }

    public void remove(int index){
        if(index == 0){
            Head = Head.getNext();
            if(Head != null){
                Head.setPrev(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNext().setNext(noAuxiliar.getNext());
            if(noAuxiliar != Tail){
                noAuxiliar.getNext().setPrev(noAuxiliar.getNext());
            }else{
                Tail = noAuxiliar.getNext();
            }
        }
        tamLista--;
    }


    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> aux = Head;
        for(int i = 0; (i< index) && (aux != null); i++){
            aux = aux.getNext();
        }
        return aux;
    }

    public int size(){
        return tamLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = Head;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNext();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
