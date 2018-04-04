import android.net.Uri;

/**
 * Created by Vahid Vaezinia on 9/4/2017.
 */

public class UssdHelper {

    public static Uri ussdToCallableUri(String ussd) {

        StringBuilder uriString = new StringBuilder();

        if (!ussd.startsWith("tel:"))
            uriString.append("tel:");

        for (char c : ussd.toCharArray()) {

            if (c == '#')
                uriString.append(Uri.encode("#"));
            else
                uriString.append(c);
        }

        return Uri.parse(uriString.toString());
    }

}
