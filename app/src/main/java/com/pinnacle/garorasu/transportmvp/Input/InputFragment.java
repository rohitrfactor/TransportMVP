package com.pinnacle.garorasu.transportmvp.Input;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pinnacle.garorasu.transportmvp.R;


public class InputFragment extends Fragment implements InputView{

    private InputViewActionables mListener;
    private TextView mOrigin,mDestination;


    public InputFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_input, container, false);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InputView) {
            mListener = (InputViewActionables) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement InputView");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void setSource() {

    }

    @Override
    public void setDestination() {

    }

    @Override
    public void setDate() {

    }

}
