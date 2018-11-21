package bj1

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals
import kotlin.test.fail

class CardTest {
    @Test
    fun t1() {
        val c1 = Card(1, 1)
        //Named params
        val c2 = Card(value = 13, suit = 4)
        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("Ace", c1.valueName)
        assertEquals("Ace of Spades", c1.name)
        assertEquals(1, c1.points)


        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)
        assertEquals("King", c2.valueName)
        assertEquals("King of Diamonds", c2.name)
        assertEquals(10, c2.points)


    }

    @Test
    fun testCardValuesMustOnlyBe1to13() {
        try {
            Card(14, 2)
            fail("shouldn't get here")
        } catch (e: IllegalArgumentException) {
            //good
        }
    }

    @Test
    fun testSuitsMustOnlyBe1to4() {
        try {
            Card(1, 5)
            fail("shouldn't get here")
        } catch (e: IllegalArgumentException) {
            //good
        }
    }

    @Test
    fun testSuit4IsDiamonds() {
        val c1 = Card(1, 4)
        assertEquals("Diamonds", c1.suitName)
    }

    @Test
    fun testSuit3IsClubs() {
        val c1 = Card(1, 3)
        assertEquals("Clubs", c1.suitName)
    }

    @Test
    fun testSuit2IsHearts() {
        val c1 = Card(1, 2)
        assertEquals("Hearts", c1.suitName)
    }

    @Test
    fun testSuit1IsSpades() {
        val c1 = Card(1, 1)
        assertEquals("Spades", c1.suitName)
    }

    @Test
    fun testACardWithValue13IsAKing() {
        val c1 = Card(13, 1)
        assertEquals("King", c1.valueName)
    }

    @Test
    fun testACardWithValue12IsAQueen() {
        val c1 = Card(12, 1)
        assertEquals("Queen", c1.valueName)
    }


    @Test
    fun testACardWithValue11IsAJack() {
        val c1 = Card(11, 1)
        assertEquals("Jack", c1.valueName)
    }

    @Test
    fun testACardWithValue1IsAnAce() {
        val c1 = Card(1, 1)
        assertEquals("Ace", c1.valueName)
    }

    @Test
    fun testPrettyPrintOfAceOfSpades() {
        val c1 = Card(1, 1)
        assertEquals("Ace of Spades", c1.name)
    }


    @Test
    fun testAnAceIsWorthOnePoint() {
        val c1 = Card(1, 1)
        assertEquals(1, c1.points)
    }


    @Test
    fun testCanCreateACardWithSuitAndValue() {
        val c1 = Card(1, 1)
        assertEquals(1, c1.value)

    }

}