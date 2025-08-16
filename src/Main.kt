//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val samsungPhone = Samsung()
    val s25Ultra = S25Ultra()
    val s24Ultra = S24Ultra()

//    samsungPhone.boot()
//    samsungPhone.bootSamsung()

//    s25Ultra.bootSamsung()

    s24Ultra.boot()
    s24Ultra.call()
    s24Ultra.getSpecs()
}