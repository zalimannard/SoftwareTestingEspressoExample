package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import ml.docilealligator.infinityforreddit.R;

public class Inbox extends Page
{
    public void clickReadAllMessages()
    {
        onView(allOf(withText("Прочитать все сообщения"), isDisplayed()))
                .perform(click());
    }

    public void isMessageReaded()
    {
        onView(withText(R.string.please_wait)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));
    }
}
