import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxTest extends BaseTest{
    @Test
    public void checkbox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        boolean isFirstCheckboxSelected = checkboxes.get(0).isSelected();
        assertFalse(isFirstCheckboxSelected, "First Checkbox is checked");
        checkboxes.get(0).click();
        isFirstCheckboxSelected = checkboxes.get(0).isSelected();
        assertTrue(isFirstCheckboxSelected, "First Checkbox is unchecked");

        boolean isSecondCheckboxSelected = checkboxes.get(1).isSelected();
        assertTrue(isSecondCheckboxSelected, "Second Checkbox is unchecked");
        checkboxes.get(1).click();
        isSecondCheckboxSelected = checkboxes.get(1).isSelected();
        assertFalse(isSecondCheckboxSelected, "Second Checkbox is checked");

    }
}
