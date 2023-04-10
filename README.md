# Timer Ninja project examples
Example projects integrated with [Timer Ninja library](https://github.com/ThangLeQuoc/timer-ninja) for your setup reference, please go into each directory to find the instruction how to run

At the end of the guide, you will be able to see the execution time it took for every method annotated with `@TimerNinjaTracker` annotation

```shell
2023-04-07T14:24:17.158+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : Timer Ninja trace context id: f98a88d7-78ea-4a44-9fef-b5756ae10ba8
2023-04-07T14:24:17.161+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : Trace timestamp: 2023-04-07T07:24:16.335Z
2023-04-07T14:24:17.161+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : {===== Start of trace context id: f98a88d7-78ea-4a44-9fef-b5756ae10ba8 =====}
2023-04-07T14:24:17.165+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : public User createNewUser(User user) - 820 ms
2023-04-07T14:24:17.165+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- private void validateUserAlreadyExist(String username) - 507000 µs
2023-04-07T14:24:17.165+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :     |-- public User getUserByName(String username) - 0 ms
2023-04-07T14:24:17.165+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- private static boolean isValidUserName(String username) - 9 ms
2023-04-07T14:24:17.165+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- public User createUser(User user) - 302 ms
2023-04-07T14:24:17.166+07:00  INFO 28903 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : {====== End of trace context id: f98a88d7-78ea-4a44-9fef-b5756ae10ba8 ======}
```

## List of example
[Spring Boot with Gradle build](https://github.com/ThangLeQuoc/timer-ninja-examples/tree/main/timerninja-todolist-gradle)  
[Spring Boot with Maven build](https://github.com/ThangLeQuoc/timer-ninja-examples/tree/main/timerninja-todolist-maven)  
[Plain Java with Gradle build](https://github.com/ThangLeQuoc/timer-ninja-examples/tree/main/timer-ninja-plain-java-gradle)  
