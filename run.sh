#!/bin/bash

echo "Application version is $1"

./gradlew clean createJar

java -jar ./build/libs/core-java-gradle-integration-all-$1.jar