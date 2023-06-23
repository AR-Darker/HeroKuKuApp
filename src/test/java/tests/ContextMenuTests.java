package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void OpenPage() {
        contextMenuPage.contextOpen();

    }

    @Test
    public void RightClick() {
        contextMenuPage.contextOpen();
        contextMenuPage.rightClickToHotSpot();


    }


}
