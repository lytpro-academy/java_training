package codingPrinciples.solid.lsp;

/**
 * Subclass representing a square
 * */
class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // Overriding setWidth and setHeight to maintain the square property
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

