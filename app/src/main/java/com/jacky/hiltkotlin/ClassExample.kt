package com.jacky.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(
   @FirstImplementor private val myInterfaceImplementor: MyInterface,
    private val gson: Gson,
   @SecondIpmlementor private val mySecondInterfaceImplementor: MyInterface,
) {

    fun myFunction(): String {
        return "Working : ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction() : String {
        return "Working : ${mySecondInterfaceImplementor.myPrintFunction()}"
    }

    fun printFunction(string: String) {
        println(string)
    }
}