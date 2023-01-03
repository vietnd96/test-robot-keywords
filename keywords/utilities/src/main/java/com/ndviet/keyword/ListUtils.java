package com.ndviet.keyword;

import com.ndviet.libary.list.ListHelpers;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywordOverload;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;

@RobotKeywords
public class ListUtils extends AnnotationLibrary {

    public ListUtils() {
        super(Arrays.asList("com/ndviet/keyword/ListUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"list", "reverse="})
    public static String getLastElement(List list, boolean reverse) {
        return ListHelpers.getLastElement(list, reverse).toString();
    }

    @RobotKeywordOverload
    @ArgumentNames({"list"})
    public static String getLastElement(List list) {
        return ListHelpers.getLastElement(list, false).toString();
    }

    @RobotKeyword
    @ArgumentNames({"list", "reverse="})
    public static boolean isSorted(List list, boolean reverse) {
        return ListHelpers.isSorted(list, reverse);
    }
}
