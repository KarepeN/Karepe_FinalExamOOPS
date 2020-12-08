/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques02;
/**
 *
 * @author Nithya Karepe
 */
public class ColorableDriver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new Square[5];
        Square s1 = new Square(1.0);
        Square s2 = new Square(2.0);
        Square s3 = new Square(3.0);
        Square s4 = new Square(4.0);
        Square s5 = new Square(5.0);
        
        geometricObjects[0] = s1;
        geometricObjects[1] = s2;
        geometricObjects[2] = s3;
        geometricObjects[3] = s4;
        geometricObjects[4] = s5;

        for (GeometricObject go : geometricObjects) {
            if (go instanceof Colorable) {
                Colorable c = (Colorable) go;
                c.howToColor();
            }
            Square s = (Square) go;
            System.out.printf("Area %.2fcm\u00B2\n", s.getArea());
        }
    }
}
