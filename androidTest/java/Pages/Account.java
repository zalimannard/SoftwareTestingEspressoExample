package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import ml.docilealligator.infinityforreddit.R;

public class Account extends Page
{
    public void atPage()
    {
        onView(withId(R.id.toolbar_view_user_detail_activity))
                .check(matches(isDisplayed()));
    }
}
