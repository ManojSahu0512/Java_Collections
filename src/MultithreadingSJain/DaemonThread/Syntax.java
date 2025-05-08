package MultithreadingSJain.DaemonThread;
/*
Daemon Threads in Java
Daemon threads are special threads in Java that run in the background and provide support to non-daemon threads (user threads). The key characteristic of daemon threads is that the JVM doesn't wait for them to complete before exiting - they terminate automatically when all user threads finish execution.
*

Key Characteristics of Daemon Threads
Automatic Termination: Daemon threads are automatically terminated when all user threads complete

Low Priority: Typically used for background tasks like garbage collection

Cannot Prevent JVM Exit: Won't keep the JVM running if only daemon threads remain

Inheritance: A thread inherits its daemon status from its parent thread

Important Considerations
Set Before Start: Must call setDaemon(true) before starting the thread

Throws IllegalThreadStateException if called after thread starts

Main Thread: The main thread is always a user thread (non-daemon)

Thread Creation: Child threads inherit daemon status from parent

Finally Blocks: Daemon thread's finally blocks may not execute if JVM exits

Common Daemon Threads:

Garbage Collector (GC) thread

Signal dispatcher thread

Reference handler thread

When to Use Daemon Threads
Background tasks that shouldn't prevent JVM shutdown

Periodic cleanup tasks

Monitoring or logging services

Any non-critical background operation*/
public class Syntax {
}
