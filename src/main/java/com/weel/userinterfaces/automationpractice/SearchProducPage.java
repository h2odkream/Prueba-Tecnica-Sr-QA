package com.weel.userinterfaces.automationpractice;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProducPage {

    public static final Target SEARCH = Target.the("Search").located(By.id("search_query_top"));
    public static final Target SUBMIT_SEARCH = Target.the("Submit search").locatedBy("//button[@name=\"submit_search\"]");
    public static final Target IMAGE_T_SHIRT = Target.the("Iamage T-shirt").locatedBy("(//img[@class=\"replace-2x img-responsive\"])[9]");
     public static final Target COLOR_TYPE = Target.the("Choose the color of the garment").locatedBy("//a[@id='color_14']");
    public static final Target NUMBER_OF_ITEMS = Target.the("Cantidad de prenda a escoger").locatedBy("//a[@class='btn btn-default button-plus product_quantity_up']//span");
    public static final Target SIZE = Target.the("Choose size from the size catalog").located(By.id("group_1"));
    public static final Target ADD_CAR = Target.the("Add car").located(By.name("Submit"));
    public static final Target PRODUCT_SUCESSFULL_ADD_CAR = Target.the("Add car").located(By.xpath("//div//h2[@xpath=\"1\"]"));
}
