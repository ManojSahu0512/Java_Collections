package MultithreadingSJain.ThreadJoining;
/*
Thread joining is a mechanism in Java that allows one thread to wait for the completion of another thread. The join() method is used for this purpose.

* When you call join() on a Thread object, the calling thread will wait until the thread on which join() was called terminates.
Join Method Variations
join(): Waits indefinitely for the thread to die

join(long millis): Waits at most millis milliseconds for the thread to die

join(long millis, int nanos): Waits at most millis milliseconds plus nanos nanoseconds for the thread to die

Practical Use Cases
Waiting for initialization: Main thread waits for initialization thread to complete

Parallel task completion: Combine results from multiple threads

Resource cleanup: Ensure resources are released before proceeding
*/


public class Syntax {
}
