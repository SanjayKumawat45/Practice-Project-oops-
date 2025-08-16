class S24Ultra: ISamsungPhone {
    override var ram : Int?= 12
    override var storage : Int?= 512


    override fun boot() {
        println("S24 Ultra is booting...")
    }
}