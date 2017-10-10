package ucl.cs;

import org.junit.*;

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


}
