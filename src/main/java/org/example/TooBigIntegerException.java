package org.example;

import java.io.IOException;

public class TooBigIntegerException extends IOException {
    public TooBigIntegerException(String message) {
        super(message);
    }
}
