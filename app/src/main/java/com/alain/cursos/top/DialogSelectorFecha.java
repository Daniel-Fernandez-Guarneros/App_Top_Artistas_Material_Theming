package com.alain.cursos.top;

/* *
 * Projecto: MD Top
 *
 * Daniel Fernandez Guarneros
 *
 * 4A Desarrollo de Software Multiplataforma
 * Diseño de Apps
 */

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class DialogSelectorFecha extends DialogFragment{
    static final String FECHA = "fecha";
    static final String SELECTED_DATE = "selectedDate";

    private DatePickerDialog.OnDateSetListener listener;

    void setListener(DatePickerDialog.OnDateSetListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance(Locale.ROOT);
        Bundle args = this.getArguments();
        if (args != null){
            long fecha = args.getLong(FECHA);
            calendar.setTimeInMillis(fecha);
        }

        int anyo = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(Objects.requireNonNull(getActivity()), listener, anyo, mes, dia);
    }
}
