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

WebUI.setText(findTestObject('login/input_ID_Organisasi'), 'official_nexmedis')

WebUI.click(findTestObject('login/button_lanjut_ID'))

WebUI.setText(findTestObject('login/input_Email'), 'ricky.yudisi@gmail.com')

WebUI.setEncryptedText(findTestObject('login/input_Password'), '+TGLV7QsZ7ZP2s6xhLutwA==' // password1234 dienkripsi
    )

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Home/title_FasyankesAnda'), 10)

WebUI.closeBrowser()

