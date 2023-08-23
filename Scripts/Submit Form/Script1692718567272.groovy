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

String appFile = GlobalVariable.G_apkpath
Mobile.startApplication(appFile, false);

//Mobile.startApplication('C:\\Users\\venkata.suru\\Downloads\\appium-webdriverio-mobile-test-automation-develop@90bd9aab1f1\\apps\\Android-NativeDemoApp-0.2.1.apk', true)

Mobile.tap(findTestObject('Object Repository/Form/Form Tab'), 0)

Mobile.setText(findTestObject('Object Repository/Form/Inputfield Text'), 'Katalon', 0)

def text1=Mobile.getText(findTestObject('Object Repository/Form/Inputfield Text'), 0)

def text2=Mobile.getText(findTestObject('Object Repository/Form/InputField Text2'), 0)

Mobile.verifyEqual(text1,text2 )

Mobile.tap(findTestObject('Object Repository/Form/SwitchOFF'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Form/android.widget.TextView - Select a value here'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Form/android.widget.CheckedTextView - Appium is awesome'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Form/Active Button'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Form/android.widget.CheckedTextView - This app is awesome'), 0)

Mobile.getText(findTestObject('Object Repository/Form/android.widget.TextView - This app is awesome'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Form/Active Button'), 0)

Mobile.tap(findTestObject('Object Repository/Form/Active Button'), 0)

def Activedialog=Mobile.getText(findTestObject('Object Repository/Form/Active Dialog'), 0)

Mobile.verifyEqual(Activedialog, 'This button is active')

Mobile.tap(findTestObject('Object Repository/Form/OK Button'), 0)

Mobile.closeApplication()

