package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by karenli on 7/11/17.
 */
// Note: `FragmentActivity` works here as well
public class DialogDemoActivity extends AppCompatActivity implements AddItemDialogFragment.AddItemDialogListener{

//    private ItemAdapter myItemAdapter;
//
//    public DialogDemoActivity (ItemAdapter itemAdapter){
//        myItemAdapter = itemAdapter;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_item);
        showAddItemDialog();
    }

    private void showAddItemDialog() {
        FragmentManager fm = getSupportFragmentManager();
        AddItemDialogFragment addItemDialogFragment = AddItemDialogFragment.newInstance("Some Title");
        addItemDialogFragment.show(fm, "fragment_edit_name");
    }

    //TODO: Unsure if this belongs here or in MainActivity
    @Override
    public void onFinishAddDialog(String inputText) {
        final EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        String itemText = etNewItem.getText().toString();

        Intent data = new Intent();
//        data.putExtra("posReturn", getIntent().getIntExtra("pos", -1));
        data.putExtra("itemName", itemText);
        setResult(RESULT_OK, data);

        etNewItem.setText("");
        this.finish();
    }
}
