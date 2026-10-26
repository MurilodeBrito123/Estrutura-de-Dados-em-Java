public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo no 1");

        No<String> no2 = new No<>("conteudo no 2");

        no1.setProximoNo(no2);/*
        no1.setProximoNo(no2);-> somente fazendo isso aqui, a alocação de memória já está
        feita no no1
        */

        No<String> no3 = new No<>("conteudo no 3");

        no2.setProximoNo(no3);

        //no1-> no2->no3->NULL

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2 + "\n\n  ");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
    }
}
