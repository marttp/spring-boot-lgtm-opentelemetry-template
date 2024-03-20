#!/bin/bash

set -euo pipefail

./gradlew clean build

export OTEL_RESOURCE_ATTRIBUTES="service.name=coupon,service.instance.id=localhost:8080"
export OTEL_LOGS_EXPORTER="otlp"

java -Dotel.metric.export.interval=500 -Dotel.bsp.schedule.delay=500 -javaagent:"./build/agent/opentelemetry-javaagent.jar" -jar ./build/libs/coupon-0.0.1-SNAPSHOT.jar
