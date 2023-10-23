package com.automation.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class ScheduleInstallationPage {
    private static final SelenideElement INSTALLATION_DATE = $(Selectors.byXpath("//span[@class='flatpickr-day selected']"));

    public ScheduleInstallationPage waitUntilAppointmentDateIsAvailable() {
        INSTALLATION_DATE.shouldBe(exist);
        return this;
    }
}