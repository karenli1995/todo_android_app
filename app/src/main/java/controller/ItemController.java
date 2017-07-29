package controller;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

import view.IItemView;

/**
 * Created by karenli on 7/18/17.
 */
public class ItemController implements IItemController{
    private final IItemView myItemsView;

    public ItemController(@NonNull TasksRepository tasksRepository, @NonNull IItemView itemsView) {
        mTasksRepository = checkNotNull(tasksRepository, "tasksRepository cannot be null");
        myItemsView = checkNotNull(itemsView, "itemsView cannot be null!");

        myItemsView.setController(this);
    }

    @Override
    public void addNewTask() {
        myItemsView.showAddTask();
    }
}
