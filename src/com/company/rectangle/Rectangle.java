package com.company.rectangle;

public class Rectangle {
    int height;
    int width;

    Rectangle() {
        height = 3;
        width = 4;
    }

    Rectangle(int newHeight, int newWidth) {
        height = newHeight;
        width = newWidth;
    }

    double getArea() {
        return (width + height) / 2;
    }

    int getPerimeter() {
        return width * height;
    }

    /*
     *void setHeight(int height){
     *   this.height=height;
     *}
     *void setWidth(int width){
     *   this.width= width;
     *}
     * có phải khi tạo constructor với 2 parameter sẽ phải dùng đến set thì mới tạo được giá trị be ngoài?
     *
     */
    public String display() {
        return "Rectangle{" + "Width: " + width + ",height: " + height + "}";
    }
}