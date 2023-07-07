package tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void checkIfThereIsNoCheckboxOnPage() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveButton();
        String text = dynamicControlsPage.waitingMessage();

        assertEquals(text, "It's gone!", "Текст не совпадает или отсутствует");
        assertTrue(dynamicControlsPage.checkPresenceOfAddButtonOnPage(), "Чекбокс на странице");
    }

    @Test
    public void checkThatInputIsDisabled() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.findInputDisabled();
        dynamicControlsPage.clickEnableButton();
        dynamicControlsPage.waitingForTextItIsEnabled();
        dynamicControlsPage.clickDisabledButton();
        String text = dynamicControlsPage.waitingMessageItIsDisabled();

        assertEquals(text, "It's disabled!", "Input enabled");
        assertTrue(dynamicControlsPage.checkPresenceOfEnableButtonOnPage(), "Input enabled");
    }

    @Test
    public void checkThatInputIsEnable() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickEnableButton();
        String text = dynamicControlsPage.waitingForTextItIsEnabled();
        dynamicControlsPage.inputTextInFieldInput();

        assertEquals(text, "It's enabled!", "Input disabled");
        assertTrue(dynamicControlsPage.checkPresenceOfDisableButtonOnPage(), "Input disabled");
    }

}