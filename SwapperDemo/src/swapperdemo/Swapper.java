/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swapperdemo;

/**
 *
 * @author Gabriel Scopel
 */
public class Swapper {
    private float x;
    private float y;
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void swap(){
        float aux = this.x;
        this.x = this.y;
        this.y = aux;
    }
}
