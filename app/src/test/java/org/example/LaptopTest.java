package org.example;

import org.junit.jupiter.api.Test;

import utils.classes.Laptop;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
    @Test
    void testLaptopDescription() {
        Laptop laptop = new Laptop("Dell XPS", 1500.0);
        assertEquals("Laptop: Dell XPS, Price: $1500.0", laptop.getDescription());
    }

    @Test
    void testLaptopGetName() {
        Laptop laptop = new Laptop("Dell XPS", 1500.0);
        assertEquals("Dell XPS", laptop.getName());
    }

    @Test
    void testLaptopGetPrice() {
        Laptop laptop = new Laptop("Dell XPS", 1500.0);
        assertEquals(1500.0, laptop.getPrice());
    }
}
