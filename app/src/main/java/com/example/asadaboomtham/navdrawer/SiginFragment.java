package com.example.asadaboomtham.navdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SiginFragment extends Fragment {


    public SiginFragment() {
        // Required empty public constructor
    }

    EditText etEmail, etPassword;
    Button btnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sigin, container, false);

        etEmail = (EditText) view.findViewById(R.id.etEmail);
        etPassword = (EditText) view.findViewById(R.id.etPassword);
        btnLogin = (Button) view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals("asadaboontham@gmail.com") && etPassword.getText().toString().equals("12345")) {
                    Toast.makeText(SiginFragment.this.getActivity(), "Login Success", Toast.LENGTH_SHORT).show();

                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    BookStoreFragment llf = new BookStoreFragment();
                    ft.replace(R.id.mainLayout, llf);
                    ft.commit();

                } else {
                    Toast.makeText(SiginFragment.this.getActivity(), "Login Fail Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
