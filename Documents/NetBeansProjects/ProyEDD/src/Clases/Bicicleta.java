
package Clases;

/**
 *
 * @author Martin and the lollipopbitches
 */
public class Bicicleta {    
    
    //Lunes-0, Martes-1,Miercoles-2,Jueves-3,Viernes-4,Sabado-5,Domingo-6
    private Bicicleta bSig, bPrev;
    private int iCuad, iLlan, iMan, iAsien, iCad, iDia;  

    public Bicicleta(int iCuad, int iLlan, int iMan, int iAsien,
            int iCad, int iDia) {
        this.iCuad = iCuad;
        this.iLlan = iLlan;
        this.iMan = iMan;
        this.iAsien = iAsien;
        this.iCad = iCad;
        this.iDia = iDia;
    }
    
    public Bicicleta(int iCuad, int iLlan, int iMan, int iAsien, int iCad) {
        this.bPrev = null;
        this.bSig = null;
        this.iCuad = iCuad;
        this.iLlan = iLlan;
        this.iMan = iMan;
        this.iAsien = iAsien;
        this.iCad = iCad;
        iDia = 0;        
    }

    public Bicicleta(Bicicleta bSig, Bicicleta bPrev, int iCuad, 
            int iLlan, int iMan, int iAsien, int iCad) {
        this.bSig = bSig;
        this.bPrev = bPrev;
        this.iCuad = iCuad;
        this.iLlan = iLlan;
        this.iMan = iMan;
        this.iAsien = iAsien;
        this.iCad = iCad;
    }

    public Bicicleta() {
         this.bSig = null;
        this.bPrev = null;
        this.iCuad = 0;
        this.iLlan = 0;
        this.iMan = 0;
        this.iAsien = 0;
        this.iCad = 0;
    }

    /**
     * @return the bSig
     */
    public Bicicleta getbSig() {
        return bSig;
    }

    /**
     * @param bSig the bSig to set
     */
    public void setbSig(Bicicleta bSig) {
        this.bSig = bSig;
    }

    /**
     * @return the bPrev
     */
    public Bicicleta getbPrev() {
        return bPrev;
    }

    /**
     * @param bPrev the bPrev to set
     */
    public void setbPrev(Bicicleta bPrev) {
        this.bPrev = bPrev;
    }

    /**
     * @return the iCuad
     */
    public int getiCuad() {
        return iCuad;
    }

    /**
     * @param iCuad the iCuad to set
     */
    public void setiCuad(int iCuad) {
        this.iCuad = iCuad;
    }

    /**
     * @return the iLlan
     */
    public int getiLlan() {
        return iLlan;
    }

    /**
     * @param iLlan the iLlan to set
     */
    public void setiLlan(int iLlan) {
        this.iLlan = iLlan;
    }

    /**
     * @return the iMan
     */
    public int getiMan() {
        return iMan;
    }

    /**
     * @param iMan the iMan to set
     */
    public void setiMan(int iMan) {
        this.iMan = iMan;
    }

    /**
     * @return the iAsien
     */
    public int getiAsien() {
        return iAsien;
    }

    /**
     * @param iAsien the iAsien to set
     */
    public void setiAsien(int iAsien) {
        this.iAsien = iAsien;
    }

    /**
     * @return the iCad
     */
    public int getiCad() {
        return iCad;
    }

    /**
     * @param iCad the iCad to set
     */
    public void setiCad(int iCad) {
        this.iCad = iCad;
    }

    /**
     * @return the iDia
     */
    public int getiDia() {
        return iDia;
    }

    /**
     * @param iDia the iDia to set
     */
    public void setiDia(int iDia) {
        this.iDia = iDia;
    }

    
}
