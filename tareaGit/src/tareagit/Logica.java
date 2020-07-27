package tareagit;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author Bladimir
 */
public class Logica {
    public String solucion;
    public void Logica(String cadena1,String cadena2){
        solucion=" ";
        String todasCompuestas[][];       
        todasCompuestas=new String[cadena1.length()][cadena1.length()];
        for (int i = 0; i < cadena1.length(); i++) {
            for (int j = 0; j < cadena1.length(); j++) {
                todasCompuestas[i][j]=NativeString.substring(cadena1, i, j+1);
                if (cadena2.contains(todasCompuestas[i][j])) {
                    if(todasCompuestas[i][j].length()>solucion.length()){
                        solucion=todasCompuestas[i][j];
                    }
                }
            }
        }
        
        System.out.println("el codigo es");
        System.out.println(""+solucion);  
    }   
}
