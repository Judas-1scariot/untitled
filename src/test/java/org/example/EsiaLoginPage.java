package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 *  Страница со входом на ЕПГУ
 */
public class EsiaLoginPage {
    private final String URL = "https://esia.gosuslugi.ru/login/";
    private final SelenideElement LOGIN_ = $x("//input[@id='login']");
    private final SelenideElement PASSWORD_ = $x("//input[@id='password']");
    private final SelenideElement Entrance = $x("//button[contains(text(), 'Войти')]");


    public EsiaLoginPage(String LOGIN, String PASSWORD){
        Selenide.open(URL);
        LOGIN_.setValue(LOGIN);
        PASSWORD_.setValue(PASSWORD);
        Entrance.click();
    }

}
