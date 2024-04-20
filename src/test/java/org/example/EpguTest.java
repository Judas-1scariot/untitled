package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EpguTest extends BaseTest {

    private final static String LOGIN = "fdrsggg00@mail.ru";
    private final static String PASSWORD = "fdfsssssdKKfff.2";
    private final static String NAME = " Ggggg Gggg ";

    @Test
    public void checkService(){
        new EsiaLoginPage(LOGIN,PASSWORD);
        LkPage lk = new LkPage();
        String kkkk = lk.NameReturn();
        Assert.assertTrue(kkkk.contains("Ggggg Gggg"));
    }

}
