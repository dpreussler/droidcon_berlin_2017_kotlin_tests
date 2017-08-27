package de.jodamob.kotlin.droidcon.f;

import android.os.Bundle;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VeryImportantFragmentTest {

    Bundle bundle = mock(Bundle.class);
    VeryImportantFragment tested = new VeryImportantFragment();

    @Test
    public void readsFromBundle() {
        tested.onCreate(bundle);
        verify(bundle).getString("secretKey1");
    }

    @Test
    public void writesToBundle() {
        InOrder verifier = inOrder(bundle);

        tested.onSaveInstanceState(bundle);

        verifier.verify(bundle).putString("secretKey1", "i am most important");
        verifier.verify(bundle).putInt("secretKey2", 2);
        verifier.verifyNoMoreInteractions();
    }

}