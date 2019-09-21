package org.giselle.tarea4;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_android_black_24dp, android.R.color.holo_green_dark, "android"));
        list.add(new ListViewItem(R.drawable.ic_child_care_black_24dp,android.R.color.holo_blue_dark, "child care"));
        list.add(new ListViewItem(R.drawable.ic_directions_bike_black_24dp,android.R.color.holo_blue_light, "directions bike"));
        list.add(new ListViewItem(R.drawable.ic_directions_subway_black_24dp,android.R.color.holo_green_light, "directions subway"));
        list.add(new ListViewItem(R.drawable.ic_local_airport_black_24dp, android.R.color.holo_orange_dark,"local airport"));
        list.add(new ListViewItem(R.drawable.ic_notifications_active_black_24dp,android.R.color.holo_orange_light, "notifications active"));
        list.add(new ListViewItem(R.drawable.ic_pan_tool_black_24dp, android.R.color.holo_red_dark,"pan tool"));
        list.add(new ListViewItem(R.drawable.ic_record_voice_over_black_24dp, android.R.color.holo_red_light,"record voice over"));
        list.add(new ListViewItem(R.drawable.ic_wb_sunny_black_24dp,android.R.color.holo_purple,"wb sunny"));

        return list;
    }
}