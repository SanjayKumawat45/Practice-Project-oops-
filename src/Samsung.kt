const val SAMSUNG_BRAND = "SAMSUNG"

open class Samsung: Phone(SAMSUNG_BRAND) {
    fun bootSamsung(){
        super.boot{
            println("$SAMSUNG_BRAND logo")

        }
    }

    public override fun boot(){
        println("Samsung booting...")
    }
}
