# Spring Boot Timer Ninja Maven example

This is an example of a Spring Boot project with maven build, integrated
with the [Timer Ninja library](https://github.com/ThangLeQuoc/timer-ninja) to measure code execution

## How to use
Clone and build the project

```bash
git clone https://github.com/ThangLeQuoc/timer-ninja-examples.git
cd timer-ninja-examples/timerninja-todolist-maven
mvn clean install
mvn spring-boot:run
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
2023-04-07T14:19:35.778+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : Timer Ninja trace context id: 463f1ba3-3610-4edc-b24c-2e6ff47a9ec7
2023-04-07T14:19:35.785+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : Trace timestamp: 2023-04-07T07:19:34.956Z
2023-04-07T14:19:35.785+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : {===== Start of trace context id: 463f1ba3-3610-4edc-b24c-2e6ff47a9ec7 =====}
2023-04-07T14:19:35.786+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : public User createNewUser(User user) - 819 ms
2023-04-07T14:19:35.786+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- private void validateUserAlreadyExist(String username) - 506000 µs
2023-04-07T14:19:35.787+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :     |-- public User getUserByName(String username) - 0 ms
2023-04-07T14:19:35.787+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- private static boolean isValidUserName(String username) - 3 ms
2023-04-07T14:19:35.787+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          :   |-- public User createUser(User user) - 305 ms
2023-04-07T14:19:35.792+07:00  INFO 28570 --- [nio-8080-exec-2] c.g.t.timerninja.TimerNinjaUtil          : {====== End of trace context id: 463f1ba3-3610-4edc-b24c-2e6ff47a9ec7 ======}

```
Feel free to toggle the tracker annotation `@TimerNinjaTracker` inside the project to see the effect
