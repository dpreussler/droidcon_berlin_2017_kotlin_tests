package de.jodamob.kotlin.droidcon.f;

import android.os.Bundle;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class VeryImportantFragmentTest {

    @Mock
    Bundle bundle;
    VeryImportantFragment tested = new VeryImportantFragment();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(bundle.getString(anyString())).thenReturn("this is a test");
    }

    @Test
    public void readFromBundle() {
        tested.onCreate(bundle);
        verify(bundle).getString("secretKey1");
        assertEquals("this is a test", tested.getImportantState());
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