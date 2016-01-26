package com.example.appsd.tagcloudandroid3d;

/**
 * Created by appsd on 1/26/2016.
 */



        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.view.Gravity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;


        import com.moxun.tagcloudlib.view.TagsAdapter;


        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Random;


/**
 * Created by Bulbul on 16/1/19.
 */
public class TextTagsAdapter extends TagsAdapter {


    private List<String> dataSet = new ArrayList<>();


    public TextTagsAdapter(@NonNull String... data) {
        dataSet.clear();
        Collections.addAll(dataSet,data);
    }


    @Override
    public int getCount() {
        return dataSet.size();
    }


    @Override
    public View getView(Context context, int position, ViewGroup parent) {
        TextView tv = new TextView(context);
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(100, 100);
        tv.setLayoutParams(lp);
        tv.setText("Bangldesh" + position);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }


    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }


    @Override
    public int getPopularity(int position) {
        return Math.abs(new Random().nextInt(5) + 2);
    }


    @Override
    public void onThemeColorChanged(View view, int themeColor) {
        ((TextView)view).setTextColor(themeColor);
    }
}
