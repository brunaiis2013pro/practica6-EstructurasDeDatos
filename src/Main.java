import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args){
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        /*
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);
        */

        abb.insertar(8);
        abb.insertar(4);
        abb.insertar(10);
        abb.insertar(12);
        abb.insertar(1);


        //recorremos/mostramos los elementos del arbol inOrden
        System.out.print("inOrden: ");
        abb.mostrarInOrden();
        System.out.println();

        System.out.print("preOrden: ");
        abb.mostrarPreOrden();
        System.out.println();


        System.out.print("postOrden: ");
        abb.mostrarPostOrden();
        System.out.println();


    }
}
