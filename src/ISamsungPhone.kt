interface ISamsungPhone: IPhone {
    override fun boot() {
        println("Samsung Phone is booting")
    }


}