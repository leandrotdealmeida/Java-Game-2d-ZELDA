package com.naturalgames.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.naturalgames.main.Game;
import com.naturalgames.world.Camera;

public class Entity {

	public static BufferedImage LIFEPACK_EN = Game.spritesheet.getSprite(6 * 16, 0, 16, 16);
	public static BufferedImage WEAPON_EN = Game.spritesheet.getSprite(7 * 16, 0, 16, 16);
	public static BufferedImage BULLET_EN = Game.spritesheet.getSprite(6 * 16, 16, 16, 16);
	public static BufferedImage ENEMY_EN = Game.spritesheet.getSprite(7 * 16, 16, 16, 16);

	protected double x;
	protected double y;
	protected int width;
	protected int height;

	private BufferedImage sprite;

	public Entity(double x, double y, int width, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	public int getX() {
		return (int) x;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public int getY() {
		return (int) y;
	}

	public void setY(int newY) {
		this.y = newY;
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

	public void tick() {

	}

	public void render(Graphics g) {
		g.drawImage(sprite, this.getX() - Camera.x, this.getY() - Camera .y, null);
	}

}
