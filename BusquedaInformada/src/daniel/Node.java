/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel;

import java.util.Map;

/**
 *
 * @author daniel
 */
public class Node {
    private final String name;
    private final int dlr;
    private final int distance;
    private final boolean visitado;

    public Node(String name, int dlr, int distance, boolean visitado) { //constructor
        this.name = name;
        this.dlr = dlr;
        this.distance = distance;
        this.visitado = visitado;
    }
   
    public String getName(){
        return name;        
    }
    public int getDistanceLineaRecta(){
        return dlr;
    }
    public int getDistanceReal(){
        return distance;
    }
    public boolean getState(){
        return visitado;
    }           
    

} // end class
