package mainbicycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Bicycle implements Comparable<Bicycle>{
    private String name;
    private int matricula;
    
    public Bicycle(String name,int matricula){
        this.name= name;
        this.matricula = matricula;
    }//end constructor
    
    public String getName(){
        return name;
    }
    
    public int getMat(){
        return matricula;
    }
    public int compareTo(Bicycle obj){
        int result = ((Bicycle)obj).getMat();
        
        return matricula - result;
    }
    
    public static Comparator<Bicycle> comparador = new Comparator<Bicycle>() {
        public int compare(Bicycle own1, Bicycle own2){
            return own1.getName().toLowerCase().compareTo(own2.getName().toLowerCase());
        }
        
    };
}// end class

class OwnBicycle{//dueño bicicleta
    private List<Bicycle>lista;
    
    public OwnBicycle(){
        lista = new ArrayList();
    }//end constructor
    
    public void insertar(String name, int mat){
        
        lista.add(new Bicycle(name, mat));
    }
    
    public void imprimir(){
        for (Iterator<Bicycle> it = lista.iterator(); it.hasNext();) {
            Bicycle b = it.next();
            System.out.println(""+b.getName()+ " : "+b.getMat());
        }//end for
    }//end method
    
    public void ordenarPorMatricula(){
        Collections.sort(lista);
    }
    
    public void ordenarPorNombre(){
        Collections.sort(lista, Bicycle.comparador);
    }
    
}//end class

public class MainBicycle {

    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        OwnBicycle obj = new OwnBicycle();
        String name;
        int mat;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre? ");
            name = lectura.next();
            System.out.println("Matricula? ");
            mat = lectura.nextInt();
            
            obj.insertar(name, mat);
        }//end for
        System.out.println("");
        System.out.println("Ordenar Por Matricula");
        obj.ordenarPorMatricula();
        obj.imprimir();
        System.out.println("");
        System.out.println("Ordenar Por Nombre");
        obj.ordenarPorNombre();
        obj.imprimir();
        
    }//end method main
    
}
