package model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import model.listeners.ItemListener;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by karenli on 7/17/17.
 */
public class ItemAdapter extends BaseAdapter {
    private List<Item> myItems;
    private ItemListener myItemListener;

    public ItemAdapter(List<Item> items, ItemListener itemListener) {
        setList(items);
        myItemListener = itemListener;
    }

    private void setList(List<Item> items) {
        myItems = checkNotNull(items);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

    }

    @Override
    public Item getItem(int i) {
        return myItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getCount() {
        return myItems.size();
    }
}
