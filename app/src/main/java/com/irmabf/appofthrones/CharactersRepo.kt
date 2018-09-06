package com.irmabf.appofthrones

object CharactersRepo {
    // Create the variable characters and initialize as an empty mutable list of characters
    var characters: MutableList<Character> = mutableListOf()
    //Function which returns a list of dummy characters
    private fun dummyCharacters(): MutableList<Character> {
        //1. Create the variable dummies as an empty mutable list
        val dummies: MutableList<Character> = mutableListOf()
        //2. Iterate 10 times and in each one save a dummy character
        for (index in 1..10) {
            val character : Character = Character(
                    name = "Personaje $index",
                    title = "Titulo $index",
                    born = "Nació en $index",
                    actor = "Actor $index",
                    quote = "Frase $index",
                    father = "Padre $index",
                    mother = "Madre $index",
                    spouse = "Espos@ $index",
                    house = House(
                            name = "Casa $index",
                            region = "Region $index",
                            words = "Lema $index"
                    )
            )
            //3. Add each index to de dummies mutableList
            dummies.add(character)
        }
        //4. Return dummies
        return  dummies
    }
}