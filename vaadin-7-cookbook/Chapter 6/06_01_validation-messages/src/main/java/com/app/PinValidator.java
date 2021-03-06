package com.app;

import com.vaadin.data.Validator;

/**
 * @author Ondrej Kvasnovsky
 */
public class PinValidator implements Validator {

    @Override
    public void validate(Object value) throws InvalidValueException {
        String text = (String) value;
        if (text == null || "".equals(text.trim())) {
            return;
        }
        if (!text.matches("\\d*")) {
            throw new InvalidValueException("Just numbers allowed");
        }
        if (text.length() < 4) {
            throw new InvalidValueException("Too few numbers");
        } else if (text.length() > 4) {
            throw new InvalidValueException("Too many numbers");
        }
    }
}