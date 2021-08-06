package Main;
import Identificador.Identificador;
import java.io.File;
import Identificador.Procesos;
/**
 *
 * @author Oscar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String ruta = "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\Identificador\\src";
        generarLexer(ruta);
        Identificador n = new Identificador();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        n.setTitle("Identificador");
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        //JFlex.Main.generate(archivo);
    }
}
