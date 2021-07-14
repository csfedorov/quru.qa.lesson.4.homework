package theinternet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Konstantin Fedorov on 14.07.2021.
 */
public class DragAndDropTest {
    @BeforeAll
    static void setUpBefore() {
        Configuration.startMaximized = true;
    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $$(".column").first().shouldHave(Condition.text("B"));
    }
}
