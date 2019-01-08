import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apcs.ams1907.com/apcs/registration.do')

WebUI.setText(findTestObject('Object Repository/Page_Enterprise Access Management/input_User ID_user'), 'fgl8tbp')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Enterprise Access Management/input_Password_password'), 'oAR5EV3bLF6Zw+XSIEVvwg==')

WebUI.click(findTestObject('Object Repository/Page_Enterprise Access Management/input_Password_sbtn'))

WebUI.focus(findTestObject('Object Repository/Page_APCS ApplicationUPS/a_Register Now'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_APCS ApplicationUPS/a_Register Now'))

WebUI.verifyElementPresent(findTestObject('Page_APCS ApplicationUPS/input__shopName'), 0)

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__shopName'), 'Eliana Shop 1')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__address0.streetNumber'), '21 ')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__address0.streetName'), 'Henrietta ST')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__address0.postalCode'), '07026')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__address0.city'), 'Garfield')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_APCS ApplicationUPS/select_- Select -AlabamaAlaska'), '_NJ', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_APCS ApplicationUPS/select_- Select -AlterationsBa'), '511', 
    true)

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__btnNoClose1'))

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__btnokClose1'))

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__btnNoClose1'))

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__contact0.firstName'), 'Eliana')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__contact0.lastName'), 'Cordova')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__contact0.phone'), '2018978898')

WebUI.setText(findTestObject('Object Repository/Page_APCS ApplicationUPS/input__contact0.email'), 'ecordova@ups.com')

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/input_Is the shop open 24 hour_2'))

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/input_Cancel_myButton'))

WebUI.focus(findTestObject('Page_APCS ApplicationUPS/span_Cordova Elvis'))

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/span_Cordova Elvis'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_APCS ApplicationUPS/a_Log out'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_APCS ApplicationUPS/a_Log out'), 1)

WebUI.click(findTestObject('Object Repository/Page_APCS ApplicationUPS/a_Log out'))

WebUI.closeBrowser()

