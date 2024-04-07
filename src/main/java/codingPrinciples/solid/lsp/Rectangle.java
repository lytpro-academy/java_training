package codingPrinciples.solid.lsp;

/**
Liskov Substitution Principle (LSP) Example
This program demonstrates LSP by showing how subclasses can be substituted for their superclass.
Superclass representing a rectangle
*/
class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
