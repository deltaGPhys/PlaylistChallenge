package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer length = this.playList.length;
        for (int i = 1; i < length; i++) {

            if (playList[(startIndex + i)%length].equals(selection) || playList[(length + startIndex - i)%length].equals(selection)) {
                return i;
            }
        }

        return 0;
    }
}
