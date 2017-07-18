package model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import model.listeners.IItemListener;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by karenli on 7/17/17.
 */
public class ItemAdapter extends BaseAdapter {
    private List<Item> myItems;
    private IItemListener myItemListener;

    public ItemAdapter(List<Item> items, IItemListener itemListener) {
        setList(items);
        myItemListener = itemListener;
    }

    public void replaceData(List<Item> items) {
        setList(items);
        notifyDataSetChanged();
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
