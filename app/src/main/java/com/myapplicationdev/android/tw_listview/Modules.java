package com.myapplicationdev.android.tw_listview;
/**
 * Created by 14036698 on 28/4/2017.
 */

public class Modules {
    private String name;
    private boolean star;
    public Modules(String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public String getName() {
        return name;
    }
    public boolean isStar() {
        return star;
    }

}
