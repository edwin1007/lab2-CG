/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosCG;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 *
 * @author EDWIN ACER
 */
public class RectaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Graphics g = new Graphics();
        //rectaSimple(0,0,2,2,g);
    }

    static void rectaSimple(int x0, int y0, int x1, int y1, Graphics g) {
        int dx = x1 - x0;
        int dy = y1 - y0;

        g.drawLine(x0, y0, x0, y0);//funciona!!
        if (dx != 0) {
            float m = (float) dy / (float) dx;
            float b = y0 - m * x0;
            if (x1 > x0) {
                dx = 1;
            } else {
                dx = -1;
            }
            while (x0 != x1) {
                x0 += dx;
                y0 = Math.round(m * x0 + b);
                g.drawLine(x0, y0, x0, y0);
            }
        }
    }
}
