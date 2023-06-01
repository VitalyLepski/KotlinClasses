fun main(args: Array<String>) {
    val arrayOfAnimal = arrayOf(
        Dog("Мясо", "Краснорск"),
        Cat("Молоко", "Москва"),
        Horse("Трава", "Митино")
    )

    val veterinarian = Veterinarian()

    for(animal in arrayOfAnimal) {
        veterinarian.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
    }
}