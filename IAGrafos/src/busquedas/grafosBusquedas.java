/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author carmelo
 */
public class grafosBusquedas {
    Map<String,LinkedHashSet<Map<String,Integer>>> g;
    BufferedReader br;
    String s1;
    
    public grafosBusquedas(){
        g = new HashMap();
        
    }
    
    /******************** Leer TXT vertice ***********/
    public void Vertices(String ruta) {        try{//path direccion del archivo
        String s2;
 
        // Cargamos el buffer con el contenido del archivo
        br = new BufferedReader (new FileReader ("src/busquedas/Vertices.txt"));
 
        try {
            // Leemos la primera linea
            s1 =  br.readLine();
        } catch (IOException ex) {
            System.out.println("Error "+ ex);
        }

        System.out.println ("La primera linea del archivo es: " + s1);
        System.out.println ("La linea tiene " + s1.length() + " caracteres");
 
        System.out.println ();
        System.out.println ("Separando la linea en trozos tenemos las siguientes palabras:");
 
        int numTokens = 0;
        StringTokenizer st = new StringTokenizer (s1);
 
        // bucle por todas las palabras
        while (st.hasMoreTokens())
        {
            s2 = st.nextToken();
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + s2);
        }
        
    }
        catch(FileNotFoundException ex){
            Logger.getLogger(grafosBusquedas.class.getName()).log(Level.SEVERE, null, ex);
            // handle it. Display an error message to the user?
        }
    
    }
    
    
    public void insertVertice( String v) {
        LinkedHashSet<Map<String,Integer>> tmp;
        if(!g.containsKey(v)) {
            g.put(v, tmp = new LinkedHashSet());
            System.out.println(""+g);
        }
    } 

    

}

