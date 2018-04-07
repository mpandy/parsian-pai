package ir.parsianinsurance.he.infrastructure.util;

import java.util.stream.IntStream;

/**
 * Created by 8119 on 5/14/2017.
 */
public class StringUtil {

    private static final String[] yekan = new String[]{"صفر", "يک", "دو", "سه", "چهار", "پنج", " شش", "هفت", "هشت", "نه"};
    private static final String[] dahgan = new String[]{"", "", "بيست", "سي", "چهل", "پنجاه", "شصت", "هفتاد", "هشتاد", "نود"};
    private static final String[] sadgan = new String[]{"", "يکصد", "دويست", "سيصد", "چهارصد", "پانصد", "ششصد", "هفتصد", "هشتصد", "نهصد"};
    private static final String[] dahTaNozdah = new String[]{"ده", "يازده", "دوازده", "سيزده", "چهارده", "پانزده", "شانزده", "هفده", "هجده", "نوزده"};
    private static final String[] pasvandeMazrabeHezar = new String[]{"", "هزار", "ميليون", "میلیارد", "تریلیون"};
    private static final String vaav = " و ";

    public static String convertMeghdareAdadiBeHorofi(String meghdareAdadi) {
        String result = "";
        meghdareAdadi = removeNoneDigits(meghdareAdadi);
        int l = meghdareAdadi.length();
        if (meghdareAdadi.equals("0")) return yekan[0];
        if (l % 3 == 1) meghdareAdadi = "00" + meghdareAdadi;
        else if (l % 3 == 2) meghdareAdadi = "0" + meghdareAdadi;
        l = meghdareAdadi.length() / 3;
        int b = 0;
        for (int i = 0; i < l; i++) {
            b = Integer.parseInt(meghdareAdadi.substring(i * 3, i * 3 + 3));
            if (b != 0) result += convertMeghdareAdadi3raghamiBeHorof(String.valueOf(b)) + " " +
                    pasvandeMazrabeHezar[l - i - 1] + vaav;
        }
        result = result.substring(0, result.length() - vaav.length());
        return result;
    }

    private static String removeNoneDigits(String word) {
        StringBuilder wordOnlyByDigits = new StringBuilder();
        char[] wordChars = word.toCharArray();
        for (char ch : wordChars) {
            if ('0' <= (int) ch && (int) ch <= '9') {
                wordOnlyByDigits.append(ch);
            }
        }
        return wordOnlyByDigits.toString();
    }

    private static String convertMeghdareAdadi3raghamiBeHorof(String adade3raghami) {
        int adade3raghamiInteger = Integer.parseInt(adade3raghami);
        int d1, d2, d3, d12;
        String result = "";
        d12 = adade3raghamiInteger % 100;
        d3 = adade3raghamiInteger / 100;
        if (d3 != 0) result = sadgan[d3] + vaav;
        if (d12 >= 10 && d12 <= 19) {
            result += dahTaNozdah[d12 - 10];
        } else {
            d1 = d12 % 10;
            d2 = d12 / 10;
            if (d2 != 0) result += dahgan[d2] + vaav;
            if (d1 != 0) result += yekan[d1] + vaav;
            //hazfe vaave akhar. chon tebghe algorithm yek vaav ezafe gozashteim.
            result = result.substring(0, result.length() - vaav.length());
        }
        return result;
    }

    public static boolean isEmpty(String s)
    {
        if(s == null || s.trim().isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidIranianNationalCode("0534967949"));
        System.out.println(isValidIranianNationalCode("1111111111"));
//        System.out.println(convertMeghdareAdadiBeHorofi(249L+""));
    }

    public static boolean equals(String s1, String s2)
    {

        if(s1 == null && s2== null)
            return true;

        if(s1 == null && s2 != null)
        {
            if(s2.equals(""))
                return true;
            else
                return false;
        }

        if(s1 != null && s2 == null)
        {
            if(s1.equals(""))
                return true;
            else
                return false;
        }

        if(s1 != null && s2 != null)
        {
            if(s1.trim().equals(s2.trim()))
                return true;
            else
                return false;
        }
        return false;
    }

    public static String dashIfEmpty(Object input){
        if(input == null || input.toString().equals(""))
            return "-";
        else
            return input.toString();
    }


    public static boolean isValidIranianNationalCode(String input) {
        if (!input.matches("^\\d{10}$"))
            return false;

        int check = Integer.parseInt(input.substring(9, 10));

        int sum = IntStream.range(0, 9)
                .map(x -> Integer.parseInt(input.substring(x, x + 1)) * (10 - x))
                .sum() % 11;

        return (sum < 2 && check == sum) || (sum >= 2 && check + sum == 11);
    }


}
