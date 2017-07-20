package model.listeners;

import controller.IItemController;
import model.Item;

/**
 * Created by karenli on 7/18/17.
 */
public class ItemListener implements IItemListener {
    IItemController myController;

    ItemListener(IItemController controller){
        myController = controller;
    }

    @Override
    public void onItemClick(Item clickedItem) {
        myController.openTaskDetails(clickedItem);
    }

}
