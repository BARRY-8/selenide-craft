package com.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddressQualificationPage {
    private static final SelenideElement ADDRESS_INPUT = $(byId("o2check"));
    private static final SelenideElement NOT_AN_EXISTING_CUSTOMER_CHECKBOX = $(byXpath("//label[@for='centurylink-existing-no']"));
    private static final SelenideElement CHECK_AVAILABILITY_BUTTON = $(byId("adresscheck-submit"));

    private AddressQualificationPage enterAddress(String address) {
        ADDRESS_INPUT.shouldBe(Condition.editable).setValue(address);
        return this;
    }
}