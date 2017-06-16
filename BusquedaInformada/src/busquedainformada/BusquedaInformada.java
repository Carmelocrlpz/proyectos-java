/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedainformada;

import daniel.Graph;
import java.io.IOException;

/**
 *
 * @author C7
 */
public class BusquedaInformada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Graph g = new Graph();  
       // g.File("C:/Users/CR-26/Documents/LeerArchivo/Edge.txt");
        g.insertVertice("oradea");
        g.insertVertice("zerind");
        g.insertVertice("arad");
        g.insertVertice("timisoara");
        g.insertVertice("lugoj");
        g.insertVertice("mehadia");
        g.insertVertice("drobeta");
        g.insertVertice("sibiu");
        g.insertVertice("fagaras");
        g.insertVertice("rimnicu vilcea");
        g.insertVertice("pitesti");
        g.insertVertice("craiova");
        g.insertVertice("bucarest");
        g.insertVertice("giurgiu");
        g.insertVertice("urziceni");
        g.insertVertice("hirsova");
        g.insertVertice("eforie");
        g.insertVertice("vaslui");
        g.insertVertice("lasi");
        g.insertVertice("neamt"); 
        
        g.insertArista("arad", "zerind", 374, 75, false);
        g.insertArista("arad", "sibiu", 253, 140, false);        
        g.insertArista("arad", "timisoara", 329, 118, false);
        g.insertArista("zerind", "arad",366, 75, false);
        g.insertArista("zerind", "oradea", 380, 71, false);
        g.insertArista("oradea", "zerind", 374, 71, false);
        g.insertArista("oradea", "sibiu", 253, 151, false);
        g.insertArista("sibiu", "arad", 366, 140, false);
        g.insertArista("sibiu", "fagaras", 176, 99, false);
        g.insertArista("sibiu", "rimnicu vilcea", 193, 80, false);
        g.insertArista("fagaras", "sibiu", 253, 99, false);
        g.insertArista("fagaras", "bucarest", 0, 211, false);
        g.insertArista("rimnicu vilcea", "sibiu", 253, 80, false);                            
        g.insertArista("rimnicu vilcea", "craiova", 160, 146, false);
        g.insertArista("rimnicu vilcea", "pitesti", 100, 97, false);
        g.insertArista("pitesti", "rimnicu vilcea", 193, 97, false);
        g.insertArista("pitesti", "bucarest", 0, 101, false);
        g.insertArista("pitesti", "craiova", 160, 138, false);
        g.insertArista("craiova", "rimnicu vilcea", 193, 146, false);
        g.insertArista("craiova", "pitesti", 100, 138, false);
        g.insertArista("craiova", "drobeta", 242, 120, false);
        g.insertArista("drobeta", "craiova", 160, 120, false);
        g.insertArista("drobeta", "mehadia", 241, 75, false);
        g.insertArista("mehadia", "drobeta", 242, 75, false);
        g.insertArista("mehadia", "lugoj", 244, 70, false);
        g.insertArista("lugoj", "mehadia", 241, 70, false);
        g.insertArista("lugoj", "timisoara", 329, 111, false);      
        g.insertArista("timisoara", "arad", 366, 118, false);                        
        g.insertArista("timisoara", "lugoj", 244, 111, false);
        
        System.out.println("timisoara " + " sibiu " + g.getDistanciaRecta("lugoj", "craiova"));
        //System.out.println("arad " + " sibiu " + g.getDistanciaReal("drobeta", "craiova"));
        //System.out.println("A* " + g.getDistanceA("drobeta", "craiova"));
        //g.getNeighbor("arad");
        //g.getAEstrella("timisoara","bucarest");
        //g.getVertices();
       
        
        
    }
    
}
