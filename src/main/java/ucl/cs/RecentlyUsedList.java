package ucl.cs;

import java.util.*;

public class RecentlyUsedList {
    List<String> contents;

    public RecentlyUsedList(){
        contents = new ArrayList<String>();
    }

    public void add(String file){
        if(!contents.contains(file)){
            contents.add(0,file);
        }
    }

    public String get(String file){
        String ret = contents.get(contents.indexOf(file));
        return ret;
    }


}
