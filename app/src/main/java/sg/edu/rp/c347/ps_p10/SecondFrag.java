package sg.edu.rp.c347.ps_p10;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFrag extends Fragment {

    Button btnColor;
    int rand = 1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFrag newInstance(String param1, String param2) {
        SecondFrag fragment = new SecondFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnColor = view.findViewById(R.id.btnColor);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rand == 1){
                    view.setBackgroundColor(Color.RED);
                    rand++;
                }else if(rand == 2){
                    view.setBackgroundColor(Color.BLUE);
                    rand++;
                }else if(rand == 3){
                    view.setBackgroundColor(Color.GREEN);
                    rand++;
                }else if(rand == 4){
                    view.setBackgroundColor(Color.GRAY);
                    rand = 1;
                }

            }
        });

        return view;
    }
}