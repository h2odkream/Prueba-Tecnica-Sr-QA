package com.weel.userinterfaces.milionandup;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SchedulePage {
    public static final Target SCHEDULE_BUTTON = Target.the("Schedule presentation")
            .locatedBy("#addressBtn .icon");
    public static final Target DATE_PICKER = Target.the("Date picker").located(By.xpath("//i[@class=\"icon-arrow-down\"]"));
    public static final Target MONTH = Target.the("Month").located(By.xpath("//span[@class=\"fc-icon fc-icon-chevron-right\"]"));
    public static final Target DAY = Target.the("Day").locatedBy("//a[@aria-label=\"{0} de 2022\"]");
    public static final Target ZOOM_VIDEO_CALL = Target.the("").located(By.id("scheduleForm"));
    public static final Target EMAIL = Target.the("Zoom video call").located(By.id("frmScheduleLeadModal-email"));
    public static final Target SCHEDULE_PRESENTATION = Target.the("Schedule presentation").located(By.xpath("(//span[@class=\"first_word_bold btn-black__text\"])[2]"));
    public static final Target NAME = Target.the("Name").located(By.id("frmScheduleLeadModal-name"));
    public static final Target PHONE = Target.the("Phone").located(By.xpath("(//input[@id=\"phone\"])[2]"));
    public static final Target ENTER_THE_SITE = Target.the("Button enter the site").located(By.id("btnSendModal"));
}
