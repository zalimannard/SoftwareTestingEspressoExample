package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class LeftMenu extends Page
{
    public void clickAccount()
    {
        onView(allOf(withText("Профиль"), isDisplayed()))
                .perform(click());
    }

    public void clickInbox()
    {
        onView(allOf(withText("Входящие"), isDisplayed()))
                .perform(click());
    }

    public void isZshVisible()
    {
        onView(withText("zsh"))
                .check(matches(isDisplayed()));
    }
}
