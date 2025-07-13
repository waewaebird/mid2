package collection.compare.test;

public enum Card{
    SPADE('♠'),
    HEART('♥'),
    DIAMOND('◆'),
    CLOVER('♣');

    private final Character c;

    Card(Character c) {
        this.c = c;

    }

    public Character getC() {
        return c;
    }
}
