public class No {
    private Object obj;
    private No refNo;

    public No(){}

    public No(Object obj) {
        this.refNo = null;
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    
    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("No{");
        sb.append("obj=").append(obj);
        sb.append('}');
        return sb.toString();
    }

    
}
