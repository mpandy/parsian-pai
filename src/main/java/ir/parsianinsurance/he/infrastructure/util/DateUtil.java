package ir.parsianinsurance.he.infrastructure.util;

import com.ghasemkiani.util.DateFields;
import com.ghasemkiani.util.SimplePersianCalendar;
import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 8119 on 3/7/2017.
 */

public class DateUtil {

    private static final Pattern dashDelimitedJalaliAzAndTaDatePattern;
    private static final Pattern dashDelimitedJalaliTavallodDatePattern;

    static {

        String pattern1 = "1[3,4]\\d\\d/[0,1]\\d/[0-3]\\d";
        dashDelimitedJalaliAzAndTaDatePattern = Pattern.compile(pattern1);

        String pattern2 = "13\\d\\d/[0,1]\\d/[0-3]\\d";
        dashDelimitedJalaliTavallodDatePattern = Pattern.compile(pattern2);
    }


    public static String formatDate(Long now){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate = new Date(now);
        String strDate = sdf.format(nowDate);
        return strDate;
    }

    public static Long now(){
        return System.currentTimeMillis();
    }

    public static String formattedNow(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate = new Date(System.currentTimeMillis());
        String strDate = sdf.format(nowDate);
        return strDate;
    }

    public static String formattedOneYearFromNow(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        Date oneYearFromNowDate = cal.getTime();
        String strDate = sdf.format(oneYearFromNowDate);
        return strDate;
    }

    public static String getJalaliCurrentDate() {
        DateFields dateFields = new SimplePersianCalendar().getDateFields();
        return getFormattedDate(dateFields);
    }

    private static String getFormattedDate(DateFields dateFields) {
        String year = String.valueOf(dateFields.getYear());
        String month = dateFields.getMonth() < 9 ?
                "0" + String.valueOf(dateFields.getMonth() + 1) :
                String.valueOf(dateFields.getMonth() + 1);
        String day = dateFields.getDay() < 10 ?
                "0" + String.valueOf(dateFields.getDay()) :
                String.valueOf(dateFields.getDay());
        return year + "/" + month + "/" + day;
    }

    public static Integer extractYear(String date) {
        return Integer.parseInt(date.split("/")[0]);
    }
    public static Integer extractTwoDigitYear(String date) {
        return Integer.parseInt(date.split("/")[0])%100;
    }

    public static String addOneYear(String date) {
        return addYear(date, 1);
    }

    private static String addYear(String date, int year) {
        String[] dateFilelsStr = adapteAlignement(date.split("/"));
        int yearInt = Integer.parseInt(dateFilelsStr[0]);
        int monthInt = Integer.parseInt(dateFilelsStr[1]) - 1;
        int dayInt = Integer.parseInt(dateFilelsStr[2]);
        yearInt = yearInt + year;
        DateFields dateFields = new DateFields(yearInt, monthInt, dayInt);
        return getFormattedDate(dateFields);
    }

    public static String[] adapteAlignement(String[] stringArray) {
        if (stringArray.length != 3) return stringArray;
        if (stringArray[0].length() < stringArray[2].length()) {
            String temp = stringArray[0];
            stringArray[0] = stringArray[2];
            stringArray[2] = temp;
        }
        return stringArray;
    }
    private static Calendar getPersianCalendar(String date) {
        String[] currentDateStr = adapteAlignement(date.split("/"));
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Tehran");
//        ULocale uLocale = ULocale.createCanonical("en_US");
        Calendar spcCurrent = new PersianCalendar(timeZone);
        spcCurrent.set(Calendar.EXTENDED_YEAR, Integer.parseInt(currentDateStr[0]));
        spcCurrent.set(Calendar.MONTH, Integer.parseInt(currentDateStr[1]) - 1);
        try {
            spcCurrent.set(Calendar.DAY_OF_MONTH, Integer.parseInt(currentDateStr[2]));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(currentDateStr);
        }
        spcCurrent.set(Calendar.HOUR_OF_DAY, 0);
        spcCurrent.set(Calendar.MINUTE, 0);
        spcCurrent.set(Calendar.SECOND, 0);
        spcCurrent.set(Calendar.MILLISECOND, 0);
        return spcCurrent;
    }

    public static int getTimeDifferenceByDayCount(String fromDate, String toDate) {
        Calendar fromCalendar = getPersianCalendar(fromDate);
        Calendar toCalendar = getPersianCalendar(toDate);
        return (int) Math.round((toCalendar.getTimeInMillis() - fromCalendar.getTimeInMillis()) / (1000.0 * 60 * 60 * 24));
    }


    public static boolean diffIsExactlyOneYear(String fromDate, String toDate) {

        String[] fromDateStr = DateUtil.adapteAlignement(fromDate.split("/"));
        String[] toDateStr = DateUtil.adapteAlignement(toDate.split("/"));

        int fromDateYear = Integer.parseInt(fromDateStr[0]);
        int toDateYear = Integer.parseInt(toDateStr[0]);

        int fromDateMonth = Integer.parseInt(fromDateStr[1]);
        int toDateMonth = Integer.parseInt(toDateStr[1]);

        int fromDateDay = Integer.parseInt(fromDateStr[2]);
        int toDateDay = Integer.parseInt(toDateStr[2]);

        return  (Math.abs(toDateYear - fromDateYear) == 1) &&
                (fromDateMonth == toDateMonth) &&
                (fromDateDay == toDateDay);
    }

        public static boolean diffIsMoreThanOneYear(String fromDate, String toDate){
        int moddat = getTimeDifferenceByDayCount(fromDate, toDate);

            if(moddat > 366 || moddat == 366 && !diffIsExactlyOneYear(fromDate, toDate))
                return true;
            else
                return false;
        }

    public static boolean isGreaterThanOrEqual(String currentDate, String targetDate) {
        Calendar spcCurrent = getPersianCalendar(currentDate);
        Calendar spcTarget = getPersianCalendar(targetDate);
        if (spcCurrent.getTimeInMillis() >= spcTarget.getTimeInMillis()) {
            return true;
        } else {
            return false;
        }
    }

    public static String timeStamp(){

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(calendar.getTime());
        String date = getJalaliCurrentDate();

        return date+" "+time;
    }

    public static boolean isGreaterThan(String currentDate, String targetDate) {
        Calendar spcCurrent = getPersianCalendar(currentDate);
        Calendar spcTarget = getPersianCalendar(targetDate);
        if (spcCurrent.getTimeInMillis() > spcTarget.getTimeInMillis()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


//        System.out.println(timeStamp());
//        System.out.println(getPersianCalendar("201"));
//        System.out.println(getTimeDifferenceByDayCount("1396/06/06","1396/05/22"));
//        PersianCalendar pc = new PersianCalendar(TimeZone.getTimeZone("Asia/Tehran"));
//        DateFormat df = pc.getDateTimeFormat(DateFormat.FULL, DateFormat.DEFAULT, new ULocale("fa", "IR", ""));
//        String result = df.format(new Date());
//        System.out.println(result);
//
//        System.out.println(isGreaterThan("1395/05/06","1394/06/06"));
//        System.out.println(formattedNow());
//        System.out.println(getJalaliCurrentDate());
//        System.out.println(addYear(getJalaliCurrentDate(), 1));
//        System.out.println(extractYear(getJalaliCurrentDate()));
//        System.out.println(extractTwoDigitYear(getJalaliCurrentDate()));

//        IntStream.of(1, 2, 3).forEach(System.out::println);

            System.out.println(DateUtil.getJalaliCurrentDate().compareTo("1396/12/14"));
    }


    public static boolean valiateDashDelimitedJalaliAzAndTaDateFormat(String tarikh) {

        Matcher m = dashDelimitedJalaliAzAndTaDatePattern.matcher(tarikh);
        return m.matches();
    }

    public static boolean valiateDashDelimitedJalaliTavallodDateFormat(String tarikh) {

        Matcher m = dashDelimitedJalaliTavallodDatePattern.matcher(tarikh);
        return m.matches();
    }

}
