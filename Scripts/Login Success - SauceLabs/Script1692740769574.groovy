import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable as GlobalVariable

//String appFile = GlobalVariable.G_apkpath
//Mobile.startApplication(appFile, false);

def appPath = 'storage:filename=Android-NativeDemoApp-0.2.1.apk'
Mobile.startApplication(appPath, false)

//Mobile.startApplication('C:\\Users\\venkata.suru\\Downloads\\appium-webdriverio-mobile-test-automation-develop@90bd9aab1f1\\apps\\Android-NativeDemoApp-0.2.1.apk', 
    false
Mobile.comment('Given the Application is loaded in Android Device')

Mobile.tap(findTestObject('Object Repository/Login/Login Tab'), 0)

Mobile.setText(findTestObject('Object Repository/Login/Email'), 'test@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login/Password'), 'o+tS4OuGt32s9ezZj287yw==', 
    0)
Mobile.comment('When valid Login Email and Password are provided')

Mobile.tap(findTestObject('Object Repository/Login/Login button'), 0)

Mobile.comment('And user taps on Login button')

def SuccessHeader=Mobile.getText(findTestObject('Object Repository/Login/Success Dialog'), 0)

Mobile.comment('Then login Success Dialog should be displayed')

Mobile.verifyEqual(SuccessHeader, 'Success')

def SuccessMessage=Mobile.getText(findTestObject('Object Repository/Login/Success Message'), 0)

Mobile.comment('Verify Header of the Dialog')

Mobile.verifyEqual(SuccessMessage, 'You are logged in!')

Mobile.comment('Verify valid Login Success message is displayed on the popup')

Mobile.tap(findTestObject('Object Repository/Login/Ok Button'), 0)

Mobile.closeApplication()

