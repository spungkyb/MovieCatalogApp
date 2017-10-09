package com.example.android.moviecatalogapp.primary_ui.fragments.upcoming;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.moviecatalogapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingMovieFragment extends Fragment {

    /*private final String TAG = getClass().getSimpleName();
    private UpcomingMoviePresenter upcomingMoviePresenter;

    @BindView(R.id.pb_loading_fragment_upcoming_movie)
    ProgressBar progressBarLoadingFragmentUpcomingMovie;
    @BindView(R.id.rc_view_data_fragment_upcoming_movie)
    RecyclerView recyclerViewDataFragmentUpcomingMovie;*/


    public UpcomingMovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*View viewRoot = inflater.inflate(R.layout.fragment_upcoming_movie, container, false);
        ButterKnife.bind(this, viewRoot);
        initPresenter();
        onAttachView();
        doLoadData();
        return viewRoot;*/
        return inflater.inflate(R.layout.fragment_upcoming_movie, container, false);
    }

    /*private void doLoadData() {
        progressBarLoadingFragmentUpcomingMovie.setVisibility(View.VISIBLE);
        recyclerViewDataFragmentUpcomingMovie.setVisibility(View.GONE);
        upcomingMoviePresenter.onLoadData(getContext());

    }
    private void initPresenter() {
        upcomingMoviePresenter = new UpcomingMoviePresenter();
    }

    @Override
    public void onAttachView(){
        upcomingMoviePresenter.onAttach(this);
    }

    @Override
    public void onDetachView(){
        upcomingMoviePresenter.onDetach();
    }

    @Override
    public void itemClickDetail(ResultUpcomingMovie resultUpcomingMovie){
        Intent intentDetailMovieActivity = new Intent(getContext(), DetailMovieActivity.class);
        intentDetailMovieActivity.putExtra("idMovie", resultUpcomingMovie.getId());
        startActivity(intentDetailMovieActivity);
    }

    @Override
    public void itemClickShare(ResultUpcomingMovie resultUpcomingMovie){
        Intent intentSharingMovie = new Intent(Intent.ACTION_SEND);
        intentSharingMovie.setType("text/plain");
        String bodyMessage = "Upcoming movie: "+ resultUpcomingMovie.getTitle();
        intentSharingMovie.putExtra(Intent.EXTRA_SUBJECT, "Upcoming Movie");
        intentSharingMovie.putExtra(Intent.EXTRA_TEXT, bodyMessage);
        startActivity(intentSharingMovie);
    }

    @Override
    public void loadData(AdapterUpcomingMovie adapterUpcomingMovie){
        progressBarLoadingFragmentUpcomingMovie.setVisibility(View.GONE);
        recyclerViewDataFragmentUpcomingMovie.setVisibility(View.VISIBLE);

        recyclerViewDataFragmentUpcomingMovie.setLayoutManager(new LinearLayoutManager(getContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        recyclerViewDataFragmentUpcomingMovie.addItemDecoration(dividerItemDecoration);
        recyclerViewDataFragmentUpcomingMovie.setAdapter(adapterUpcomingMovie);
    }

    @Override
    public void loadDataFailed(String message){
        progressBarLoadingFragmentUpcomingMovie.setVisibility(View.GONE);
        recyclerViewDataFragmentUpcomingMovie.setVisibility(View.VISIBLE);
        Toast.makeText(
                getContext(),
                message,
                Toast.LENGTH_LONG
        ).show();
    }*/
}