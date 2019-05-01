package corountines

import kotlinx.coroutines.*
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main(args: Array<String>) {

//    exampleBlocking()
//    exampleWithSimpleThread()
//    exampleBlockingDispatcher()
//    exampleLaunchGlobal()
//    exampleLaunchGlobalWaiting()
//    exampleLaunchCoroutineScope()
//    exampleAsyncAwait()
    exampleWithContext()
}

fun exampleWithSimpleThread(){
    println("one")
//    printlnDelayedThread("two")
    printlnDelayed("two")
    println("three")
}

fun printlnDelayedThread(message : String){
    Thread.sleep(1000)
    println(message)
}

fun printlnDelayed(message: String) {
    // Complex calculation
    runBlocking {
        delay(1000)
    }
    println(message)
}

fun exampleBlocking() = runBlocking {
    println("one")
    printlnDelayed("two")
    println("three")
}

// Running on another thread but still blocking the corountines.main thread
fun exampleBlockingDispatcher(){
    runBlocking(Dispatchers.Default) {
        println("one - from thread ${Thread.currentThread().name}")
        printlnDelayed("two - from thread ${Thread.currentThread().name}")
    }
    // Outside of runBlocking to show that it's running in the blocked corountines.main thread
    println("three - from thread ${Thread.currentThread().name}")
    // It still runs only after the runBlocking is fully executed.
}

// Not Blocking our code
fun exampleLaunchGlobal() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")

    GlobalScope.launch {
        printlnDelayed("two - from thread ${Thread.currentThread().name}")
    }

    println("three - from thread ${Thread.currentThread().name}")
    delay(3000)
}

fun exampleLaunchGlobalWaiting() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")

    val job = GlobalScope.launch {
        printlnDelayed("two - from thread ${Thread.currentThread().name}")
    }

    println("three - from thread ${Thread.currentThread().name}")
    job.join()

    println("four - from thread ${Thread.currentThread().name}")
}

fun exampleLaunchCoroutineScope() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")

    val customDispatcher = Executors.newFixedThreadPool(2).asCoroutineDispatcher()

    launch(customDispatcher) {
        printlnDelayed("two - from thread ${Thread.currentThread().name}")
    }

    println("three - from thread ${Thread.currentThread().name}")

    (customDispatcher.executor as ExecutorService).shutdown()
}

fun exampleAsyncAwait() = runBlocking {
    println("Normal Execution - before")

    val startTime = System.currentTimeMillis()

    val deferred1 = async {
        println("calculateHardThings - from thread ${Thread.currentThread().name}")
        calculateHardThings(10) }
    val deferred2 = async { calculateHardThings(20) }
    val deferred3 = async { calculateHardThings(30) }

    println("Normal Execution - middle")

    launch(Dispatchers.Default) {
        val sum = deferred1.await() + deferred2.await() + deferred3.await()
        println("async/await result = $sum")

        printlnDelayed("two - from thread ${Thread.currentThread().name}")

        val endTime = System.currentTimeMillis()
        println("Time taken: ${endTime - startTime}")
    }

    println("Normal Execution - after")

}

fun exampleWithContext() = runBlocking {
    println("Normal Execution - before")
    val startTime = System.currentTimeMillis()

    val result1 = withContext(Dispatchers.Default) { calculateHardThings(10) }  // 10 * 10 = 100
    val result2 = withContext(Dispatchers.Default) { calculateHardThings(result1) }      // 100 * 10 = 1000
    val result3 = withContext(Dispatchers.Default) { calculateHardThings(result2) }      // 1000 * 10 = 100_00

    val sum = result1 + result2 + result3       // 100 + 1000 + 100_00 = 111000
    println("async/await result = $sum")

    println("Normal Execution - after")

    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime}")
}

suspend fun calculateHardThings(startNum: Int): Int {
    delay(1000)
    return startNum * 10
}