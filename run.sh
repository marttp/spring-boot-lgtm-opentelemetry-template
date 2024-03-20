#!/bin/bash

set -euo pipefail

./gradlew clean build

version=v2.1.0
jar=opentelemetry-javaagent-${version}.jar
if [[ ! -f ./${jar} ]] ; then
    curl -sL https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.0.0/opentelemetry-javaagent.jar -o ${jar}
fi
export OTEL_RESOURCE_ATTRIBUTES="service.name=coupon,service.instance.id=localhost:8080"
export OTEL_LOGS_EXPORTER="otlp"
java -Dotel.metric.export.interval=500 -Dotel.bsp.schedule.delay=500 -javaagent:${jar} -jar ./build/libs/coupon-0.0.1-SNAPSHOT.jar
