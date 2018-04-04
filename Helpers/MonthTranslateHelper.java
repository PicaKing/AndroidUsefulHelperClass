/**
 * Created by Vahid Vaezinia on 10/28/2017.
 */

public class MonthTranslateHelper {
    private String lang;

    public static final String FA = "FA";
    public static final String EN = "EN";

    public MonthTranslateHelper(String lang) {
        this.lang = lang;
    }

    public String getTranslated(int month) {
        String translated = "";
        if (lang.equals(FA)) {
            switch (month) {
                case 1:
                    translated = "فروردین";
                    break;
                case 2:
                    translated = "اردیبهشت";
                    break;
                case 3:
                    translated = "خرداد";
                    break;
                case 4:
                    translated = "تیر";
                    break;
                case 5:
                    translated = "مرداد";
                    break;
                case 6:
                    translated = "شهریور";
                    break;
                case 7:
                    translated = "مهر";
                    break;
                case 8:
                    translated = "آبان";
                    break;
                case 9:
                    translated = "آذر";
                    break;
                case 10:
                    translated = "دی";
                    break;
                case 11:
                    translated = "بهمن";
                    break;
                case 12:
                    translated = "اسفند";
                    break;
                default:
                    translated = "خطا";
            }
        }else if (lang.equals(EN)) {
            switch (month) {
                case 1:
                    translated = "January";
                    break;
                case 2:
                    translated = "February";
                    break;
                case 3:
                    translated = "March";
                    break;
                case 4:
                    translated = "April";
                    break;
                case 5:
                    translated = "May";
                    break;
                case 6:
                    translated = "June";
                    break;
                case 7:
                    translated = "July";
                    break;
                case 8:
                    translated = "August";
                    break;
                case 9:
                    translated = "September";
                    break;
                case 10:
                    translated = "October";
                    break;
                case 11:
                    translated = "November";
                    break;
                case 12:
                    translated = "December";
                    break;
                default:
                    translated = "ERROR";
            }
        }
        return translated;
    }


    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
