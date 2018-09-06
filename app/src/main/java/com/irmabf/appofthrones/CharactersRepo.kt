package com.irmabf.appofthrones

object CharactersRepo {
    // Create the variable characters and initialize as an empty mutable list of characters
    val characters: MutableList<Character> = mutableListOf()

    //Function which returns a list of dummy characters
    private fun dummyCharacters(): MutableList<Character> {
        return (1..10).map {
            intToCharacter(it)
        }.toMutableList()
    }

    private  fun intToCharacter(int: Int): Character {
        return Character(
                name = "Personaje $int",
                title = "Titulo $int",
                born = "Nació en $int",
                actor = "Actor $int",
                quote = "Frase $int",
                father = "Padre $int",
                mother = "Madre $int",
                spouse = "Espos@ $int",
                house = House(
                        name = "Casa $int",
                        region = "Region $int",
                        words = "Lema $int"
                )
        )
    }
}