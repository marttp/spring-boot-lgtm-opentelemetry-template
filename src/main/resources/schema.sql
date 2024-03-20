CREATE TABLE IF NOT EXISTS coupon
(
    id          BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    title       VARCHAR(255)     NOT NULL,
    description TEXT,
    start_date  TIMESTAMP        NOT NULL,
    end_date    TIMESTAMP        NOT NULL,
    operator    VARCHAR(10),
    value       DOUBLE PRECISION NOT NULL
);