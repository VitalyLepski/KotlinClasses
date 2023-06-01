abstract class Animal {
    abstract val food : String
    abstract val location : String
    abstract val animalType: String
    abstract fun makeNoise()
    abstract fun eat()
    abstract fun sleep()
}

class Dog (food: String, location: String)  : Animal(){
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Собака"
    override fun makeNoise(){
        println("Гаф")
    }
    override fun eat(){
        println("Ест")
    }
    override fun sleep(){
        println("Спит")
    }
    val feature: String = "Косточка"
}

class Cat (food: String, location: String)  : Animal(){
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Кошка"
    override fun makeNoise(){
        println("Мяу")
    }
    override fun eat(){
        println("Ест")
    }
    override fun sleep(){
        println("Спит")
    }
    val feature: String = "Клубок ниток"
}

class Horse (food: String, location: String)  : Animal(){
    override val food: String = food
    override val location: String = location
    override val animalType: String = "Лошадь"
    override fun makeNoise(){
        println("Ржёт")
    }
    override fun eat(){
        println("Ест")
    }
    override fun sleep(){
        println("Спит")
    }
    val feature: String = "Подкова"
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("\nНа приёме: ${animal.animalType}. \nКорм: ${animal.food}.")
        println("Метонахождение: ${animal.location}.")
    }
}

