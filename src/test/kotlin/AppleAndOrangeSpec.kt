import ImplementationsChallenges.AppleAndOrange
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object AppleAndOrangeSpec : Spek({
    given("startRangePoint, endRangePoint") {
        val startRangePoint = 7
        val endRangePoint = 11
        val appleAndOrange = AppleAndOrange(startRangePoint, endRangePoint)

        on("countInRange") {
            it("return correct number of fruits fall in range") {
                val applePoint = 5
                val appleDistances = listOf(-2, 2, 1)
                assertEquals(1, appleAndOrange.countInRange(applePoint, appleDistances))

                val orangePoint = 15
                val orangeDistances = listOf(5, -6)
                assertEquals(1, appleAndOrange.countInRange(orangePoint, orangeDistances))
            }
        }
    }
})