package javatest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Cafe {
    private Long cno;
    private String cname;
    private double lat, lng;
}
