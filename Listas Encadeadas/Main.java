public class Main {
    public static void main(String[] args) {
        listaEncadeada<String> lEncadeada = new listaEncadeada<>();
        lEncadeada.add("Richard1");
        lEncadeada.add("Richard2");
        lEncadeada.add("Richard3");
        lEncadeada.add("Richard4");
        lEncadeada.add("Richard5");

        System.out.println(lEncadeada.get(0));
        System.out.println(lEncadeada.get(1));
        System.out.println(lEncadeada.get(2));
        System.out.println(lEncadeada.get(3));

        System.out.println(lEncadeada);

        lEncadeada.remove(3);
        System.out.println(lEncadeada);
    }
}
