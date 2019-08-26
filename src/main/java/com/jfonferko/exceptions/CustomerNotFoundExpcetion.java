package com.jfonferko.exceptions;

public class CustomerNotFoundExpcetion extends NotFoundException {
    private static final String LOG_MESSAGE = "Customer with id: %d not found.";

    public CustomerNotFoundExpcetion(final Long id) {
        super(String.format(LOG_MESSAGE, id));
    }
}
