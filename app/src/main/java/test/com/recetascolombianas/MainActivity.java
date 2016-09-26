package test.com.recetascolombianas;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity implements RecetaListFragment.RecetaListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*RecetaDetalleFragment frag = (RecetaDetalleFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setRecetaId(1);*/
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);

        if(fragmentContainer != null) {
            RecetaDetalleFragment details = new RecetaDetalleFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            details.setRecetaId(id);
            ft.replace(R.id.fragment_container, details);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }else{
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int) id);
            startActivity(intent);
        }
    }
}


