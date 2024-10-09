public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();
        System.out.println(lista.vazia());
        lista.postFirst(30);
        lista.postFirst(15);
        lista.postFirst(15);
        lista.postUltimo(40);
        lista.mostrar();
        System.out.println(lista.vazia());
        System.out.println("Foi escolhido: " + lista.getFirst().getProximo().getInfo());
        System.out.println("Valor buscado: " + lista.buscar(20));
        lista.removeFirst();
        lista.mostrar();
    }
}