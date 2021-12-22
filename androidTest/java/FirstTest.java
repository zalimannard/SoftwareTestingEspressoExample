import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import Pages.Account;
import Pages.Header;
import Pages.Inbox;
import Pages.LeftMenu;
import Pages.Main;
import Pages.Subreddit;
import Pages.CreateTextPost;
import Pages.TextPost;
import ml.docilealligator.infinityforreddit.activities.MainActivity;

@RunWith(AndroidJUnit4.class)
public class FirstTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    Header header = new Header();
    LeftMenu leftMenu = new LeftMenu();
    Account account = new Account();
    Main main = new Main();
    CreateTextPost createTextPost = new CreateTextPost();
    Subreddit subreddit = new Subreddit();
    TextPost textPost = new TextPost();
    Inbox inbox = new Inbox();

    @Test
    public void accountDetails() {
        header.clickHamburger();
        leftMenu.clickAccount();
        account.atPage();
    }

    @Test
    public void addDelElement()
    {
        main.createPost();
        main.chooseText();
        createTextPost.chooseSubreddit();
        subreddit.choose("Zalimannard");
        createTextPost.sendTitle("espressoChecking");
        createTextPost.sendContent("espressoChecking");
        createTextPost.publicPost();
        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        textPost.atPage();
        header.clickMore();
        textPost.deletePost();
        textPost.confirmDelete();
        textPost.isPostDeleted();
    }

    @Test
    public void toastsTest()
    {
        header.clickHamburger();
        leftMenu.clickInbox();
        header.clickMore();
        inbox.clickReadAllMessages();
        inbox.isMessageReaded();
    }

//    @Test
//    public void swipeTest()
//    {
//        header.clickHamburger();
//        leftMenu.moveToDown();
//        leftMenu.isZshVisible();
//    }
}