import ImplementationsChallenges.BreakingTheRecords
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xon
import org.junit.Assert.assertEquals

object BreakingTheRecordsSpec: Spek({
    given("a breakingTheRecords class") {
        val records = listOf(10, 5, 20, 20, 4, 5, 2, 25, 1)
        val breakingTheRecords = BreakingTheRecords(records)
        on("highest"){
            val highest = breakingTheRecords.highest()
            assertEquals(2, highest.size)
            assertEquals(listOf(20, 25), highest)
        }

        on("lowest"){
            val lowest = breakingTheRecords.lowest()
            assertEquals(4, lowest.size)
            assertEquals(listOf(5, 4, 2, 1), lowest)
        }
    }
})