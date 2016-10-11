package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Vitaliy on 11.10.2016.
 */
public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification () {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("third", "test1", "test2"));
        app.getGroupHelper().submitGroupModification ();
        app.getGroupHelper().returntoGroupPage();
    }
}
