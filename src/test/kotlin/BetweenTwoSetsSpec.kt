import ImplementationsChallenges.BetweenTwoSets
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object BetweenTwoSetsSpec : Spek({
    given("listA and listB") {
        on("find") {
            val betweenTwoSet = BetweenTwoSets()

            it("return number of integers that are between the two sets") {
                val a = listOf(2, 4)
                val b = listOf(16, 32, 96)
                assertEquals(3, betweenTwoSet.find(a, b))
            }

            it("return 2 (first of listA and last listB) when there is no factor between in range last listA and first listB") {
                val listA = listOf(2, 3, 6)
                val listB = listOf(42, 84)
                assertEquals(2, betweenTwoSet.find(listA, listB))
            }

            it("return 0 when last listA > first listB") {
                val listA = listOf(51)
                val listB = listOf(50)
                assertEquals(0, betweenTwoSet.find(listA, listB))
            }
        }
    }
})