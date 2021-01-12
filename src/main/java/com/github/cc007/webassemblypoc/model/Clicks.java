package com.github.cc007.webassemblypoc.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Clicks {

    private BigInteger count = BigInteger.valueOf(0);

    public void increment(){
        count = count.add(BigInteger.ONE);
    }
}
