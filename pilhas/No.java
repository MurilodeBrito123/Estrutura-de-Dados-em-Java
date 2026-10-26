public class No {
    private int dado;
    private No refNo = null;
    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getrefNo() {
        return refNo;
    }

    public void setrefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("No{");
        sb.append("dado=").append(dado);
        sb.append('}');
        return sb.toString();
    }

    
}
