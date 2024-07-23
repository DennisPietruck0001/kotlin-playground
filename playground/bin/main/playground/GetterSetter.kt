package playground

open class SuperClass(
        val myPublicAttribute: String,
        protected val myProtectedAttribute: String,
        private val myPrivateAttribute: String,
)


class SubClass(myPublicAttribute: String, myProtectedAttribute: String, myPrivateAttribute: String) :
        SuperClass(myPublicAttribute, myProtectedAttribute, myPrivateAttribute) {
    fun asString(): String {
        // private attribute ist nur in der oberklasse benutzbar
        // protected kann auch in der erbenden Klasse benutzt werden
        return this.myPublicAttribute + this.myProtectedAttribute //+ this.myPrivateAttribute
    }
}

fun main() {
    val subClass = SubClass("public", "protected", "private")
    print(subClass.myPublicAttribute)
   // print(subClass.myProtectedAttribute) // geht nicht, weil protected
   // print(subClass.myPrivateAttribute) // geht nicht, weil privtae
    print(subClass.asString())
}