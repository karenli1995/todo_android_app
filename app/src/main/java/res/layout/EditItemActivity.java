package res.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.codepath.simpletodo.R;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String todo_item = getIntent().getStringExtra("todo_item");
        //populate EditText with todo_item
        final EditText et = (EditText) findViewById(R.id.editText);
        et.setText(todo_item);
    }

    public void onSubmit(View v) {
        Intent data = new Intent();
        final EditText et = (EditText) findViewById(R.id.editText);
        data.putExtra("posReturn", getIntent().getIntExtra("pos", -1));
        data.putExtra("editText", et.getText().toString());
        setResult(RESULT_OK, data);
        // closes the activity and returns to first screen
        this.finish();
    }
}
