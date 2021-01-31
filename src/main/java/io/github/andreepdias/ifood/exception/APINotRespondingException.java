package io.github.andreepdias.ifood.exception;

public class APINotRespondingException extends RuntimeException {

    public APINotRespondingException(String message) {
        super(message);
    }
}
