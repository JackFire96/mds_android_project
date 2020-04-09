package fr.mds.geekquote.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import fr.mds.geekquote.R;
import fr.mds.geekquote.model.Quote;

public class QuoteListAdapter extends ArrayAdapter<Quote> {
    public QuoteListAdapter(@NonNull Context context, int resource, @NonNull Quote[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Quote quote =getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_quote, parent, false);
        }
        TextView tv_item_quote_strQuote = convertView.findViewById(R.layout.tv_item_quote_strQuote)
    }
}
