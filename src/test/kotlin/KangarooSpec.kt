import ImplementationsChallenges.Kangaroo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object KangarooSpec : Spek({
    given("The starting locations and movement rates for each kangaroo") {
        on("canMeet") {
            it("return YES when speed of first kangoroo > second kangoroo") {
                val kangaroo = Kangaroo()
                val firstKangoroo = listOf(0, 3)
                val secondKangoroo = listOf(4, 2)

                assertEquals("YES", kangaroo.canMeet(firstKangoroo, secondKangoroo))
            }

            it("return NO when speed of first kangoroo < second kangoroo") {
                val kangoroo = Kangaroo()
                val firstKangoroo = listOf(0, 2)
                val secondKangoroo = listOf(5, 3)

                assertEquals("NO", kangoroo.canMeet(firstKangoroo, secondKangoroo))
            }
        }
    }
})