package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER_REGEX =   "^[(]+[0-9]{2}+[)]+[-]+[(]+[0-9]+[0-9]{9}+[)]$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
