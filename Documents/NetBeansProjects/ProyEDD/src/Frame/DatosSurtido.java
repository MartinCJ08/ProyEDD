package Frame;

/**
 *
 * @author Phoenix
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class DatosSurtido implements Serializable {
    
    private String siD;
    private String sPedido;
    private String sPrecio;
    private String sDireccion;
    private String sTelefono;
    private String sFechaPedido;
    private String sFechaEnvio;


    
    /**
     *
     * 
     * @param sPedido
     * @param sPrecio
     * @param sDireccion
     * @param sTelefono
     * @param sFechaPedido
     * @param sFechaEnvio
     */

    
    
    
    public DatosSurtido(String sPedido, String sPrecio,
            String sDireccion, String sTelefono, String sFechaPedido, 
            String sFechaEnvio) throws IOException {
        
        siD = String.valueOf(getLastID("data.dat"));
        this.sPedido = sPedido;
        this.sPrecio = sPrecio;
        this.sDireccion = sDireccion;
        this.sTelefono = sTelefono;
        this.sFechaPedido = sFechaPedido;
        this.sFechaEnvio = sFechaEnvio;
    }

    DatosSurtido() throws IOException {
        siD = String.valueOf(getLastID("data.dat"));
        sPedido = "XXXXX";
        sPrecio = "0";
        sDireccion = "XXXXX";
        sTelefono = "XXXXX";
        sFechaPedido = "XX/XX/XX";
        sFechaEnvio = "XX/XX/XX";    
    }
    
    //Getters

    public String getsPedido() {
        return sPedido;
    }
    public String getsPrecio() {
        return sPrecio;
    }
    public String getsDireccion() {
        return sDireccion;
    }
    public String getsTelefono() {
        return sTelefono;
    }
    public String getsFechaPedido() {
        return sFechaPedido;
    }
    public String getsFechaEnvio() {
        return sFechaEnvio;
    }

    public String getSiD() {
        return siD;
    }
    
    //Setters

    public void setsPedido(String sPedido) {
        this.sPedido = sPedido;
    }
    public void setsPrecio(String sPrecio) {
        this.sPrecio = sPrecio;
    }
    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }
    public void setsTelefono(String sTelefono) {
        this.sTelefono = sTelefono;
    }
    public void setsFechaPedido(String sFechaPedido) {
        this.sFechaPedido = sFechaPedido;
    }
    public void setsFechaEnvio(String sFechaEnvio) {
        this.sFechaEnvio = sFechaEnvio;
    }
    
    public int getLastID(String file) throws FileNotFoundException, IOException{
        int n = 1;
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));
        while(br.ready()){
            if(br.readLine() != null){
            n++;
            }
            else{
                break;
            }
            
        }
        return n;
    }
    
    @Override
	public String toString() {
		return new StringBuffer(" ID:"+this.siD)
                                .append(" Pedido:"+this.sPedido)
				.append(" Precio:"+this.sPrecio)
                                .append(" Direccion:"+this.sDireccion)
                                .append(" Telefono:"+this.sTelefono)
                                .append(" FechaP:"+this.sFechaPedido)
                                .append(" FechaE:"+this.sFechaEnvio+"\n")
                                .toString();
	}
    
    
}
