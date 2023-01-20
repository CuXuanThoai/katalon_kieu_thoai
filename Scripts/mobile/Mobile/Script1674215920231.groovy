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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Start the Application'
Mobile.startApplication(RunConfiguration.getProjectDir() + '/APIDemos.apk', true)

'Tap on OK if this is the first time this application is launched on an Android 9+ device'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.Button - OK'), 0, FailureHandling.OPTIONAL)

'Tap on text "OS"'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - OS'), 0)

'Tap on text "SMS Messaging"'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - SMS Messaging'), 0)

'Enter a phone number in Recipient text box'
Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText'), '+84345678910', 0)

'Enter a message in Body Message text box'
Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText (1)'), 'Hello world! This is Katalon Mobile Recorder', 0)

'Send the message'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.Button - Send'), 0)

'Close the Application'
Mobile.closeApplication()


