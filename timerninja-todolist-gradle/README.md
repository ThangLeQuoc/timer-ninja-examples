# Spring Boot Timer Ninja Gradle example

This is an example of a Spring Boot project with gradle build, integrated
with the [Timer Ninja library](https://github.com/ThangLeQuoc/timer-ninja) to measure code execution

## How to use
Clone and build the project

```bash
git clone https://github.com/ThangLeQuoc/timer-ninja-examples.git
cd timer-ninja-examples/timerninja-todolist-gradle
./gradlew clean build
./gradlew bootRun
```

The project should start on `localhost:8080`.
Submit the `POST` request with this endpoint `localhost:8080/users`

Request body:
```json
{
    "username": "maria"
}
```

Then observe the log output, you should see the following
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
Feel free to toggle the tracker annotation `@TimerNinjaTracker` inside the project to see the effect
