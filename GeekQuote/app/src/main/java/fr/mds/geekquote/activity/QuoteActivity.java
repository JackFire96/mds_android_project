package fr.mds.geekquote.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class QuoteActivity extends Activity implements View.OnClickListener {

    private TextView tv_quote, tv_quote_date;
    private RatingBar rb_quote;
    private Button bt_quote_ok, bt_quote_cancel;
    private Quote quote;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        tv_quote = findViewById(R.id.tv_quote);
        tv_quote_date = findViewById(R.id.tv_quote_date);
        rb_quote = findViewById(R.id.rb_quote);
        bt_quote_ok = findViewById(R.id.bt_quote_ok);
        bt_quote_cancel = findViewById(R.id.bt_quote_cancel);

        bt_quote_cancel.setOnClickListener(this);
        bt_quote_ok.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            quote = (Quote) bundle.getSerializable("data");
            tv_quote.setText(quote.getStrQuote());
            tv_quote_date.setText(java.text.DateFormat.getDateTimeInstance().format(quote.getCreationDate()));
            rb_quote.setRating(quote.getRating());
        }
    }

    @Override
    public void onClick(View v) {
        if (v == bt_quote_ok) {
            Float rating = rb_quote.getRating();
            quote.setRating(rb_quote.getRating());
            Log.d(QuoteListActivity.TAG, String.valueOf(quote));
            getIntent()
                    .putExtra("strQuote", quote.getStrQuote())
                    .putExtra("rating", quote.getRating());
            setResult(10, getIntent());
            finish();
        } else {
            getIntent();
            finish();
        }
    }
}