package com.programming.uit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bikini implements Outfit {
    // 2 phưng thức cùng tên cùng param và nó  2 class khac nahu
    @Override
    public String wear(int a) {

        return "";

    }
}