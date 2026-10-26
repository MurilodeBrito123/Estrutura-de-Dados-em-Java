public class listaEncadeada <T>{
    private No <T> referenciaEntrada;

    public listaEncadeada(){
        this.referenciaEntrada = null;
    }
    
    public void add(T content){
        No <T> NovoNo = new No <>(content);
        if(this.isEmpty()){
            referenciaEntrada = NovoNo;
            return;
        }
        No <T> aux = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            aux = aux.getNext();
        }
        aux.setNext(NovoNo);
    }

    public boolean  isEmpty(){
        return referenciaEntrada == null ? true:false;
    }

    public int size(){
        int tamLista = 0;
        No<T> aux = referenciaEntrada;
        while (true){
            if(aux != null){
                tamLista ++;
                if(aux.getNext() != null){
                    aux = aux.getNext();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamLista;
    }

        public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getNext();
        }
        return noRetorno;
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getNext();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setNext(noPivor.getNext());
        return noPivor.getConteudo();
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNext();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
