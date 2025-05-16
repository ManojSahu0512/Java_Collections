package ShrayansJain.MultithreadingSJain.ThreadPriorityButNotGuranteed;
/*
* Thread priority is a mechanism in Java that allows you to hint to the thread scheduler about which threads are more important and should be given preference in execution. However, it's important to note that thread priorities are just hints - the actual behavior depends on the underlying operating system's thread scheduler.
*
*
* Thread Priority Basics
In Java, each thread has a priority value ranging from:

Thread.MIN_PRIORITY (1)

Thread.NORM_PRIORITY (5 - default)

Thread.MAX_PRIORITY (10)*/

/*
* Important Considerations
Platform Dependency: Thread priorities may behave differently across operating systems.

Windows has 7 priority levels

Linux often ignores Java thread priorities

Solaris has many more priority levels

Priority Inversion: A higher-priority thread can be blocked by a lower-priority thread holding a lock.

Relative Priorities: Only use priorities to indicate relative importance, not absolute execution order.

Default Priority: Main thread has NORM_PRIORITY (5), and child threads inherit their parent's priority.

Best Practices
Avoid relying too much on priorities for program correctness.

Use synchronization for critical sections rather than priorities.

Consider thread pools (Executor framework) for better thread management.

Document priority usage when you do use it.

*/
public class Syntax {
}
