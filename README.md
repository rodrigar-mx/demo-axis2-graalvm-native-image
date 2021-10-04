## Description

Sample Axis2 demo with graalvm native image.

## Usage

### Prerequisites

* download graalvm latest version and set JAVA_HOME and PATH env variables appropriately

### Run on JVM

1. `./gradlew run`

### Native image run

1. Run tracing agent: `./gradlew -Pagent run`
2. Build native image: `./gradlew  nativeCompile`
3. Run native image : `./build/native/nativeCompile/server`
