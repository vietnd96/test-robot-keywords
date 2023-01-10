package com.ndviet.keyword;

import com.ndviet.library.BrowserManagement;
import com.ndviet.library.TakeScreenshot;
import com.ndviet.library.spring.SpringHelpers;
import org.openqa.selenium.WebElement;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywordOverload;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.ndviet.library.TestObject.ObjectRepository.findTestObject;

@RobotKeywords
public class WebUI extends AnnotationLibrary {
    public WebUI() {
        super(Arrays.asList("com/ndviet/keyword/WebUI.class"));
        SpringHelpers.getInstance().getBean("WebElementIdentifier");
    }

    @RobotKeyword
    @ArgumentNames({"fileName="})
    public void capturePageScreenshot(String fileName) throws Exception {
        TakeScreenshot.capturePageScreenshot(fileName);
    }

    @RobotKeywordOverload
    @ArgumentNames({})
    public void capturePageScreenshot() throws Exception {
        TakeScreenshot.capturePageScreenshot(null);
    }

    @RobotKeyword
    @ArgumentNames({"fileName="})
    public void captureFullPageScreenshot(String fileName) throws Exception {
        TakeScreenshot.captureFullPageScreenshot(fileName);
    }

    @RobotKeywordOverload
    @ArgumentNames({})
    public void captureFullPageScreenshot() throws Exception {
        TakeScreenshot.captureFullPageScreenshot(null);
    }

    @RobotKeyword
    public void openBrowser(String url) throws Exception {
        BrowserManagement.getInstance().openBrowser(url);
    }

    @RobotKeyword
    public void closeBrowser() {
        BrowserManagement.getInstance().closeBrowser();
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public WebElement findWebElement(String objectID, Map variables) throws Exception {
        return com.ndviet.library.WebUI.findWebElement(findTestObject(objectID));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public WebElement findWebElement(String objectID) throws Exception {
        return com.ndviet.library.WebUI.findWebElement(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public List<WebElement> findWebElements(String objectID, Map variables) throws Exception {
        return com.ndviet.library.WebUI.findWebElements(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public List<WebElement> findWebElements(String objectID) throws Exception {
        return com.ndviet.library.WebUI.findWebElements(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void click(String objectID, Map variables) throws Exception {
        com.ndviet.library.WebUI.click(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void click(String objectID) throws Exception {
        com.ndviet.library.WebUI.click(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "text", "variables="})
    public void setText(String objectID, String text, Map variables) throws Exception {
        com.ndviet.library.WebUI.setText(findTestObject(objectID, variables), text);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "text"})
    public void setText(String objectID, String text) throws Exception {
        com.ndviet.library.WebUI.setText(findTestObject(objectID), text);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public String getText(String objectID, Map variables) throws Exception {
        return com.ndviet.library.WebUI.getText(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public String getText(String objectID) throws Exception {
        return com.ndviet.library.WebUI.getText(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID"})
    public List<String> getTexts(String objectID) throws Exception {
        return com.ndviet.library.WebUI.getTexts(findTestObject(objectID));
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementPresent(String objectID, Map variables) throws Exception {
        com.ndviet.library.WebUI.verifyElementPresent(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementPresent(String objectID) throws Exception {
        com.ndviet.library.WebUI.verifyElementPresent(findTestObject(objectID));
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
    @ArgumentNames({"objectID", "variables", "expectValue="})
    public void verifyElementTextEquals(String objectID, Map variables, String expectText) throws Exception {
        com.ndviet.library.WebUI.verifyElementTextEquals(findTestObject(objectID, variables), expectText);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "expectValue="})
    public void verifyElementTextEquals(String objectID, String expectText) throws Exception {
        com.ndviet.library.WebUI.verifyElementTextEquals(findTestObject(objectID), expectText);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables", "expectValue="})
    public void verifyElementTextContains(String objectID, Map variables, String expectText) throws Exception {
        com.ndviet.library.WebUI.verifyElementTextContains(findTestObject(objectID, variables), expectText);
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID", "expectValue="})
    public void verifyElementTextContains(String objectID, String expectText) throws Exception {
        com.ndviet.library.WebUI.verifyElementTextContains(findTestObject(objectID), expectText);
    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void verifyElementVisible(String objectID, Map variables) throws Exception {
        com.ndviet.library.WebUI.verifyElementVisible(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void verifyElementVisible(String objectID) throws Exception {
        com.ndviet.library.WebUI.verifyElementVisible(findTestObject(objectID));
    }

    @RobotKeyword
    public void verifyElementNotVisible() {

    }

    @RobotKeyword
    @ArgumentNames({"objectID", "variables="})
    public void moveToElement(String objectID, Map variables) throws Exception {
        com.ndviet.library.WebUI.moveToElement(findTestObject(objectID, variables));
    }

    @RobotKeywordOverload
    @ArgumentNames({"objectID"})
    public void moveToElement(String objectID) throws Exception {
        com.ndviet.library.WebUI.moveToElement(findTestObject(objectID));
    }

}
