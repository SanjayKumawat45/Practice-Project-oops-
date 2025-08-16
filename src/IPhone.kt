interface IPhone {
    var ram: Int?
    var storage: Int?

    fun boot(){
        println("Any phone is booting...")
    }

    fun call(){
        println("Any phone is calling...")
    }

    fun getSpecs(){
        println("RAM : $ram")
        println("Storage : $storage")
    }
}