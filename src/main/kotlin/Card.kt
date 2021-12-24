data class Card(val rank: Int, val suit: Suit) {
    init {
        require(rank in 2..14)
    }

    override fun toString(): String {
        val rawRank = when(rank) {
            2 -> '2'
            3 -> '3'
            4 -> '4'
            5 -> '5'
            6 -> '6'
            7 -> '7'
            8 -> '8'
            9 -> '9'
            10 -> 'T'
            11 -> 'J'
            12 -> 'Q'
            13 -> 'K'
            14 -> 'A'
            else -> throw IllegalStateException()
        }

        val rawSuit = when(suit) {
            Suit.CLUBS -> 'c'
            Suit.SPADES -> 's'
            Suit.HEARTS -> 'h'
            Suit.DIAMOND -> 'd'
        }

        return String.format("%c%c", rawRank, rawSuit)
    }

    companion object {
        fun fromString(card:String): Card {
            require(card.length == 2)
            val rawRank = card[0]
            val rawSuit = card[1]

            val rank = when(rawRank) {
                '2' -> 2
                '3' -> 3
                '4' -> 4
                '5' -> 5
                '6' -> 6
                '7' -> 7
                '8' -> 8
                '9' -> 9
                'T' -> 10
                'J' -> 11
                'Q' -> 12
                'K' -> 13
                'A' -> 14
                else -> throw IllegalStateException()
            }
            val suit = when(rawSuit) {
                'c' -> Suit.CLUBS
                's' -> Suit.SPADES
                'h' -> Suit.HEARTS
                'd' -> Suit.DIAMOND
                else -> throw IllegalStateException()
            }

            return Card(rank, suit)
        }
    }
}