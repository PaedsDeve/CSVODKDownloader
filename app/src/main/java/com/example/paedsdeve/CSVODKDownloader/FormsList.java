package com.example.paedsdeve.CSVODKDownloader;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.paedsdeve.CSVODKDownloader.contracts.FormsContract;
import com.example.paedsdeve.CSVODKDownloader.R;

public class FormsList extends Activity {

    @BindView(R.id.totalForms)
    TextView totalForms;
    @BindView(R.id.completeForms)
    TextView completeForms;
    @BindView(R.id.psuNoTxt)
    TextView psuNoTxt;
    @BindView(R.id.FormsList)
    RecyclerView formsList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_list);
        ButterKnife.bind(this);
        int fTotal = 0;
        int fComplete = 0;
        psuNoTxt.setText("Forms");
        DatabaseHelper db = new DatabaseHelper(getApplicationContext());
        List<FormsContract> forms = db.getFormsByT_HF_LHW(AppMain.tehsilCode, AppMain.hfCode, AppMain.lhwCode);
        for (FormsContract fc : forms) {
            fTotal++;
            if (fc.getiStatus().contains("1")) {
                fComplete++;
            }
        }
        totalForms.setText("Total Forms: " + fTotal);
        completeForms.setText("Complete Forms: " + fComplete);

        mRecyclerView = (RecyclerView) findViewById(R.id.FormsList);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);


        mAdapter = new FormsAdapter(forms, getApplication());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(5000);
        itemAnimator.setRemoveDuration(5000);
        mRecyclerView.setItemAnimator(itemAnimator);


    }

    public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
        Context c;
        private List<FormsContract> fc = Collections.emptyList();

        // Provide a suitable constructor (depends on the kind of dataset)
        public FormsAdapter(List<FormsContract> fc, Context c) {
            this.fc = fc;
            this.c = c;
            Log.d("TAG:count", String.valueOf(getItemCount()));
        }

        // Create new views (invoked by the layout manager)
        @Override
        public FormsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.forms_list, parent, false);
            // set the view's size, margins, paddings and layout parameters

            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.date.setText(fc.get(position).getHhDT().toString());
            holder.childId.setText(fc.get(position).getChildId().toString());
            String iStatus = "Status";
            int iColor = 0;
            switch (fc.get(position).getiStatus().toString()) {
                case "1":
                    iStatus = "Complete";
                    iColor = Color.GREEN;
                    break;
                case "2":
                    iStatus = "Incomplete";
                    iColor = Color.RED;
                    break;
                case "3":
                    iStatus = "Incomplete";
                    iColor = Color.RED;
                    break;
                default:
                    iStatus = "N/A";
                    iColor = Color.RED;
                    break;
            }

            holder.istatus.setText(iStatus);
            holder.istatus.setTextColor(iColor);


        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return fc.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public RecyclerView rv;
            public TextView date;
            public TextView childId;
            public TextView istatus;
            // each data item is just a string in this case

            public ViewHolder(View v) {
                super(v);
                rv = (RecyclerView) v.findViewById(R.id.FormsList);
                date = (TextView) v.findViewById(R.id.date);
                childId = (TextView) v.findViewById(R.id.childId);
                istatus = (TextView) v.findViewById(R.id.istatus);

            }
        }
    }

}