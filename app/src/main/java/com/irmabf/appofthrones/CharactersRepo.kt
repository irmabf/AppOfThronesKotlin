package com.irmabf.appofthrones

object CharactersRepo {
    // Create the variable characters and initialize as an empty mutable list of characters
    var characters: MutableList<Character> = mutableListOf()

    //Function which returns a list of dummy characters
    private fun dummyCharacters(): MutableList<Character> {
        //1. Create the variable dummies as mutable list and a range
        // as an array of integers from 1 to 10
        //.2 We map through each element inside the range applying a lambda function which
        //receives and index variable - the int in the range -, and returns a Character
        val dummies: MutableList<Character> = (1..10).map { index ->
            Character(
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
        }.toMutableList()

        //4. Return dummies
        return dummies
    }


}