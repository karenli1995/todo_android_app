package com.codepath.simpletodo;

/**
 * Created by karenli on 7/11/17.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.*;

public class AddItemDialogFragment extends DialogFragment implements AdapterView.OnClickListener{

    private EditText myName;
    private Spinner myCategory;
    private EditText myDescr;
    private Button myDoneButton;
    private Button myCancelButton;

    // 1. Defines the listener interface with a method passing back data result.
    public interface AddItemDialogListener {
        void onFinishAddDialog(String inputText);
    }


    public AddItemDialogFragment() {
        // Empty constructor is required for DialogFragment
        // Make sure not to add arguments to the constructor
        // Use `newInstance` instead as shown below
    }

    public static AddItemDialogFragment newInstance(String title) {
        AddItemDialogFragment frag = new AddItemDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_item, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Get field from view
        myName = (EditText) view.findViewById(R.id.myNameEdit);
        // Fetch arguments from bundle and set title
//        String title = getArguments().getString("title", "Enter Item Name");
//        getDialog().setTitle(title);
        // Show soft keyboard automatically and request focus to field
        myName.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

//        myCategory = (Spinner) view.findViewById(R.id.myCategSpinner);

        myDescr = (EditText) view.findViewById(R.id.myDescrEdit);

        myDoneButton = (Button) view.findViewById(R.id.myAddBtn);
        myDoneButton.setOnClickListener(this);

        myCancelButton = (Button) view.findViewById(R.id.myCancelBtn);
        myCancelButton.setOnClickListener(this);
    }

    // Fires whenever the textfield has an action performed
    // REQUIRES a 'soft keyboard' (virtual keyboard)
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.myAddBtn:
                // Return input text back to activity through the implemented listener
                AddItemDialogListener listener = (AddItemDialogListener) getActivity();
                listener.onFinishAddDialog(myName.getText().toString());
                // Close the dialog and return back to the parent activity
                dismiss();

            case R.id.myCancelBtn:
                dismiss();
        }
    }
}
