package test.com.recetascolombianas;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecetaListFragment extends ListFragment {

    static interface RecetaListListener{
        void itemClicked(long id);
    };

    private  RecetaListListener listener;

    public RecetaListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Receta.recetas.length];
        for(int i=0; i < names.length; i++){
            names[i] = Receta.recetas[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.listener = (RecetaListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        if(listener != null){
            listener.itemClicked(id);
        }
    }
}