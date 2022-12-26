package com.ndviet.keyword;

import com.ndviet.libary.TestObject.ObjectRepository;
import com.ndviet.libary.TestObject.WebElementIdentifier;
import com.ndviet.libary.configuration.ConfigurationFactory;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;

@RobotKeywords
public class Configuration extends AnnotationLibrary {
    public Configuration() {
        super(Arrays.asList("com/ndviet/keyword/Configuration.class"));
    }

    @RobotKeyword
    public String getValue(String key) throws Exception {
        return ConfigurationFactory.getInstance().getValue(key);
    }

    @RobotKeyword
    public ObjectRepository getObjectRepositoryHelper() throws Exception {
        WebElementIdentifier.setElementFiles();
        return ObjectRepository.getInstance();
    }
}
