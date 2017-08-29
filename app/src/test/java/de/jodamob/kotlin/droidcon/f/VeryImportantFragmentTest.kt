package de.jodamob.kotlin.droidcon.f

import android.os.Bundle
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.inOrder
import com.nhaarman.mockito_kotlin.mock
import org.amshove.kluent.*
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString

class VeryImportantFragmentTest {

    val bundle = mock<Bundle> {
        on {getString(anyString())} doReturn "test"
    }
    val tested = VeryImportantFragment()

    @Test
    fun readsFromBundle() {
        tested.onCreate(bundle)

        Verify on bundle that bundle.getString("secretKey1") was called
        tested.importantState `should equal` "test"
    }

    @Test
    fun writesToBundle() {
        tested.onSaveInstanceState(bundle)

        inOrder(bundle) {
            verify(bundle).putString("secretKey1", "i am most important")
            verify(bundle).putInt("secretKey2", 2)
            verifyNoMoreInteractions()
        }
    }

}