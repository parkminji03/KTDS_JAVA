package javatest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javatest.domain.Cafe;

public class CafeService {

    private List<Cafe> cafeList;

    public CafeService() {
        cafeList = new ArrayList<>();

        
        cafeList.add(new Cafe(1L,"김재완",10.0,10.0));
        cafeList.add(new Cafe(1L,"김재완1",20,10));
        cafeList.add(new Cafe(1L,"김재완2",30,10));
        cafeList.add(new Cafe(1L,"김재완3",40,10));
        cafeList.add(new Cafe(1L,"김재완4",50,10));
    }
    public List<Cafe> getByposition(double lat, double lng) {
        Collections.sort(cafeList,(c1,c2) ->{
            double dis1 = Math.sqrt(Math.pow(lat - c1.getLat(), 2) + Math.pow(lng - c1.getLng(), 2));
            double dis2 = Math.sqrt(Math.pow(lat - c2.getLat(), 2) + Math.pow(lng - c2.getLng(), 2));

            return dis1 > dis2 ? 1: -1;

        });
        return cafeList;
    }
}
