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

Windows.startApplicationWithTitle('C:\\Users\\Thuan\\AppData\\Roaming\\Telegram Desktop\\Telegram.exe', 'Telegram')

Windows.click(findWindowsObject('Object Repository/login/check_search_country__has_country/btn_start_messaging'))

Windows.click(findWindowsObject('Object Repository/login/check_search_country__has_country/btn_login_by_phone'))

Windows.click(findWindowsObject('Object Repository/login/check_search_country__has_country/dropdown_country'))

Windows.setText(findWindowsObject('Object Repository/login/check_search_country__has_country/input_country'), 'vie')

Windows.click(findWindowsObject('Object Repository/login/check_search_country__has_country/item_vn_country'))

national_code = Windows.getText(findWindowsObject('login/check_search_country__has_country/info_national code'))

Windows.verifyMatch(national_code, '+84', false)

Windows.closeApplication()

