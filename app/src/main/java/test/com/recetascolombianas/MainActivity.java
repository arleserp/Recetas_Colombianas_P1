package test.com.recetascolombianas;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecetaDetalleFragment frag = (RecetaDetalleFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setRecetaId(1);
    }
}


