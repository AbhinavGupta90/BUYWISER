package newPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import com.thedeanda.lorem.Lorem
import com.thedeanda.lorem.LoremIpsum

public class TestDataGenerator {
	public static Lorem lorem = LoremIpsum.getInstance();

	@Keyword
	public String getRandomParagraphs(int a, int b) {
		String ranPar = lorem.getParagraphs(a, b);
		return ranPar;
	}
	@Keyword
	public String getRandomName(int a, int b) {
		String ranPar = lorem.getName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public String getRandomFemaleName() {

		String ranPar = lorem.getNameFemale().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public String getRandomMaleName() {

		String ranPar = lorem.getNameMale().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public String getRandomFirstName() {

		String ranPar = lorem.getFirstName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public static String getRandomLastName() {

		String ranPar = lorem.getLastName().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public String getRandomCity() {

		String ranPar = lorem.getCity().replaceAll("[^a-zA-Z]+", "");
		return ranPar;
	}
	@Keyword
	public String getRandomHeading(int numberofWords) {

		String ranPar = lorem.getTitle(numberofWords);
		return ranPar;
	}
	@Keyword
	public String getRandomHeading_two(int Wordsfrom, int wordstwo) {

		String ranPar = lorem.getTitle(Wordsfrom, wordstwo);
		return ranPar;
	}
	@Keyword
	public String getRandomEmail() {

		String ranPar = lorem.getEmail();
		return ranPar;
	}
	@Keyword
	public String getRandomUrl() {

		String ranPar = lorem.getUrl();
		return ranPar;
	}
	public String getRandomZip() {

		String ranPar = lorem.getZipCode();
		return ranPar;
	}
}