package Clases;

/**
 *
 * @author Jona black y el equipo dinámico
 */
public class Lista {

    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;
        nFin = null;
    }

    public Lista(Nodo nNuevo) {
        nIni = nNuevo;
        nFin = nNuevo;
    }

    public void agregarNodo(Nodo nNuevo) {
        if (nFin == null || nIni == null) {
            nIni = nNuevo;
            nFin = nNuevo;
        } else {
            nFin.setnSig(nNuevo);
            nNuevo.setnPre(nFin);
            nFin = nNuevo;
        }
    }

    public void imprimeLista() {
        Nodo nTemp = nIni;
        while (nTemp != null) {
            System.out.println("Cuadro:" + nTemp.getbDato().getiCuad() + " Llantas:"
                    + nTemp.getbDato().getiLlan() + " Manubrios:" + nTemp.getbDato().getiMan()
                    + " Asiento:" + nTemp.getbDato().getiAsien() + " Cadena:"
                    + nTemp.getbDato().getiCad() + " Fecha:" + nTemp.getbDato().getiDia());
            //System.out.println("VALOR = " + nTemp.getiDato());
            nTemp = nTemp.getnSig();
        }
        System.out.println("----------------------");
    }

    public void insertarNodoEn(Nodo nNuevo, int iPos) throws Exception {
        int iLenght = length();
        if (iLenght == 0) { //LISTA SIN NODOS
            throw new Exception("Lista esta vacia, no se pueden insertar nodos");
        } else if (iPos < 0) {
            throw new Exception("La posicion no puede ser menor a 0");
        } else if (iPos >= iLenght) {
            throw new Exception("Posicion invalida, debe insertar en posiciones menores a " + iLenght);
        } else//INSERTAMOS EL NODO
        //POSICION EN CERO
         if (iPos == 0) {
                agregarInicio(nNuevo);
            } else {
                Nodo nTemp = nIni;
                for (int i = 1; i < iPos; i++) { //for porque sabemos cuantas veces lo vamos a usar
                    nTemp = nTemp.getnSig();
                }
                nNuevo.setnSig(nTemp.getnSig());
                nTemp.setnSig(nNuevo);
                nTemp.getnSig().setnPre(nNuevo);
                nNuevo.setnPre(nTemp);
            }
    }

    public void borrarNodoEn(int iPos) throws Exception {
        int iLenght = length();
        if (iLenght == 0) {
            throw new Exception("Lista esta vacia, no se pueden eliminar nodos");
        } else if (iPos < 0) {
            throw new Exception("no se pueden eliminar nodos menores a 0");
        } else if (iPos >= iLenght) {//iPos >= iLength
            throw new Exception("Posicion invalida, debe eliminar nodos menores a " + iLenght);
        } else if (iPos == 1) {
            nIni = nIni.getnSig();

        } else if (iPos == iLenght) {
            nFin = nFin.getnPre();
            nFin.setnSig(null);
        } else {
            Nodo nTemp = nIni;
            for (int i = 1; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.getnSig().setnPre(nTemp.getnPre());
            nTemp.getnPre().setnSig(nTemp.getnSig());
        }
    }

    public void agregarInicio(Nodo nNuevo) {
        nNuevo.setnSig(nIni);
        nIni = nNuevo;

        if (nFin == null) {
            nFin = nIni; //nFin siempre tine que apntar al final de la lista
        }
    }

    public int length() {
        Nodo nTemp = nIni;
        int iCont = 0;
        while (nTemp != null) {
            iCont++;
            nTemp = nTemp.getnSig();
        }
        return iCont;
    }

    public Nodo leerNodoEn(int iPos) throws Exception {
        int iLenght = length();
        Nodo nValor = null;

        if (iLenght == 0) {//Lista sin nodos
            throw new Exception("Lista vacía, no se puede devolver");
        } else if (iPos < 0) {
            throw new Exception("Posicion menor a 0, ahorita no se puede");
        } else if (iPos >= iLenght) {
            throw new Exception("Posición inválida, se excede");
        } else {//insertar Nodo
            //Posicion inicio

            //nIni = nIni.getnSig();
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            nValor = nTemp;

            //nValor = nTemp.getiDato();
        }
        return nValor;
    }

    public int leerValorEn(int iPos, int iAtri) throws Exception {
        int iLenght = length();
        int iVal = 0;

        if (iLenght == 0) {//Lista sin nodos
            throw new Exception("Lista vacía, no se puede devolver");
        } else if (iPos < 0) {
            throw new Exception("Posicion menor a 0, ahorita no se puede");
        } else if (iPos >= iLenght) {
            throw new Exception("Posición inválida, se excede");
        } else {//insertar Nodo
            //Posicion inicio

            //nIni = nIni.getnSig();
            Nodo nTemp = nIni;
            for (int i = 1; i <= iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            //iCuad, iLlan, iMan, iAsien, iCad, iDia; 

            switch (iAtri) {
                case 0: {
                    iVal = nTemp.getbDato().getiCuad();
                    break;
                }
                case 1: {
                    iVal = nTemp.getbDato().getiLlan();
                    break;
                }
                case 2: {
                    iVal = nTemp.getbDato().getiMan();
                    break;
                }
                case 3: {
                    iVal = nTemp.getbDato().getiAsien();
                    break;
                }
                case 4: {
                    iVal = nTemp.getbDato().getiCad();
                    break;
                }
                case 5: {
                    iVal = nTemp.getbDato().getiDia();
                    break;
                }
            }
        }
        return iVal;
    }

    public int sumaDe(int iVal, int iDia, int iCond) {//Val = obejeto dia = dia iCond = condicion
        int iSuma = 0;
        Nodo nTemp = nIni;
        while (nTemp != null) {
            switch (iVal) {
                case 0:
                    if (nTemp.getbDato().getiCuad() == iCond && nTemp.getbDato().getiDia() == iDia) {
                        iSuma++;
                    }
                    break;
                case 1:
                    if (nTemp.getbDato().getiLlan() == iCond && nTemp.getbDato().getiDia() == iDia) {
                        iSuma++;
                    }
                    break;
                case 2:
                    if (nTemp.getbDato().getiMan() == iCond && nTemp.getbDato().getiDia() == iDia) {
                        iSuma++;
                    }
                    break;
                case 3:
                    if (nTemp.getbDato().getiAsien() == iCond && nTemp.getbDato().getiDia() == iDia) {
                        iSuma++;
                    }
                    break;
                case 4:
                    if (nTemp.getbDato().getiCad() == iCond && nTemp.getbDato().getiDia() == iDia) {
                        iSuma++;
                    }
                    break;
            }

            nTemp = nTemp.getnSig();
        }
        return iSuma;
    }

    public String obtenerDia(int iDia) {
        String sDia = "";
        switch (iDia) {
            case 0: {
                sDia = "Lunes";
                break;
            }
            case 1: {
                sDia = "Martes";
                break;
            }
            case 2: {
                sDia = "Miércoles";
                break;
            }
            case 3: {
                sDia = "Jueves";
                break;
            }
            case 4: {
                sDia = "Viernes";
                break;
            }
            case 5: {
                sDia = "Sábado";
                break;
            }
            case 6: {
                sDia = "Domingo";
                break;
            }
        }
        return sDia;
    }

    //iCuad, iLlan, iMan, iAsien, iCad, iDia;
    public String obtenerAtributo(int iAtri) {
        String sAtri = "";
        switch (iAtri) {
            case 0: {
                sAtri = "Cuadro";
                break;
            }
            case 1: {
                sAtri = "Llantas";
                break;
            }
            case 2: {
                sAtri = "Manubrios";
                break;
            }
            case 3: {
                sAtri = "Asiento";
                break;
            }
            case 4: {
                sAtri = "Cadena";
                break;
            }
        }
        return sAtri;
    }

    public String obtenerCalidad(int iCal) {
        String sCal = "";
        switch (iCal) {
            case 0: {
                sCal = "Malo";
                break;
            }
            case 1: {
                sCal = "Regular";
                break;
            }
            case 2: {
                sCal = "Bueno";
                break;
            }
        }
        return sCal;
    }

    public int moda(int iAtri) {
        int iMaxR=0, iModa = 0, lenght = length();
        for (int i = 0; i < lenght; i++) {
            int iRep = 0;
            for (int j = 0; j < lenght; j++) {
                try {
                    if (leerValorEn(i, iAtri) == leerValorEn(j, iAtri)) {
                        iRep++;
                    }

                    if (iRep > iMaxR) {
                        iModa = leerValorEn(i, iAtri);
                        iMaxR = iRep;
                    }
                } catch (Exception ex) {
                    //Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                    //System.out.println("Aquí no ha pasado nada");
                }
            }
        }
        return iModa;
    }

    public int moda(int iAtri, int iDia) {
        int iModa = 0, iBueno, iRegular, iMalo;
        iBueno = sumaDe(iAtri, iDia, 2);
        iRegular = sumaDe(iAtri, iDia, 1);
        iMalo = sumaDe(iAtri, iDia, 0);

        if (iBueno > iRegular && iBueno > iMalo) {
            iModa = 2;
        } else if (iRegular > iBueno && iRegular > iMalo) {
            iModa = 1;
        } else {
            iModa = 0;
        }
        return iModa;
    }

    public double media(int iAtri, int iCond) {
        double media = 0.0, iLength = length();

        //Fuerza bruta!!!!1!!cos(0)1!
        for (int i = 0; i < 7; i++) {
            media+=sumaDe(iAtri, i, iCond);
        }

        media = media / iLength;
        return media;
    }
}
