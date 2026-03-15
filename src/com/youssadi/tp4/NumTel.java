package com.youssadi.tp4;

enum Code {
    PORTABLE, POSTE_FIXE_PROFESSIONNEL, POSTE_FIXE_DOMICILE, FAX
}
public class NumTel {
    private int num;
    private Code code;
    public NumTel(int num, Code code) {
        this.num = num;
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
