package borderlander103.github.com.quotidian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Button for quotes_list
        Button mQuotesList = findViewById(R.id.quotesList);

        //Set OnClick listener for quotes button
        mQuotesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "It's working!", Toast.LENGTH_SHORT).show();
                Intent quotesIntent = new Intent(MainActivity.this, ActivityQuoteList.class);
                startActivity(quotesIntent);
            }
        });

        //Find Button for settings
        Button mSettings = findViewById(R.id.settings);

        //Set OnClickListener for settings button
        mSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yo!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
