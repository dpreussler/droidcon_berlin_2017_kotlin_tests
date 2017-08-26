package de.jodamob.kotlin.droidcon;

import android.os.Bundle;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class VeryImportantFragmentTest {

    Bundle bundle = mock(Bundle.class);
    VeryImportantFragment tested = new VeryImportantFragment();

    @Test
    public void testWritesToBundle() {
        InOrder verifier = inOrder(bundle);

        tested.onSaveInstanceState(bundle);

        verifier.verify(bundle).putString("secretKey1", "i am most important");
        verifier.verify(bundle).putInt("secretKey2", 2);
        verifier.verifyNoMoreInteractions();
    }

}