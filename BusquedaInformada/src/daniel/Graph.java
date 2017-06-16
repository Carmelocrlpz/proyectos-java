
package daniel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author daniel
 */
public class Graph {
    Map<String, LinkedHashSet<Node>> g;
    
    public Graph(){
        g = new HashMap();
    }
    
    public void insertVertice(String v){
        LinkedHashSet <Node> vecinos;
        if(!g.containsKey(v)){
            g.put(v, vecinos = new LinkedHashSet());
        } // end if
    } // end method
    
    public void insertArista(String o, String d,int dlr, int p, boolean v){
        LinkedHashSet <Node> vecinos;
        if(g.containsKey(o) && g.containsKey(d)){
            vecinos = g.get(o);
            vecinos.add(new Node(d,dlr,p,v));
        } //end if
    } // end method
    
    public Set<String> getVertices() {
        for (Map.Entry<String, LinkedHashSet<Node>> n : g.entrySet()) {
            System.out.println("" + n.getKey());
        }
        return g.keySet();
    }
    
    @SuppressWarnings("empty-statement")
     public LinkedHashSet<Node> getNeighbor(String o){                 
        if(g.containsKey(o)){
             return g.get(o);            
        }
            return null;                     
    }
    
    public int getDistanciaRecta(String o, String d){
        LinkedHashSet <Node> vecinos;
        int value=-1;
        if(g.containsKey(o) && g.containsKey(d)){
            vecinos = g.get(o);
            for(Iterator <Node> it = vecinos.iterator(); it.hasNext();){ 
                Node obj = it.next();
                if(d.equals(obj.getName())){
                    return obj.getDistanceLineaRecta();
                }
            } //end for
        } //end for
        return value; 
    } //end method
    
    public int getDistanciaReal(String o, String d){
        LinkedHashSet <Node> vecinos;        
        int value=-1;
        if(g.containsKey(o) && g.containsKey(d)){
            vecinos = g.get(o);
            for(Iterator <Node> it = vecinos.iterator(); it.hasNext();){ 
                Node obj = it.next();
                    if(d.equals(obj.getName())){
                    return obj.getDistanceReal();
                }
        }
        
    }return value;
    }
    
    public void getAEstrella(String o, String d){  
        Stack<String> pila = new Stack<String>();
        LinkedHashSet<Node> vecinos= new LinkedHashSet();
        List<Map<String,Integer>> lista = new ArrayList();
        Map<String, Integer> mp;
        Map<String,Integer> var;
        Set<String> visitados = new HashSet();
        if(g.containsKey(o) && g.containsKey(d) && !o.equals(d)){
            pila.add(o);
            while(!pila.isEmpty()){
                vecinos.addAll(this.getNeighbor(pila.peek()));
                for(Iterator <Node> it= vecinos.iterator(); it.hasNext();){
                    Node obj = it.next(); 
                    mp = new HashMap();
                    mp.put(obj.getName(), obj.getDistanceLineaRecta() + obj.getDistanceReal());
                    lista.add(mp);                               
                }
                
                  var=this.MIN(lista);                    
                  for(Map.Entry<String,Integer> mpa: var.entrySet()){
                      if(mpa.getKey().equals(d)){
                          System.out.println(pila);
                          System.out.println("Encontrado");
                          pila.clear();
                      }else{
                          pila.add(mpa.getKey());
                      }                      
                  }
            }          
        } 
    //value = this.getDistanciaRecta(o, d) + this.getDistanciaReal(o, d);    
    }
    public Map<String,Integer> MIN (List<Map<String,Integer>> lista){
        Map<String,Integer> tmp;
        Map<String,Integer> tmp2= new HashMap();
        int min=lista.get(0).entrySet().iterator().next().getValue();
        String name = lista.get(0).entrySet().iterator().next().getKey();
        int value = lista.get(0).entrySet().iterator().next().getValue();
        for(Iterator<Map<String,Integer>> it=lista.iterator(); it.hasNext();){
            tmp = it.next();            
            for(Map.Entry<String,Integer> mp: tmp.entrySet()){
                if(mp.getValue()<min){
                        name=mp.getKey();
                        value=mp.getValue();                        
                }
               min=mp.getValue();                            
            }
        }
        tmp2.put(name, value);
        return tmp2;
    }
    
    /*public int MIN(Set<Integer> val){        
         int result=0; 
         result=Collections.min(val);    
         return result;
    } */
    
       public void File(String archivo) throws FileNotFoundException, IOException {        
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);           
        while((cadena = b.readLine())!=null) {            
            this.insertVertice(cadena);            
        }
        b.close();
    }
  
} //end class
