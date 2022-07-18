package com.weel.userinterfaces.demoqa;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FillTextInformationPage {

    public static final Target FIRST_NAME = Target.the("First name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last names").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Name of student").located(By.id("userEmail"));
    public static final Target GENDER_MALE = Target.the("Name of student").located(By.xpath("//label[@for=\"gender-radio-1\"]"));
    public static final Target GENDER_FEMALE = Target.the("Name of student").located(By.xpath("//label[@for=\"gender-radio-2\"]"));
    public static final Target GENDER_OTHER = Target.the("Name of student").located(By.xpath("//label[@for=\"gender-radio-3\"]"));
    public static final Target MOBILE = Target.the("Name of student").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRD = Target.the("Name of student")
            .located(By.id("dateOfBirthInput"));
    public static final Target DAY = Target.the("Name of student").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target WEEKEND_DAY = Target.the("Name of student")
            .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target DATE_OF_BIRD_MONTH = Target.the("Name of student")
            .located(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
    public static final Target DATE_OF_BIRD_YEAR = Target.the("Name of student")
            .located(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
    public static final Target SUBJECTS = Target.the("Object").located(By.id("subjectsContainer"));
    public static final Target SUBJECTS_INPUT = Target.the("Object input").located(By.id("subjectsInput"));
    public static final Target HBBIES_ONE = Target.the("Name of student").located(By.id("hobbies-checkbox-1"));
    public static final Target HBBIES_TWO = Target.the("Name of student").located(By.id("hobbies-checkbox-2"));
    public static final Target HBBIES_THREE = Target.the("Name of student").located(By.id("hobbies-checkbox-3"));
    public static final Target PICTURE = Target.the("Name of student").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS = Target.the("Name of student").located(By.id("currentAddress"));
    public static final Target STATE = Target.the("Name of student").located(By.id("state"));
    public static final Target STATE_INPUT = Target.the("Name of student").located(By.id("react-select-3-input"));
    public static final Target CITY = Target.the("Name of student").located(By.id("city"));
    public static final Target CITY_INPUT = Target.the("Name of student").located(By.xpath("(//div//input[@autocapitalize=\"none\"])[3]"));
    public static final Target SUBMIT_BUTTON = Target.the("Name of student").located(By.id("submit"));
    public static final Target THANK_FOR_SUBMIT = Target.the("Name of student").located(By.id("example-modal-sizes-title-lg"));
}
