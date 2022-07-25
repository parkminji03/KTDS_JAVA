package javatest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CafeServiceTest {
    
    @Test
    public void test1() {
        assertEquals(1, 1);

        System.out.println("TEST1........");

        double lat = 5L;
        double lng = 5L;

        CafeService service = new CafeService();

        service.getByposition(lat, lng).forEach(s -> System.out.println(s));

    }
}
