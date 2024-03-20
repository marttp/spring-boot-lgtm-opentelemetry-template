package dev.tpcoder.coupon.exception;

public class FakeInternalException extends RuntimeException {
    public FakeInternalException() {
        super();
    }

    public FakeInternalException(String message) {
        super(message);
    }
}
