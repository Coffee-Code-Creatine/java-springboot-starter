package com.coffeecodecreatine.education.demo4.item;

class ItemNotFoundException extends RuntimeException {

    ItemNotFoundException(Long id) {
        super("Could not find item " + id);
    }
}