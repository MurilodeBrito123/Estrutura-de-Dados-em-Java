public class ListasCirculares<T> {
    private No<T> Cabeca;
    private No<T> Cauda;
    private int tamLista;
    public ListasCirculares(){
        this.Cabeca = null;
        this.Cauda = null;
        this.tamLista = 0;
    }

    public void add(T content){
        No<T> newNo = new No<>(content);
        if(tamLista == 0){
            this.Cabeca = newNo;
            this.Cauda = this.Cabeca;
            this.Cabeca.setNext(this.Cauda);
        }else{
            newNo.setNext(this.Cauda);
            this.Cabeca.setNext(newNo);
            this.Cauda = newNo;
        }
        tamLista++;
    }
        public void remove(int index){
        if(index >= this.tamLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = Cauda;
        if(index == 0){ //estou na Cauda
            this.Cauda = this.Cauda.getNext();
            this.Cabeca.setNext(Cauda);
        }else if(index == 1){
            this.Cauda.setNext(this.Cauda.getNext().getNext());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNext();
            }
            noAuxiliar.setNext(noAuxiliar.getNext().getNext());
        }
        this.tamLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return this.Cauda;
        }

        No<T> noAuxiliar = this.Cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNext();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamLista == 0 ? true : false;
    }

    public int size(){
        return this.tamLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.Cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNext();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }


}
