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
public class GeneratorTable implements Serializable {

    private static final long serialVersionUID=1L;

    private String id1;

    private String id2;

    private String id3;


    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public String getId3() {
        return id3;
    }

    public void setId3(String id3) {
        this.id3 = id3;
    }

    @Override
    public String toString() {
        return "GeneratorTable{" +
        "id1=" + id1 +
        ", id2=" + id2 +
        ", id3=" + id3 +
        "}";
    }
}
