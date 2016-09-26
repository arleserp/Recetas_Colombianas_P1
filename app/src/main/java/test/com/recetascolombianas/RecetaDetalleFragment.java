package test.com.recetascolombianas;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetaDetalleFragment extends Fragment {
    private long recetaId;

    public RecetaDetalleFragment(){
        //required empty public constructor
    }

    public void setRecetaId(long id){
        this.recetaId = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(savedInstanceState != null){
            recetaId = savedInstanceState.getLong("recetaId");
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receta_detalle, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Receta receta = Receta.recetas[(int) recetaId];
            title.setText(receta.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(receta.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("recetaId", recetaId);
    }
}



