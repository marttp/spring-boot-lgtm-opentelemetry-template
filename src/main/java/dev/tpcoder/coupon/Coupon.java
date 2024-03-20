package dev.tpcoder.coupon;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Coupon(@Id Long id, String title, String description, LocalDateTime startDate, LocalDateTime endDate,
                     Operator operator, double value) {
}
