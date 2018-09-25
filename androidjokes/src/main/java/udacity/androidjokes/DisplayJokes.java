package udacity.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        textView = findViewById(R.id.joke_text);

        String joke = "";

        Intent intent = getIntent();
        joke = intent.getStringExtra("jokes");

        if(TextUtils.isEmpty(joke)){
            textView.setText(R.string.no_joke);
        }
        else textView.setText(joke);
    }
}
