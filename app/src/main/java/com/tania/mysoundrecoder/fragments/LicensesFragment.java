package com.tania.mysoundrecoder.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tania.mysoundrecoder.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LicensesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LicensesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LicensesFragment extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater dialogInflater = getActivity().getLayoutInflater();
        View openSourceLicensesView = dialogInflater.inflate(R.layout.fragment_licenses, null);

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        dialogBuilder.setView(openSourceLicensesView)
                .setTitle((getString(R.string.dialog_title_licenses)))
                .setNeutralButton(android.R.string.ok, null);

        return dialogBuilder.create();
    }


}
