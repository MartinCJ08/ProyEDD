
package Clases;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author El macías y la plebada
 */
public class Grafica {

    public Grafica() {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        final String VIDEO1 = "Tutorial java";
        final String VIDEO2 = "Tutorial css";

        data.addValue(100, VIDEO1, "lunes");
        data.addValue(50, VIDEO2, "lunes");

        JFreeChart graf = ChartFactory.createBarChart("Titullo", "Dias", "Reproduccion",
                data, PlotOrientation.VERTICAL, true, true, false);//Separar por colores,muestra datos con el raton

        ChartPanel contenedor = new ChartPanel(graf);

        JFrame frmPrin = new JFrame("Graficos");
        frmPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPrin.setSize(300, 500);
        frmPrin.add(contenedor);
        frmPrin.setVisible(true);

        frmPrin.setLocationRelativeTo(null);
    }

    public Grafica(int iBueno, int iRegular, int iMalo, int iVal) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        final String BUENO = "Bueno";
        final String REGULAR = "Regular";
        final String MALO = "Malo";

        //Falta ciclo
        data.addValue(iBueno, BUENO, "lunes");
        data.addValue(iRegular, REGULAR, "lunes");
        data.addValue(iMalo, MALO, "lunes");

        JFreeChart graf = null;
        switch (iVal) {
            case 0:
                graf = ChartFactory.createBarChart("Titullo", "Cuadro", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 1:
                graf = ChartFactory.createBarChart("Titullo", "Llantas", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 2:
                graf = ChartFactory.createBarChart("Titullo", "Manubrios", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 3:
                graf = ChartFactory.createBarChart("Titullo", "Asiento", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 4:
                graf = ChartFactory.createBarChart("Titullo", "Cadena", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
        }

        //Separar por colores,muestra datos con el raton
        ChartPanel contenedor = new ChartPanel(graf);

        JFrame frmPrin = new JFrame("Graficos");
        frmPrin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmPrin.setSize(300, 500);
        frmPrin.add(contenedor);
        frmPrin.setVisible(true);

        frmPrin.setLocationRelativeTo(null);
    }

    public Grafica(Lista myList, int iVal, int iDia) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        final String BUENO = "Bueno";
        final String REGULAR = "Regular";
        final String MALO = "Malo";
        String sDia = "";

        data.addValue(myList.sumaDe(iVal, iDia, 2), BUENO, obtenerDia(iDia));
        data.addValue(myList.sumaDe(iVal, iDia, 1), REGULAR, obtenerDia(iDia));
        data.addValue(myList.sumaDe(iVal, iDia, 0), MALO, obtenerDia(iDia));

        JFreeChart graf = null;
        switch (iVal) {
            case 0:
                graf = ChartFactory.createBarChart("Refacciones", "Cuadro", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 1:
                graf = ChartFactory.createBarChart("Refacciones", "Llantas", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 2:
                graf = ChartFactory.createBarChart("Refacciones", "Manubrios", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 3:
                graf = ChartFactory.createBarChart("Refacciones", "Asiento", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 4:
                graf = ChartFactory.createBarChart("Refacciones", "Cadena", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
        }

        //Separar por colores,muestra datos con el raton
        ChartPanel contenedor = new ChartPanel(graf);

        JFrame frmPrin = new JFrame("Graficos");
        frmPrin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmPrin.setSize(300, 500);
        frmPrin.add(contenedor);
        frmPrin.setVisible(true);

        frmPrin.setLocationRelativeTo(null);
    }

    public Grafica(Lista myList, int iVal) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        final String BUENO = "Bueno";
        final String REGULAR = "Regular";
        final String MALO = "Malo";
        String sDia = "";

        //Falta ciclo
        for (int i = 0; i < 7; i++) {
            data.addValue(myList.sumaDe(iVal, i, 2), BUENO, obtenerDia(i));
            data.addValue(myList.sumaDe(iVal, i, 1), REGULAR, obtenerDia(i));
            data.addValue(myList.sumaDe(iVal, i, 0), MALO, obtenerDia(i));
        }

        JFreeChart graf = null;
        switch (iVal) {
            case 0:
                graf = ChartFactory.createBarChart("Refacciones", "Cuadro", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 1:
                graf = ChartFactory.createBarChart("Refacciones", "Llantas", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 2:
                graf = ChartFactory.createBarChart("Refacciones", "Manubrios", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 3:
                graf = ChartFactory.createBarChart("Refacciones", "Asiento", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
            case 4:
                graf = ChartFactory.createBarChart("Refacciones", "Cadena", "Cantidad",
                        data, PlotOrientation.VERTICAL, true, true, false);
                break;
        }

        //Separar por colores,muestra datos con el raton
        ChartPanel contenedor = new ChartPanel(graf);

        JFrame frmPrin = new JFrame("Graficos");
        frmPrin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmPrin.setSize(700, 500);
        frmPrin.add(contenedor);
        frmPrin.setVisible(true);

        frmPrin.setLocationRelativeTo(null);
    }

    public static String obtenerDia(int iVal) {
        String sDia = "";
        //System.out.println("iVal en obDia"+iVal);
        switch (iVal) {
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
}
