open class Phone(val brand : String){
     protected var ram: Int? = null
        get() = field
        set(value) {
            field = value
        }
    protected var storage: Int? = null
        get() = field
        set(value) {
            field = value
        }

//    protected fun boot(bootLoader : (() -> Unit)? = null){
//        println("$brand phone with RAM:$ram and storage:$storage is booting up")
//
//        if(bootLoader == null){
//            return
//        }
//
//        bootLoader()
//    }


    protected open fun boot(){
        println("default phone booting.....")
    }

    protected fun boot(bootLoader : (() -> Unit)){
        println("$brand phone with RAM:$ram and storage:$storage is booting up")

        bootLoader()
    }
}