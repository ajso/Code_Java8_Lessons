package sample.code.lessons.Enums;

public enum Cereals {
    CAPATAIN_CRUNCH(76, 2.8),
    FROOT_LOOPS(56, 5.1),
    REESE_PUFFS(98, 2.3),
    COCOA_PUFFS(80, 4.2);

    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
