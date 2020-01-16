package com.example.administrator.statusbarsetting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private View statusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.changeStatusTextColor(this, false);
        statusView = findViewById(R.id.status_bar_view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, StatusBarUtil.getStatusHeight(this));
        statusView.setLayoutParams(layoutParams);
    }
}
