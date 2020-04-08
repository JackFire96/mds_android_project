package fr.mds.geekquote.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class DemoGeekQuote extends AppCompatActivity {

    private static final String TAG = "GeekQuote";

    ArrayList<Quote> quotes = new ArrayList<>();

    EditText et_main_quote;
    Button bt_main_add_list;
    ListView tv_main_quote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.d("GeekQuote", "New List");

        et_main_quote = findViewById(R.id.et_main_quote);
        tv_main_quote = findViewById(R.id.tv_main_quote);
        bt_main_add_list = findViewById(R.id.bt_main_add_list);

        String[] newArrayGeekQuote = getResources().getStringArray(R.array.initial_quotes);
        for(int i = 0; i < newArrayGeekQuote.length; i++) {
            String item = newArrayGeekQuote[i];
            addQuote(item);
        }

        final ArrayAdapter<Quote> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, quotes);
        tv_main_quote.setAdapter(adapter);

        bt_main_add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = et_main_quote.getText().toString();
                addQuote(newText);
                adapter.notifyDataSetChanged();
                et_main_quote.setText("");
            }
        });

    }

    void addQuote(String strQuote) {
        Quote newQuote = new Quote();
        newQuote.setStrQuote(strQuote);
        newQuote.setRating(0);
        newQuote.setCreatingDate(new Date());

        this.quotes.add(newQuote);
        Log.d("GeekQuote","Item added " + newQuote.getStrQuote());
    }
}
