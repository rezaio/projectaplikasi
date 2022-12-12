package com.app.projectmobilekelompok.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
public class FunctionHelper {

    /*
    Fungsi untuk mengconvert sebuah nilai menjadi format Rupiah.
    Contoh : 1000 akan menjadi Rp1.000
     */
    public static String convertRupiah(int nominal){
        Locale localeID = new Locale("in", "ID");
//        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        NumberFormat totalAngka = NumberFormat.getNumberInstance(Locale.getDefault());
        return totalAngka.format(nominal);
    }
}
