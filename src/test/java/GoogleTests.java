import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    public void testGoogle() {
        open("https://www.google.com/");
    }
}
