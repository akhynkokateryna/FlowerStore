package flower;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), PINK("#FFC0CB"), WHITE("FFFAFA");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}