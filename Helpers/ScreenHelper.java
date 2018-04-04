import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by Vahid Vaezinia on 10/28/2017.
 */

public class ScreenHelper {

    private static Context context;

    private static DisplayMetrics metrics = context.getResources().getDisplayMetrics();

    public static int getHeight() {
        return metrics.heightPixels;
    }

    public static int getWidth() {
        return metrics.widthPixels;
    }

    public static String getWidthRange(String key, float widthRatio) {

        int    calculatedSize = (int) (getWidth() * widthRatio);
        String newKey;
        if (calculatedSize > 720) {
            newKey = key;
        } else if (calculatedSize > 480) {
            newKey = key + "_720";
        } else if (calculatedSize > 360) {
            newKey = key + "_480";
        } else if (calculatedSize > 240) {
            newKey = key + "_360";
        } else if (calculatedSize > 120) {
            newKey = key + "_240";
        } else {
            newKey = key + "_120";
        }
        return newKey;
    }
}
