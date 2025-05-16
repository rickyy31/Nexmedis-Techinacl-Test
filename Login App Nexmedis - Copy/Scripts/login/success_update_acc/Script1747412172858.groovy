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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stg-app.nexmedis.com/')

WebUI.setText(findTestObject('login/input_id'), 'official_nexmedis')

WebUI.click(findTestObject('login/button_solid'))

WebUI.setText(findTestObject('login/input_id'), 'ricky.yudisi@gmail.com')

WebUI.setEncryptedText(findTestObject('login/input_password'), '+TGLV7QsZ7ZP2s6xhLutwA==')

WebUI.click(findTestObject('login/button_solid'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('login/fasyankes_page'), 5)

WebUI.verifyElementPresent(findTestObject('login/text_updateAkun'), 5)

WebUI.sendKeys(findTestObject('login/input_first_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('login/input_first_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('login/input_first_name'), 'Ricky Nexmedis')

WebUI.sendKeys(findTestObject('login/input_last_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('login/input_last_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('login/input_last_name'), 'Bismillah')

WebUI.sendKeys(findTestObject('login/input_no_hp'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('login/input_no_hp'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('login/input_no_hp'), '081234567890')

WebUI.sendKeys(findTestObject('login/input_email_upd'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('login/input_email_upd'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('login/input_email_upd'), 'ricky.yudisi@gmail.com')

WebUI.setEncryptedText(findTestObject('login/input_password'), '+TGLV7QsZ7ZP2s6xhLutwA==')

WebUI.click(findTestObject('login/button_upd_acc'))

WebUI.verifyElementPresent(findTestObject('login/success_img'), 5)

WebUI.verifyElementPresent(findTestObject('login/text_success_upd'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('login/button_solid'))

WebUI.delay(1)

WebUI.closeBrowser()