package tareagit;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author Bladimir
 */
public class Logica {
    public String solucion;
    public void Logica(String cadena1,String cadena2){
        //variable para la solucion
        solucion=" ";
        //matriz que genera para tomar toda las combinaciones de palabras
        String todasCompuestas[][];       
        //definiendo tama;o de la matris
        todasCompuestas=new String[cadena1.length()][cadena1.length()];
        //for para el llenado y la creasion de datos 
        for (int i = 0; i < cadena1.length(); i++) {
            for (int j = 0; j < cadena1.length(); j++) {
                //llenando la matris con la descomposision de cadena 1
                todasCompuestas[i][j]=NativeString.substring(cadena1, i, j+1);
                //usando metodo para verificar si la cadena existe dentro de cadena 2
                if (cadena2.contains(todasCompuestas[i][j])) {
                    //metodo para buscar la cadena mas grande que exista dentro de cadena 2
                    if(todasCompuestas[i][j].length()>solucion.length()){
                        //cambia las cadenas para tener solo una solucion
                        solucion=todasCompuestas[i][j];
                    }
                }
            }
        }
        
        System.out.println("el codigo es");
        System.out.println(""+solucion);  
    }   
}
