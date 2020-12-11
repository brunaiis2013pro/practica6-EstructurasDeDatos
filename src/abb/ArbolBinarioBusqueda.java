package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;

    }
    public boolean estaVacio(){
        return raiz == null;
    }

    private void insertar(Nodo padre, Nodo hijo, int dato){
        if(hijo == null){//caso base
            Nodo nuevo = new Nodo(null, dato, null);
            if(dato >= padre.getDato()){
                padre.setDerecho(nuevo);
            }else{
                padre.setIzquierdo(nuevo);
            }
        }else{
            if(dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecho(), dato);
            }else{
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    //metodo auxiliar
    public void insertar(int dato){
        if ( estaVacio()){
                Nodo nuevo = new Nodo(null,dato,null);
                raiz = nuevo;
        }else{
            if(dato >= raiz.getDato()){
                insertar(raiz, raiz.getDerecho(), dato);
            }else{
                insertar(raiz, raiz.getIzquierdo(),dato);
            }
        }
    }

    //metodo recursiva para recorrer/mostrar el arbol inOrden
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else{//llamada recursiva
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            mostrarInOrden(nodo.getDerecho());
        }
    }


    //metodo recursiva para recorrer/mostrar el arbol preOrden
    private void mostrarPreOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else{//llamada recursiva
            System.out.print(nodo.getDato() + " ");
            mostrarPreOrden(nodo.getIzquierdo());

            mostrarPreOrden(nodo.getDerecho());
        }
    }

    //metodo recursiva para recorrer/mostrar el arbol postOrden
    private void mostrarPostOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else{//llamada recursiva

            mostrarPostOrden(nodo.getIzquierdo());

            mostrarPostOrden(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }

    //metodo auxiliar para reccorrer/mostrar el arbol inOrden

    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }

    //metodo auxiliar para reccorrer/mostrar el arbol preOrden
    public void mostrarPreOrden(){
        Nodo temp = raiz;
        mostrarPreOrden(raiz);
        System.out.println();
    }

    //metodo auxiliar para reccorrer/mostrar el arbol postOrden
    public void mostrarPostOrden(){
        Nodo temp = raiz;
        mostrarPostOrden(raiz);
        System.out.println();
    }

}
