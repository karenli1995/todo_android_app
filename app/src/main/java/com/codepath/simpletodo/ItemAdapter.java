package com.codepath.simpletodo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by karenli on 7/12/17.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView categ;
        TextView descr;
    }


    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, R.layout.item, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);

        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.categ = (TextView) convertView.findViewById(R.id.tvCategory);
            viewHolder.descr = (TextView) convertView.findViewById(R.id.tvDescr);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.name.setText(item.getName());
        viewHolder.categ.setText(item.getCategory());
        viewHolder.descr.setText(item.getMyDescription());

        // Return the completed view to render on screen
        return convertView;

    }

}
