public class Lista {
    @SuppressWarnings("unused")
    private static final Object no = null;
    private No First;

    public Lista() {
        First = null;
    }
    public No getFirst() {
        return First;
    }
    public boolean vazia() {

        if (First == null) {
            return true;
        } else {
            return false;
        }
    }

    public void postFirst(int valor) {
        No no1 = new No(valor);
        no1.setProximo(First);
        First = no1;
    }
    public String buscar(int valor) {
        int index = 0;
        No cursor = First;
        while (cursor != null) {
            if (cursor.getInfo() == valor) {
                return "Valor encontrado no nó " + index;
            }
            index++;
            cursor = cursor.getProximo();
        }
        return "Não encontrado. Executando " + index + " passos";
    }

    public void mostrar() {
        if (vazia()) {
            System.out.println("Lista vazia");
        } else {

            No cursor = First;
            while (cursor != null) {
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }
    }
    public void postUltimo(int valor) {
        if (vazia()) {
            postFirst(valor);
        } else {
            No cursor = First;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);

        }
    }
    public void postEntreNos(No no, int valor) {
        No no1 = new No(valor);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);
    }
   public No removeFirst() {

        if (vazia()) {
            System.out.println("Esta vazia, ação de tirar invalida");
            return null;
        } else {
            No cursor = First;
            First = First.getProximo();
            return cursor;
        }
    }
}