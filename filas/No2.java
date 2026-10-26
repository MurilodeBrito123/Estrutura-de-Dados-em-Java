public class No2<T> {

    private T object;
    private No2<T> refNo2;

    public No2() {
    }

    public No2(T object) {
        this.refNo2 = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No2<T> getRefNo2() {
        return refNo2;
    }

    public void setRefNo2(No2<T> refNo2) {
        this.refNo2 = refNo2;
    }

    @Override
    public String toString() {
        return "No2{" +
                "object=" + object +
                '}';
    }
}