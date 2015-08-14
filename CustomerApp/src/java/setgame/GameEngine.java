/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

/**
 *
 * @author A0136582b
 */
public class GameEngine {
    
    public static Boolean Compare(Cards e,Cards f,Cards d)
    {
        if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
        { 
            if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
            {
                return true;
            }
           
        }
     
      if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()==(e.getNumber()))
            {
                if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()==(e.getNumber()))
                {
                    return true;
                }
            }
     
      if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
      {
          if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
          {
              return true;
          }
      }
       if(d.getColor()!=(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
      {
          if(f.getColor()!=(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
          {
              return true;
          }
      }
         if(d.getColor()==(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
      {
          if(f.getColor()==(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
          {
              return true;
          }
      }
           if(d.getColor()==(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
        { 
            if(f.getColor()==(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
            {
                return true;
            }
           
        }
              if(d.getColor()==(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()==(e.getNumber()))
        { 
            if(f.getColor()==(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()==(e.getNumber()))
            {
                return true;
            }
           
        }
        if(d.getColor()==(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()==(e.getNumber()))
        { 
            if(f.getColor()==(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()==(e.getNumber()))
            {
                return true;
            }
           
        }
         if(d.getColor()!=(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()==(e.getNumber()))
        { 
            if(f.getColor()!=(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()==(e.getNumber()))
            {
               return true;
            }
           
        }
           if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()==(e.getNumber()))
        { 
            if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()==(e.getNumber()))
            {
               return true;
            }
           
        }
              if(d.getColor()==(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
        { 
            if(f.getColor()==(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
            {
               return true;
            }  
        }
            if(d.getColor()!=(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
        { 
            if(f.getColor()!=(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
            {
               return true;
            }  
        }
               if(d.getColor()==(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
        { 
            if(f.getColor()==(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
            {
               return true;
            }  
        }

       return false;
        
    }
    

}
//   public static void main(String[] args) 
//   {
//       Cards d = new Cards();
//        d.setColor("Red");
//        d.setShading("solid");
//        d.setShape("Oval");
//        d.setNumber(2);
//        
////        Cards d = new Cards();
////        d.setColor("Purple");
////        d.setShading("striped");
////        d.setShape("Squiggle");
////        d.setNumber(2);
//        
//        Cards e = new Cards();
//        e.setColor("Red");
//        e.setShading("striped");
//        e.setShape("Oval");
//        e.setNumber(2);
//       
//        Cards f = new Cards();
//        f.setColor("Red");
//        f.setShading("outlined");
//        f.setShape("Oval");
//        f.setNumber(3);
//        
//     if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
//        { 
//            if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
//            {
//                System.out.println("All are distinct");
//            }
//           
//        }
//     
//      if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()==(e.getNumber()))
//            {
//                if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()==(e.getNumber()))
//                {
//                    System.out.println("It is a set");
//                }
//            }
//     
//      if(d.getColor()!=(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
//      {
//          if(f.getColor()!=(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
//          {
//              System.out.println("It is a set");
//          }
//      }
//       if(d.getColor()!=(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
//      {
//          if(f.getColor()!=(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
//          {
//              System.out.println("It is a set");
//          }
//      }
//         if(d.getColor()==(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()!=(e.getNumber()))
//      {
//          if(f.getColor()==(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()!=(e.getNumber()))
//          {
//              System.out.println("It is a set");
//          }
//      }
//           if(d.getColor()==(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()!=(e.getNumber()))
//        { 
//            if(f.getColor()==(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()!=(e.getNumber()))
//            {
//                System.out.println("It is a set");
//            }
//           
//        }
//              if(d.getColor()==(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()!=(e.getShading())&&d.getNumber()==(e.getNumber()))
//        { 
//            if(f.getColor()==(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()!=(e.getShading())&&f.getNumber()==(e.getNumber()))
//            {
//                System.out.println("It is a set");
//            }
//           
//        }
//        if(d.getColor()==(e.getColor())&&d.getShape()!=(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()==(e.getNumber()))
//        { 
//            if(f.getColor()==(e.getColor())&&f.getShape()!=(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()==(e.getNumber()))
//            {
//                System.out.println("It is a set");
//            }
//           
//        }
//         if(d.getColor()!=(e.getColor())&&d.getShape()==(e.getShape())&&d.getShading()==(e.getShading())&&d.getNumber()==(e.getNumber()))
//        { 
//            if(f.getColor()!=(e.getColor())&&f.getShape()==(e.getShape())&&f.getShading()==(e.getShading())&&f.getNumber()==(e.getNumber()))
//            {
//                System.out.println("It is a set");
//            }
//           
//        }
//       System.out.println("It is not a set");
//        d.show();
//        e.show();
//        f.show();
//   }
    
    

