package com.sachin.functionality;

// Functional Interface should have only one abstract method
@FunctionalInterface
public interface EntityProcessor<T> {
    void process(T t); //  Only One Abstract Method (Correct)

    //  Do NOT add any extra abstract methods here!
}

