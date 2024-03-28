package edu.iu.cgsegal.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    @Test
    void _45IsNotPrime() {
        PrimesService primesService = new PrimesService();
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _2IsPrime() {
        PrimesService primesService = new PrimesService();
        int n = 2;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }

}