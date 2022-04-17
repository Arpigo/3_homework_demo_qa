package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitTets {

    @BeforeEach
    void openYaPage(){
        Selenide.open("https://ya.ru");
    }

    @AfterEach
    void close(){
    WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest(){

    }

    @Test
    void assertTest2(){
        Assertions.assertTrue(3<2);
    }
}