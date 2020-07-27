package Backend;

import UI.JFInterfaz;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jara
 */
public class Logica {

    //Declaramos las variables de forma globas de las cuales haremos uso
    //2 arrays que guardan la cadena de ADN
    ArrayList<String> arreglo1 = new ArrayList<String>();
    ArrayList<String> arreglo2 = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);
    //2 Strings que serviran para guardar lo que ingresen el usuario
    String s1, s2;
    String iguales = "";

    //Este metodo se usa para guardar las cadenas de ADN que ingresan en Strings 
    //Luego mandaran como parametro esas mismos Strings para los metodos que descompondran la cadena y guardar asi como un arreglo de letras
    /*public void cadenas() {
        System.out.println("Bienvenido"+"\n"+
                "\n"+"Este programa le permitira comparar cadenas de ADN"
                +"\n"+"Ingrese la primera cadena de ADN:");
        s1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena de ADN:");
        s2 = sc.nextLine();
        
        cadena1(s1);
        cadena2(s2);
        buscador();
    }
     */
    //Descompone la cadena que ingreso(split) y la recorremos para guardarla en un arraylist
    public void cadena1(String cadena1) {
        String[] c1 = cadena1.split("");

        for (int i = 0; i < cadena1.length(); i++) {
            int a = 0;
            for (int j = 0; j < cadena1.length() - i; j++) {
                String tmp = "";
                for (int k = 0; k < i + 1; k++) {
                    a = j + k;
                    tmp += c1[a];
                }
                arreglo1.add(tmp);
            }
        }

    }
    //Descompone la cadena que ingreso(split) y la recorremos para guardarla en un arraylist
    public void cadena2(String cadena2) {
        String[] c2 = cadena2.split("");

        for (int i = 0; i < cadena2.length(); i++) {
            int a = 0;
            for (int j = 0; j < cadena2.length() - i; j++) {
                String tmp = "";

                for (int k = 0; k < i + 1; k++) {
                    a = j + k;
                    tmp += c2[a];
                }
                arreglo2.add(tmp);
            }
        }

    }

    //Busca las letras en los dos arreglos que sean comunes y consecutivas; se guarda en un String que sera la cadena respuesta
    public void buscador() {
        for (int j = 0; j < arreglo1.size(); j++) {
            for (int i = 0; i < arreglo2.size(); i++) {
                if (arreglo1.get(j).equals(arreglo2.get(i))) {
                    iguales = arreglo1.get(j);
                }
            }
        }
        System.out.println("\n" + iguales + "\n" + "Es el conjunto ordenado de bases adyacentes de mayor tamaño que se encuentra en ambas formas de vida.");
        //Muestra un Mensaje al usuario con el resultado
        JOptionPane.showMessageDialog(null, iguales+"\n"+"Es el conjunto ordenado de bases adyacentes de mayor tamaño que se encuentra en ambas formas de vida.");
    }
}
