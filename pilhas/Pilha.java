public class Pilha {
    private No refNoEntradaPilha;//->referência de entrada

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAux = refNoEntradaPilha;//estamos acrescentando um novo nó, porém, como é pilha, a referência de entrada irá mudar e não queremos perder a antiga
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setrefNo(refAux);
    }
    public No topNo(){
        return refNoEntradaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getrefNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null;
    }

        @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getrefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
