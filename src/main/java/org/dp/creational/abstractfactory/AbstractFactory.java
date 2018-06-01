package org.dp.creational.abstractfactory;

import org.dp.creational.Color;
import org.dp.creational.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}