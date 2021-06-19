package com.bupt.cad.datadic.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-06-19
 */
public class TestTable implements Serializable {

    private static final long serialVersionUID=1L;

    private String testCol1;

    private String testCol2;


    public String getTestCol1() {
        return testCol1;
    }

    public void setTestCol1(String testCol1) {
        this.testCol1 = testCol1;
    }

    public String getTestCol2() {
        return testCol2;
    }

    public void setTestCol2(String testCol2) {
        this.testCol2 = testCol2;
    }

    @Override
    public String toString() {
        return "TestTable{" +
        "testCol1=" + testCol1 +
        ", testCol2=" + testCol2 +
        "}";
    }
}
