package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import static  org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropdownPage = homepage.clickDropdownLink();
        String option = "Option 1";
        dropdownPage.selectElementFromDropdown(option);
        var selectedOptions = dropdownPage.allElementsInDropdown();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
       // System.out.println(dropdownPage.allElementsInDropdown());

    }
}
