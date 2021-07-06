package com.nick;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class UnnecessaryObjects {

    String idiot = new String("idiot"); //never do this
    String fine = "fine"; //obv this
    //jvm will try and reuse single String instance, shared by any variable in the code that contains the same string  literal

    static boolean isRomanNumeral(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"); //wtf
    } //this creates a Pattern instance every time, single use, eligible for garbage collection

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeralV2(String s) {
        return ROMAN.matcher(s).matches();
    }

    //weird adapter stuff?
    static Map<String, String> testMap = new HashMap<String, String>() {{
        put("a", "b");
        put("c", "d");
    }};
}
