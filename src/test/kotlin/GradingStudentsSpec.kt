import ImplementationsChallenges.GradingStudents
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object GradingStudentsSpec: Spek({
    on("count") {
        val gradingStudents = GradingStudents()
        it("return corrent grades") {
            val grades = listOf(
                    27, 89, 56, 47, 38
                    , 12, 98, 72, 85, 76
                    , 72, 56, 23, 77, 25
                    , 49, 4, 52, 71, 43
                    , 11, 2, 44, 10, 20
                    , 3, 90, 64, 48, 31
                    , 56, 51, 70, 91, 14
                    , 25, 61, 41, 0
            )
            val expectedResults = listOf(
                    27, 90, 56, 47, 40
                    , 12, 100, 72, 85, 76
                    , 72, 56, 23, 77, 25
                    , 50, 4, 52, 71, 45
                    , 11, 2, 45, 10, 20
                    , 3, 90, 65, 50, 31
                    , 56, 51, 70, 91, 14
                    , 25, 61, 41, 0
            )
            val results = gradingStudents.count(grades)
            assertEquals(expectedResults, results)
        }
    }
})
