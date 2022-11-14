/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosCG;

/**
 *
 * @author EDWIN ACER
 */
public class Algoritmos {
    
    public Algoritmos(){
        
    }
    
    public void lineaRectaBasico(float x0, float y0, float x1, float y1){
        float m;
        float y;
        float x;
        
        m = (y1-y0) / (x1-x0);
        System.out.println(m);
        
        y = y0;
        x = x0;
        
        System.out.println(x + ", " + y);
        
        for(int i = (int)x0; i < (int)x1; i++){
            y = y + m;
            x++;
            System.out.println( Math.round(x) +", " + Math.round(y) + " | "+ x +", "+ y);
        }
    }
    
    public void DDA(float x0, float y0, float x1, float y1){
        float dx;
        float dy;
        float steps;
        float xinc, yinc;
        float x, y;
        
        dx = x1 - x0;
        dy = y1 - y0;
        
        System.out.println("");
        System.out.println(dx + " | "+ dy);
        
        if (Math.abs(dx) > Math.abs(dy)){
            steps = Math.abs(dx);
        }
        else{
            steps = Math.abs(dy);
        }
        
        xinc = dx / steps;
        yinc = dy / steps;       
        x = x0;
        y = y0;
        
        System.out.println(xinc + " || "+ yinc);
        
        System.out.println(Math.round(x0) +", "+Math.round(y0));
        
        for(int i=0; i<steps; i++){
            x = x + xinc;
            y = y + yinc;
            System.out.println(Math.round(x) + ", " + Math.round(y) + " | "+ x + ", "+ y);
        }        
    }
    
    public void lineaRectaBresenham(int x0, int y0, int x1, int y1){
        int dx, dy;
        int pk;
        int x, y;
        
        x = x0;
        y = y0;
        
        dx = x1-x0;
        dy = y1-y0;
        
        pk = 2*dy - dx;
        
        System.out.println("");
        System.out.println(x +", "+ y + " || "+ pk);
        
        for(int i=0; i < dx; i++){
            
            if (pk < 0){
                x = x + 1;
                y = y;
                pk = pk + 2*dy;
            }
            else{
                x = x + 1;
                y = y + 1;
                pk = pk + 2*dy - 2*dx;
            }
            
            System.out.println(x + ", "+ y +" | " + pk);
        }
    }
    
    public void puntoMedio(int x0, int y0, int r){
        int x, y;
        int pk;
        
        x = x0 - x0;
        y = y0 + r -y0;
        pk = 1 - r;
        
        System.out.println("");
        System.out.println(x+x0 +", "+ (y+y0) +" | "+ pk);
        while(x < y - 1){           
            if(pk < 0){
                x = x + 1;
                //y = y;
                pk = pk + 2*x + 1;
            }
            else{
                x = x + 1;
                y = y - 1;
                pk = pk - 2*y + 2*x;
            }
            System.out.println(x+x0 +", "+ (y+y0) +" | "+ pk);    
        }
    }
    
    public void circulosBresenham(int x0, int y0){
        
        int x, y;
        int r;
        int d;
        
        r = y0;
        d = 3 - 2*r;
        
        x = x0;
        y = y0 + r;
        
        System.out.println("");
        System.out.println(x +", "+ y + " | "+ d);
        
        while(x < y){
            x++;
            if(d < 0){
                y = y;
                d = d + 4*x + 6;      
            }
            else{                
                d = d + 4*(x - y) + 10;    
                y = y - 1;
            }
            System.out.println(x +", "+ y + " | "+ d);
        }
    }
    
    public void circle(int r){
        int x, y, d;
        
        x = r;
        y = 0;
        d = 3 - 2*r;
        
        System.out.println("");
        
        while(x > y){
            System.out.println(x +", "+ y);
            y++;
            
            if(d < 0){
                d += 2 + 4*y;
            }        
            else{
                x--;
                d += 2 - 4*(x-y);
            }
        }
        if(x==y){
            System.out.println(x +", "+ y);
        }
    }
    
    public void prueba(float x0, float y0, float x1, float y1){
        
        float m, x, y;
        
        x=x0;
        y=y0;
        
        m = (y1-y0)/(x1-x0);
        
        System.out.println("");
        
        for(int i=(int)x0; i<= (int)x1; i++){
            System.out.println(x +", "+ Math.round(y));
            
            y = x + m;
            x = x + 1; 
        }
    }
}
