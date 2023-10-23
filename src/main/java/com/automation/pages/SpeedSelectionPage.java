package com.automation.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SpeedSelectionPage {
    private static final ElementsCollection SPEED_IMAGE = $$(byXpath("//div[@class='qf-tile__tile-header no-title']/img[contains(@src, 'images/product/InternetPlan')]"));
    private static final SelenideElement CONTINUE_BUTTON = $(byId("plp__continue"));

    public SpeedSelectionPage selectRandomSpeed() {
        SPEED_IMAGE.should(CollectionCondition.sizeGreaterThanOrEqual(2), Duration.ofSeconds(12000)).stream().findAny().get().click();
        return this;
    }

    public ScheduleInstallationPage clickContinueButton() {
        CONTINUE_BUTTON.click();
        return new ScheduleInstallationPage();
    }
}