package javatest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class User {
    private String uid;
    private String upw;
    private String uname;
    
}
