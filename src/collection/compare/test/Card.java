package collection.compare.test;

public enum Card{
    SPADE('♠', 1), HEART('♥', 2), DIAMOND('◆', 3), CLOVER('♣', 4);

    private final Character c;
    private final int v;

    Card(Character c, int v) {
        this.c = c;
        this.v = v;
    }

    public Character getC() {
        return c;
    }

    public int getV() {
        return v;
    }
}
