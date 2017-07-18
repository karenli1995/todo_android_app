package model;

import model.listeners.IItemListener;

/**
 * Created by karenli on 7/18/17.
 */
public class ItemListener implements IItemListener{
    ItemPresenter myPresenter;

    @Override
    public void onItemClick(Item clickedTask) {
        myPresenter.openTaskDetails(clickedTask);
    }
}
