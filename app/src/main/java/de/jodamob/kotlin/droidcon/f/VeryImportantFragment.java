package de.jodamob.kotlin.droidcon.f;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Adapter;

public class VeryImportantFragment extends Fragment {

    public static final String SECRET_KEY_1 = "secretKey1";
    public static final String SECRET_KEY_2 = "secretKey2";

    private String veryImportantState = "i am most important";

    public String getImportantState() {
        return veryImportantState;
    }


    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            veryImportantState = savedInstanceState.getString(SECRET_KEY_1);
        }
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SECRET_KEY_1, veryImportantState);
        outState.putInt(SECRET_KEY_2, 2);
    }

    public void setAdapter(Adapter adapter) {}
    public Adapter getAdapter() { return null;}

}
