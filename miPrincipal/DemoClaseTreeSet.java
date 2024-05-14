package miPrincipal;
//Proposito demostrar la clase  TreeSet que provee java
//como un arbol de busqueda binaria
import java.util.TreeSet;

import javax.sound.midi.Soundbank;

import java.util.Iterator;

public class DemoClaseTreeSet {
  
    public static void main(String[] args) {
        //Crea el arbol de busqueda
        TreeSet<Integer> t = new TreeSet<Integer>();
        //Insertar algunos elementos
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);

        //Mosrar elementos del arbol
        System.out.println("Muestra los elementos de la coleccion");
        for(Iterator<Integer> it = t.iterator();it.hasNext(); ){
            System.out.println(it.next() );
        }

        //Buscar elementos
        System.out.println(t.contains(5) );
        System.out.println(t.contains(8) );
        //Eliminar algunos elementos
        t.remove(3);
        System.out.println("Muestra los elementos despues de la eliminacion");
        for(Iterator<Integer> it = t.iterator();it.hasNext(); ){
            System.out.println(it.next() );
        }

        System.out.println("tamaño="+t.size() );
        
        System.out.println(t.first() );
        System.out.println("------");
        System.out.println(t.last() );
       
    }
}
