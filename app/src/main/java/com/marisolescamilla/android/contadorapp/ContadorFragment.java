package com.marisolescamilla.android.contadorapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by alumno-04 on 15/02/19.
 */

public class ContadorFragment extends Fragment {
    private EditText mNumeroContado;
    private Button mBotonContar;
    private Button mBotonReiniciar;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contador, container, false);

        mNumeroContado = view.findViewById(R.id.campo_conteo);
        mBotonContar = view.findViewById(R.id.boton_contar);
        mBotonReiniciar = view.findViewById(R.id.boton_reiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mNumeroContado.getText().toString();
                int numero = Integer.parseInt(s);

                numero++;

                s = String.valueOf(numero);

                mNumeroContado.setText(s);
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumeroContado.setText("0");
            }
        });
        return view;
    }
}
