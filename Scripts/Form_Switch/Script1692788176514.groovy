import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

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

Mobile.tap(findTestObject('Object Repository/Form/Form Tab'), 0)

if(Mobile.verifyElementExist(findTestObject('Object Repository/Form/SwitchOFF'), 0))

	{
	def SwitchOffText=Mobile.getText(findTestObject('Object Repository/Form/SwitchOffText'), 0)
	
     Mobile.verifyEqual(SwitchOffText, 'Click to turn the switch ON')  
	 Mobile.closeApplication()
	 
	}
	else(
	{
		Mobile.tap(findTestObject('Object Repository/Form/SwitchOFF'), 0)
		def SwitchONText=Mobile.getText(findTestObject('Object Repository/Form/SwitchONText'), 0)
		
		 Mobile.verifyEqual(SwitchONText,'Click to turn the switch ON')
		 Mobile.closeApplication()
		
	}
	)
