package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import ml.docilealligator.infinityforreddit.R;

public class CreateTextPost
{
    public void chooseSubreddit()
    {
        onView(allOf(withText("Выбрать сабреддит"), isDisplayed()))
                .perform(click());
    }

    public void sendTitle(String text)
    {
        onView(allOf(withId(R.id.post_title_edit_text_post_text_activity), isDisplayed()))
                .perform(typeText(text), closeSoftKeyboard());
    }

    public void sendContent(String text)
    {
        onView(allOf(withHint("Контент"), isDisplayed()))
                .perform(typeText(text));
    }

    public void publicPost()
    {
        onView(allOf(withId(R.id.action_send_post_text_activity), isDisplayed()))
                .perform(click());
    }
}
