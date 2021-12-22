package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import ml.docilealligator.infinityforreddit.R;

public class TextPost
{
    public void atPage()
    {
        onView(withText("Комментариев ещё нет. Написать комментарий?"))
                .check(matches(isDisplayed()));
    }

    public void deletePost()
    {
        onView(allOf(withText("Удалить пост"), isDisplayed()))
                .perform(click());
    }

    public void confirmDelete()
    {
        onView(allOf(withText("Удалить"), isDisplayed()))
                .perform(click());
    }

    public void isPostDeleted()
    {
        onView(withText(R.string.delete_post_success)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));
    }
}
