package ucl.cs;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.*;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RecentlyUsedListTest {

    @Test
    public void isInitialEmpty(){
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        assertThat(recentlyUsedList.contents.size(), is(0));
    }

    @Test
    public void isAdded(){
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("dog");
        assertThat(recentlyUsedList.contents.size(), is(1));
    }

    @Test
    public void isRetrieved(){
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("dog");
        assertThat(recentlyUsedList.get("dog"), is("dog"));
    }

    @Test
    public void noDuplicates(){
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("dog");
        recentlyUsedList.add("dog");
        assertThat(recentlyUsedList.contents.size(), is(1));
    }

    @Test
    public void isFirstMostRecent(){
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("dog");
        recentlyUsedList.add("cat");
        assertThat(recentlyUsedList.contents.get(0), is("cat"));
        assertThat(recentlyUsedList.contents.size(), is(2));
    }




}
