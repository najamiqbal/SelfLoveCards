package softsolstudio.apps.selflovecards.activities;

public enum Align {


    LEFT(1),
    RIGHT(-1),
    TOP(1),
    BOTTOM(-1);

    int layoutDirection;

    Align(int sign) {
        this.layoutDirection = sign;
    }
}
