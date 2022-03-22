package br.com.rafael.enumeration.enum_;

//External enum
//The constructor for an enum type must be package-private or private access

public enum Type {
    LEVEL_ONE(1), LEVEL_TWO(2), LEVEL_THREE(3);

    final int code;

    Type(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
