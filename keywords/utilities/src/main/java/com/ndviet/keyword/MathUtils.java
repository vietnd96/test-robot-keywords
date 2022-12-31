package com.ndviet.keyword;

import com.ndviet.libary.math.MathHelpers;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;

@RobotKeywords
public class MathUtils extends AnnotationLibrary {
    public MathUtils() {
        super(Arrays.asList("com/ndviet/keyword/MathUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"number", "decimalFormat", "roundingMode"})
    public static String numberDecimalFormat(String number, String decimalFormat, String roundingMode) {
        return MathHelpers.numberDecimalFormat(number, decimalFormat, roundingMode);
    }
}
