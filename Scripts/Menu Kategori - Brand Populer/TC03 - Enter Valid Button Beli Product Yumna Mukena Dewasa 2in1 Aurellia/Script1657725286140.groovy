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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Brand populer/Page_Evermos - Katalog/a_Kategori'))

WebUI.click(findTestObject('Object Repository/Brand populer/Page_Evermos/span_Brand Populer_categorySection__item__image'))

WebUI.click(findTestObject('Product/1 Yumna Mukena Dewasa 2in1 Aurellia'))

WebUI.click(findTestObject('Brand populer/Page_Evermos/Btn_Beli'))

WebUI.click(findTestObject('Object Repository/Brand populer/Page_Evermos/input_dsds_pickedAddressId'))

WebUI.click(findTestObject('Brand populer/Page_Evermos/Btn_PilihAlamat'))

WebUI.verifyElementText(findTestObject('Brand populer/Page_Evermos/Berhasil'), 'Berhasil!')

WebUI.closeBrowser()

