package com.automation.tests;

import com.automation.pages.AddressQualificationPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {
    @Test
    void checkAppointmentIsScheduled() {
        Configuration.browser = "edge";
        Configuration.timeout = 60000;
        open("https://bgtm-014.dx.commercecloud.salesforce.com/s/QFCC/shop");
        new AddressQualificationPage().checkAddressAvailability("1431 MUIR CIR").selectRandomSpeed().clickContinueButton().waitUntilAppointmentDateIsAvailable();
    }
}