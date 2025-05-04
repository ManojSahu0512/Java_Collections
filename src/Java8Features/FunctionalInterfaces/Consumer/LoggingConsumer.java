package Java8Features.FunctionalInterfaces.Consumer;

import java.util.function.Consumer;

public class LoggingConsumer {
    public static void main(String[] args) {
        Consumer<String> logger=message -> System.out.println("[INFO]:"+message);
        logger.accept("Application Started.");
    }
}
