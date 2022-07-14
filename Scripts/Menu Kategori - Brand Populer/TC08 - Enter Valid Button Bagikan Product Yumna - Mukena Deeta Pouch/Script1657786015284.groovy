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

WebUI.click(findTestObject('Object Repository/Button bagikan/Page_Evermos - Katalog/a_Kategori'))

WebUI.click(findTestObject('Object Repository/Button bagikan/Page_Evermos/span_Brand Populer_categorySection__item__image'))

WebUI.click(findTestObject('Product/3 Yumna - Mukena Deeta Pouch'))

WebUI.click(findTestObject('Object Repository/Button bagikan/Page_Evermos/a_Bagikan'))

WebUI.navigateToUrl('https://api.whatsapp.com/send?text=*Yumna%20%2D%20Mukena%20Deeta%20Pouch%20All%20Size%20Lime%20Free%20Masker%20Kain%203%20Ply*%0A%0A%20%20Mukena%20Deeta%20Pouch%20%20Nyari%20Mukena%20Yang%20Adem%20?Pilihan%20Warna%20Nya%20Banyak%20?Pengen%20Bisa%20Dibawa%20K...%0A%0AHarga:%20~Rp216.667~%20*Rp162.500*%0A%0A*Produk%20100%25%20original*%0A%0AKlik%20disini%20untuk%20beli%20produk:%20https://berikhtiar.com/huhuhuh.ce6/product/yumna-mukena-deeta-pouch')

WebUI.closeBrowser()

