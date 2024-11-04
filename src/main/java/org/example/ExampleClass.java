package org.example;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExampleClass {
    public void doSomething() {
//        log.trace("This is a TRACE message");
//        log.debug("This is a DEBUG message");
        log.info("This is an INFO message");
//        log.warn("This is a WARN message");
//        log.error("This is an ERROR message");
    }

}
