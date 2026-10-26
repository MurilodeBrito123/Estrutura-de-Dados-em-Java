public class Fila<T> {

    private No2<T> refNo2EntradaFila;

    public Fila() {
        this.refNo2EntradaFila = null;
    }

    public void enqueue(T object) {
        // CORREÇÃO 1: informa o tipo T ao criar o nó
        No2<T> novoNo = new No2<>(object);

        novoNo.setRefNo2(refNo2EntradaFila);
        refNo2EntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            // CORREÇÃO 2: utiliza No2<T>, evitando raw type
            No2<T> primeiroNo = refNo2EntradaFila;

            while (primeiroNo.getRefNo2() != null) {
                primeiroNo = primeiroNo.getRefNo2();
            }

            // CORREÇÃO 3: retorna T sem precisar fazer cast
            return primeiroNo.getObject();
        }

        return null;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }

        No2<T> primeiroNo = refNo2EntradaFila;
        No2<T> noAnterior = null;

        // CORREÇÃO 4: percorre a fila usando os tipos genéricos
        while (primeiroNo.getRefNo2() != null) {
            noAnterior = primeiroNo;
            primeiroNo = primeiroNo.getRefNo2();
        }

        // CORREÇÃO 5: trata separadamente a remoção do único nó
        if (noAnterior == null) {
            refNo2EntradaFila = null;
        } else {
            noAnterior.setRefNo2(null);
        }

        return primeiroNo.getObject();
    }

    public boolean isEmpty() {
        // CORREÇÃO 6: elimina a expressão condicional redundante
        return refNo2EntradaFila == null;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        No2<T> auxiliar = refNo2EntradaFila;

        if (auxiliar == null) {
            return "null";
        }

        while (auxiliar != null) {
            resultado.append("[No2{objeto=")
                     .append(auxiliar.getObject())
                     .append("}]--->");

            auxiliar = auxiliar.getRefNo2();
        }

        resultado.append("null");

        return resultado.toString();
    }
}