import java.util.*;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += c;
        }
        return str;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        String lPad = replicate(c,n) + s;
        return lPad;
    }

    public static String rpad(String s, int n, char c) {
        String lPad =  s + replicate(c,n);
        return lPad;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String strArr[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        return strArr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int intArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxLength < arr[i].length()){
                maxLength = arr[i].length();
            }
        }
        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int maxLength = maxLength(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i],(maxLength-arr[i].length()),c);
        }
    }

    public static String lTrim(String s){
        String str = "";
        boolean inicioPalabra = false;
        for (int i = 0; i < s.length(); i++) {
            if (inicioPalabra == false) {
                if (s.charAt(i) != ' ') {
                    str += s.charAt(i);
                    inicioPalabra = true;
                }
            }else{
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static String rTrim(String s){
        String str = "";
        boolean finPalabra = false;
        for (int i = s.length(); i >= 0; i--) {
            if (finPalabra == false) {
                if (s.charAt(i) != ' ') {
                    str += s.charAt(i);
                    finPalabra = true;
                }
            }else{
                str += s.charAt(i);
            }
        }
        return str;
    }
    public static String trim(String s){
        return rTrim(lTrim(s));
    }

    public static int indexOfN(String s, char c, int n){
        int indice = -1;
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c && contador == (n-1)){
                indice = i;
                break;
            }else{
                if (s.charAt(i) == c){
                    contador +=1;
                }
            }
        }
        return indice;
    }

}
