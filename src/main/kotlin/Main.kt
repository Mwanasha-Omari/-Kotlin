fun main(){
    println(isName("Mwanasha"))
    var student =User(50.1,20,"Ali","Ada")
    println(student.weight)
    println(student.age)
    println(student.name)
    println(student.lab)
    var person =Pupils(20,"a","january","Kenyan")
    println( person.citizen)
    println(person.month)
    println(person.letters)
    println(person.numbers)

    var Sign= Apps("Ali","Omari","aliomari@gmail.com","07555555","124567")
    println(Sign.password)
    println(Sign.email)
}

fun isName(name:String):Boolean{
    var x= "Mwanasha"
    if(x=="Mwanasha"){
        return (true)
    }
    else{
        return (false)}

}

data class User (var weight:Double,var age:Int,var name:String,var lab:String)


class Pupils( var numbers:Int,var letters:String,var month:String ,var citizen:String)


data class Apps (var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)



