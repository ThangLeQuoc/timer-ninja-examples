# Timer Ninja Gradle Java example

This is an example of a plain Java Gradle application, integrated
with the [Timer Ninja library](https://github.com/ThangLeQuoc/timer-ninja) to measure code execution

## How to use
Clone and build the project

```bash
git clone https://github.com/ThangLeQuoc/timer-ninja-examples.git
cd timer-ninja-examples/timer-ninja-plain-java-gradle
./gradlew clean build
```

Run the main application in `Main.java`, and see the result

```shell
Hello world!
Timer Ninja trace context id: 5eda1f7b-a2a7-4288-a309-591951c1f8b9
Trace timestamp: 2023-04-10T02:41:08.256Z
{===== Start of trace context id: 5eda1f7b-a2a7-4288-a309-591951c1f8b9 =====}
public boolean isValidParenthesis(String parenthesis) - 2 ms
  |-- private boolean isClosingParenthesis(char c) - 1000 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private char getCorrespondingOpenParenthesis(char c) - 1000 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private char getCorrespondingOpenParenthesis(char c) - 0 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private char getCorrespondingOpenParenthesis(char c) - 0 µs
  |-- private boolean isClosingParenthesis(char c) - 0 µs
  |-- private char getCorrespondingOpenParenthesis(char c) - 0 µs
{====== End of trace context id: 5eda1f7b-a2a7-4288-a309-591951c1f8b9 ======}
```
