package de.jodamob.kotlin.droidcon.more

import org.amshove.kluent.`should contain`
import org.amshove.kluent.`should equal`
import org.junit.Test
import kotlin.reflect.KFunction1


var jsonText = """
    {
        "channels":{
            "BOOKING":1443439538,
            "GTG":1443439537
         }
    }"""


@Test
fun should_greet() {
    calling { tested::greet } with "Droidcon" `should equal` "Hello Droidcon"
}

@Test
fun should_be_international() {
    tested.someGreetings `should contain` "Hallo"
}

infix fun calling(function: () -> KFunction1<String, String>) = function

infix fun (() -> KFunction1<String, String>).with(argument: String) =
        this.invoke().invoke(argument)
//build map
//use apply on mock
//extension function for better readability


//private fun LoadSeriesSessionUseCase.givenSession(sessionModel : SessionModel?) {
//    sessionModel?.let {
//        com.nhaarman.mockito_kotlin.whenever(execute(com.nhaarman.mockito_kotlin.any())).thenReturn(
//                Observable.just(SeriesSession(kotlin.collections.mapOf(kotlin.Pair(sessionModel.episodeMGID, sessionModel)))))
//    } ?: com.nhaarman.mockito_kotlin.whenever(execute(com.nhaarman.mockito_kotlin.any())).thenReturn(Observable.just(SeriesSession(kotlin.collections.mapOf())))
//}


//@Test
//fun `should forward touch up via listener`() {
//    tested.setOverScrollListener(scrollListener)
//
//    tested.onScroll(START_SCROLL, END_SCROLL)
//
//    verify(scrollListener).onStopped()
//}
//
//@Test
//fun `should ignore if nothing moved`() {
//    tested.setOverScrollListener(scrollListener)
//
//    tested.onScroll(START_SCROLL, START_SCROLL)
//
//    verify(scrollListener, never()).onStopped()
//}