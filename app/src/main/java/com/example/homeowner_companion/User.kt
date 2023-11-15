package com.example.homeowner_companion

object User {

    var name:String = ""

    val expenses: MutableList<String> = mutableListOf()

    fun addExpense(expense : String){
        expenses.add(expense)
    }
    fun removeExpense(expense: String){
        expenses.remove(expense)
    }

    fun setName(name:String){
        User.name = name
    }

}