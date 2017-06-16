/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simplex;

/**
 * @author Edwin
 * @see www.edwincamino.blogspot.com
 * @version 4.0
 */
public class Restriccion {
    protected double subindices[];
    protected int desigualdad;
    protected double valorZ;
    /*
     * Es el valor del lado derecho
     */
    double solucion;
    public Restriccion(double[] subindicesn,int desigualdadn,double valorObjn,double valZ){
        subindices=subindicesn;
        desigualdad=desigualdadn;
        solucion=valorObjn;
        valorZ=valZ;
         ladoDerechoPositivo();
    }

    private void ladoDerechoPositivo(){
        if(solucion<0){
            solucion*=-1;
            desigualdad*=-1;
            for(int i=0;i<subindices.length;i++){
               if(subindices[i]!=0){
                    subindices[i]*=-1;
                }
            }
        }
    }
}
