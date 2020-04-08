package fr.mds.geekquote.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GeekQuote";

    private ArrayList<Quote> quotes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] initialQuotes = getResources().getStringArray(R.array.initial_quotes);

        for(String s : initialQuotes) {
            addQuote(s);
        }

        Log.d(TAG, quotes.toString());
    }

    void addQuote(String strQuote) {
        Quote quote = new Quote(strQuote);
        quotes.add(quote);

        Toast.makeText(this, strQuote, Toast.LENGTH_SHORT).show();
    }
}
