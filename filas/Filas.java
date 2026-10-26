public class Filas {

    private No refNoEntradaFilas;

    public Filas() {
        this.refNoEntradaFilas = null;
    }

    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFilas);
        refNoEntradaFilas = novoNo;
    }

    public Object first() {
        if (!this.isEmpty()) {

            No primeiroNo = refNoEntradaFilas;

            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }

            return primeiroNo.getObj();
        }

        return null;
    }

    public Object dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFilas;
            No noAuxiliar = refNoEntradaFilas;
            while(true){
              if(primeiroNo.getRefNo() != null) {
                  noAuxiliar = primeiroNo;
                  primeiroNo = primeiroNo.getRefNo();
              }else{
                  noAuxiliar.setRefNo(null);
                  break;
              }
            }
            return primeiroNo.getObj();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFilas == null;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFilas;

        if(refNoEntradaFilas != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObj() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}