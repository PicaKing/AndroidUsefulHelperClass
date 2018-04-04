import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vahid Vaezinia on 9/4/2017.
 */

public class FormHelper {

    public static boolean isValidMail(String email) {
        boolean check = false;
        Pattern r     = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m     = r.matcher(email);

        if (m.find()) {
            check = true;
        }

        return check;
    }

    public static boolean isValidPhone(String phone) {
        boolean check = false;
        Pattern r     = Pattern.compile("^09[0-9]{9}$");

        Matcher m = r.matcher(phone);

        if (m.find()) {
            check = true;
        }

        return check;
    }

}
