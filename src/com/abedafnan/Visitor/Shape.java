package com.abedafnan.Visitor;

public interface Shape {

	public void draw();
	public void accept(IVisitor visitor);
}
