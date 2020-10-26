package com.example.newbiechen.ireader.widget.page;

import java.util.List;

/**
 * 每一个页面的信息
 * Created by newbiechen on 17-7-1.
 */

public class TxtPage {
    public int position;
    public String title;
    public int titleLines; //当前 lines 中为 title 的行数。
    public List<String> lines;
}
