package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница ЛК
 */
public class LkPage {
    private final String URL = "https://lk.gosuslugi.ru/settings/account";
    private final SelenideElement NAME_ = $x("//div[@class='name title-h4']");

    public String NameReturn(){
        return NAME_.getText();
    }

}
