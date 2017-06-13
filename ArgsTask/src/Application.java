import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by alina on 13.06.17.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        InputStream file = new FileInputStream(args[0]);
        InputStreamReader is = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(is);
        String n;
        n = br.readLine();
        String [] string_array = new String[Integer.parseInt(n)];
        for(int i=0; i<Integer.parseInt(n); i++){
            string_array[i] = br.readLine();
        }

        String min = string_array[0];
        String max = string_array[0];

        for(int i=0; i<string_array.length-1; i++){
            min = min_string(min, string_array[i+1]);
            max = max_string(max, string_array[i+1]);
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static String min(String first, String second){
        if (first.length() < second.length()){
            return first;
        }else{
            return second;
        }
    }
    public static String min_string(String first, String second){
        String min = new String();
        for (int i=0; i < min(first, second).length(); i++ ){
            if (first.charAt(i) < second.charAt(i)){
                min = first;
                break;
            }
            else if(first.charAt(i) > second.charAt(i)){
                min = second;
                break;
            }
            else{
                min = first;
            }
        }
        return min;
    }
    public static String max_string(String first, String second){
        String max = new String();
        for (int i=0; i < min(first, second).length(); i++ ){
            if (first.charAt(i) > second.charAt(i)){
                max = first;
                break;
            }
            else if(first.charAt(i) < second.charAt(i)){
                max = second;
                break;
            }
            else{
                max = first;
            }
        }
        return max;
    }
}
