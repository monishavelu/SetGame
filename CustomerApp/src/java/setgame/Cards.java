/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author Raguram
 */
public class Cards {
    private String shape;
    private String shading;
    private String color;
    private Integer number;
    private Integer Hashkey;
    HashMap<Cards, Integer> hash = new HashMap<>();
    static ArrayList<Cards> cardList;
    
    //ArrayList<Cards> cardList=new ArrayList<>();
    
    public Cards(String shape,String shading,String color,Integer number,Integer Hashkey){
        this.shape=shape;
        this.shading=shading;
        this.color=color;
        this.number=number;
        this.Hashkey = Hashkey;
       // cardList.add(this);
    }
    
    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @return the shading
     */
    public String getShading() {
        return shading;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }
      public Integer getHashkey() {
        return Hashkey;
    }
    
   public Cards()
   {
   }
   
   
   /*public void shuffle()
   {
       Collections.shuffle(cardList);
   }*/

    @Override
    public String toString() {
        return shape + "\n" + shading +"\n" + color +"\n"+ number + "\n" + Hashkey;
    }
    public void show(){
        System.out.println(shape + "\n" + shading +"\n" + color +"\n"+ number); 
    }
    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @param shading the shading to set
     */
    public void setShading(String shading) {
        this.shading = shading;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
        public JsonObject toJson() {
        return (Json.createObjectBuilder()
                .add("#", Hashkey)
                .build());
    }
    
    public ArrayList<Cards> Generate()
    {
        cardList = new ArrayList<>();
          String[] shape={"Squiggle","Diamond","Oval"};
          String[] shading={"solid","striped","outlined"};
          String[] color={"red","purple","green"};
          Integer[] number={1,2,3};
       Cards c;
       int i = 0;
       
       for (String shading1 : shading) {
         for (String shape1 : shape) {
           for (String color1 : color){
              for (Integer number1 : number) {
                        c = new Cards(shape1, shading1, color1, number1,++i);
                        hash.put(c, i);
                        Hashkey = hash.get(c);
                        cardList.add(c);
                    }
                }
            }
        }
    Collections.shuffle(cardList);
    return cardList;
    }
    
   public Cards getCard(int a)
   {
       Cards c = new Cards();
       c.Generate();
        for (Cards cardList1 : cardList) {
            System.out.println(cardList1.getHashkey());
            if (a == cardList1.getHashkey()) {
                c = cardList1;
            }
        }
        return c;
   }
}