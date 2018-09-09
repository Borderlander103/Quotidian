package borderlander103.github.com.quotidian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Button for quotes_list
        Button quotes = (Button) findViewById(R.id.quotes);

        //Set OnClick listener for quotes_list button
        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quotesIntent = new Intent(MainActivity.this, ActivityQuoteList.class);
                startActivity(quotesIntent);
            }
        });

    }
}
