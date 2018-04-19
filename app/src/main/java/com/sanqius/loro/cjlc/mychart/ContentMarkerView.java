
package com.sanqius.loro.cjlc.mychart;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import com.sanqius.loro.cjlc.R;


/**
 * Custom implementation of the MarkerView.
 * 
 * @author Philipp Jahoda
 */
public class ContentMarkerView extends MarkerView {

    private TextView tvContent;

    public ContentMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);

//        tvContent = (TextView) findViewById(R.id.tvContent);
    }

    @Override
    public void refreshContent(Entry e, Highlight highlight) {
        Log.i("dddd", "refreshContent: ");

    }

    // callbacks everytime the MarkerView is redrawn, can be used to update the
    // content (user-interface)


    @Override
    public int getXOffset(float xpos) {
        return 0;
    }

    @Override
    public int getYOffset(float ypos) {
        return 0;
    }

}
