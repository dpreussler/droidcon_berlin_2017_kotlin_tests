package de.jodamob.kotlin.droidcon;

import android.app.Fragment;
import android.os.Bundle;

public class VeryImportantFragment extends Fragment {

    public static final String SECRET_KEY_1 = "secretKey1";
    public static final String SECRET_KEY_2 = "secretKey2";

    private String veryImportantState = "i am most important";

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SECRET_KEY_1, veryImportantState);
        outState.putInt(SECRET_KEY_2, 2);
    }
}
