package edu.kotlin.toplevel

import edu.kotlin.inheritance.CompanyCommunications as Comm
import edu.kotlin.inheritance.topLevel as tp
import edu.kotlin.inheritance.DepartMent.ACCOUNTING

fun main(args: Array<String>) {
    tp("Hello from another file ")
    println(Comm.getCopyrightLine())
    println(ACCOUNTING.getDeptInfo())
}