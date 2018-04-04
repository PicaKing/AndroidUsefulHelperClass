import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Vahid Vaezinia on 9/4/2017.
 */

public class StringHelper {

    public static String cutWithEtc(String string, int length) {
        if (string.length() > length && string.length() > length + 3) {
            string = string.substring(0, length);
            string = string.trim() + "...";
        } else if (string.length() > length && string.length() <= length + 3) {
            int difWithLength = string.length() + 3 - length;
            string = string.substring(0, length - difWithLength);
            string = string.trim() + "...";
        }
        return string;
    }

    public static String addNumberSeperator(String string) {

        string = NumberFormat.getNumberInstance(Locale.US).format(Integer.parseInt(string));
        return string;
    }

    public static String getEncoded(String string) {
        string = URLEncoder.encode(string);
        return string;
    }

    public static String getDecoded(String string) {
        string = URLDecoder.decode(string);
        return string;
    }

    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

}
