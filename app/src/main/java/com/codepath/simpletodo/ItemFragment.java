package com.codepath.simpletodo;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import controller.IItemController;
import model.ItemAdapter;
import model.listeners.ItemListener;
import view.IItemView;
import model.Item;

/**
 * Created by karenli on 7/19/17.
 */
public class ItemFragment extends Fragment implements IItemView {

    private ItemAdapter myItemAdapter;
    private ItemListener myItemListener;
    private ListView lvItems;

    IItemController myItemController;

    public ItemFragment() {
        // Requires empty public constructor
    }

    public static ItemFragment newInstance() {
        return new ItemFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myItemAdapter = new ItemAdapter(new ArrayList<Item>(0), myItemListener);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        // Set up tasks view
        ListView listView = (ListView) root.findViewById(R.id.tasks_list);
        listView.setAdapter(myItemAdapter);
        mFilteringLabelView = (TextView) root.findViewById(R.id.filteringLabel);
        myItemView = (LinearLayout) root.findViewById(R.id.tasksLL);

        // Set up floating action button
        FloatingActionButton fab =
                (FloatingActionButton) getActivity().findViewById(R.id.fab_add_task);

        fab.setImageResource(R.drawable.ic_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myItemController.addNewTask();
            }
        });

//        setHasOptionsMenu(true);

        return root;
    }

    @Override
    public void showAddTask() {
        Intent intent = new Intent(this, AddEditTaskActivity.class);
        startActivityForResult(intent, AddEditTaskActivity.REQUEST_ADD_TASK);
    }

    @Override
    public void setController(@NonNull IItemController itemController) {
        myItemController = checkNotNull(itemController);
    }
}
