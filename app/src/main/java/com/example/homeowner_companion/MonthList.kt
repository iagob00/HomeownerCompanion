package com.example.homeowner_companion

class MonthList {
    var listId: Long = -1
    var currMonth : Int = -1
    var currYear : Int = 2023
    var expenseList : MutableList<Expense> = mutableListOf()
    enum class ETYPE { MONTHLY, UNIQUE }

    data class Expense( var value: Int, var name:String, var type:Enum<ETYPE>, var savedFile:String, var isPaid:Boolean)

}