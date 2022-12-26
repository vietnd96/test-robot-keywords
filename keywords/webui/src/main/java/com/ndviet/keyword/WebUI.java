package com.ndviet.keyword;

import com.ndviet.library.BrowserManagement;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.Map;

import static com.ndviet.libary.TestObject.ObjectRepository.findTestObject;

@RobotKeywords
public class WebUI extends AnnotationLibrary {
    public WebUI() {
        super(Arrays.asList("com/ndviet/keyword/WebUI.class"));
    }

    @RobotKeyword
    public void openBrowser(String url) throws Exception {
        BrowserManagement.getInstance().goToUrl(url);
    }

    @RobotKeyword
    public void closeBrowser() {
        BrowserManagement.getInstance().getDriver().quit();
    }

    @RobotKeyword
    @ArgumentNames({"objectID"})
    public void click(String objectID) throws Exception {
        com.ndviet.library.WebUI.click(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables"})
    public void click(String objectID, Map variables) throws Exception {
        com.ndviet.library.WebUI.click(findTestObject(objectID, variables));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "text"})
    public void setText(String objectID, String text) throws Exception {
        com.ndviet.library.WebUI.setText(findTestObject(objectID), text);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "text", "variables"})
    public void setText(String objectID, String text, Map variables) throws Exception {
        com.ndviet.library.WebUI.setText(findTestObject(objectID, variables), text);
    }

    @RobotKeyword
    public void verifyElementPresent() {

    }

    @RobotKeyword
    public void verifyElementNotPresent() {

    }

    @RobotKeyword
    public void verifyElementHasAttribute() {

    }

    @RobotKeyword
    public void verifyElementNotHasAttribute() {

    }

    @RobotKeyword
    public void verifyElementAttributeValue() {

    }

    @RobotKeyword
    public void verifyElementText() {

    }

    @RobotKeyword
    public void verifyElementVisible() {

    }

    @RobotKeyword
    public void verifyElementNotVisible() {

    }
}
