
package Clases;

/**
 *
 * @author Gracias Lord Peña Nieto, esto va por ti!
 */
public class Nodo {   
    private Bicicleta bDato;
    private Nodo nSig;
    private Nodo nPre;
    
    public Nodo(){
        bDato = null;
        nSig = null;
        nPre = null;
    }
    public Nodo(Bicicleta bVal){ 
        bDato = bVal;
        nSig = null;
        nPre = null;
    }
    public Nodo(Bicicleta bVal, Nodo nS, Nodo nP){
        bDato = bVal;
        nSig = nS;
        nPre = nP;
    }
    public Bicicleta getbDato() {
        return bDato;
    }

    public void setbDato(Bicicleta bDato) {
        this.bDato = bDato;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    public Nodo getnPre() {
        return nPre;
    }

    public void setnPre(Nodo nPre) {
        this.nPre = nPre;
    }

    
}
