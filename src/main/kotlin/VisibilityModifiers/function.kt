package VisibilityModifiers

public fun sum(a:Int,b:Int ) = a+b

private fun diff(a:Int,b:Int) = a-b

 // protected fun product(a:Int,b:Int) = a*b  --> it will throw an error as a top level function
// cannot be declared protected

internal fun division(a:Int,b:Int) = a/b