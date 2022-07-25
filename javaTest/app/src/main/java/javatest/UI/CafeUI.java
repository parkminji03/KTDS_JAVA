package javatest.UI;

import java.util.Scanner;


import javatest.service.CafeService;

public class CafeUI {
    private Scanner scanner;
    private CafeService service;
    public CafeUI(Scanner scanner, CafeService service) {
        this.scanner = scanner;
        this.service = service;
    }       
    public void displaywithPosition() {
        System.out.println("위도 :");
        double lat = scanner.nextDouble();

        System.out.println("경도 : ");
        double lng = scanner.nextDouble();

        service.getByposition(lat, lng).forEach(s -> System.out.println(s));
    }
}
