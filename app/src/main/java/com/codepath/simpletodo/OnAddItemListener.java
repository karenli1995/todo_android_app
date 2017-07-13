package com.codepath.simpletodo;

import android.view.KeyEvent;
import android.widget.TextView;

/**
 * Created by karenli on 7/12/17.
 */
public interface OnAddItemListener {
    public boolean onAddAction(TextView v, int actionId, KeyEvent event);
}
