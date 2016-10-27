
package cat.iesjoaquimmir.geoapp.views.console;
import java.util.Scanner;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Esfera;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Color;

public class Application {

    public static void main(String[] args) {
        
        //variable pel switch
        int opc;
        
        Scanner inici = new Scanner(System.in);
        do{
        System.out.println("Escull una opció:\n1.Quadrat\n2.Rectangle\n3.Cercle\n4.Esfera\n5.Rectangle amb base per defecte\n6.Color\n7.colorHex\n8.Color Aleatori\n9.Surt\n");
        opc = inici.nextInt();
        switch (opc){
            case 1:
                quadrat();
                break;
            case 2:
               rectangle();
                break;
            case 3:
                cercle();
                break; 
            case 4:
                esfera();
                break;
            case 5:
                rectangle1();
                break;
            case 6:
                colors();
                break;
            case 7:
                colorHex();
                break;
            case 8:
                colorAleatorio();
                break;
        } 
        }while(opc!=9);
    }
    private static void quadrat(){
                //variable pel costat
                double costatQ = 0;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el costat del cuadrat:
                    System.out.printf("Introdueix el costat: ");
                    costatQ = pregunta.nextDouble();
                    //Objecte Square
                    Square c1 = new Square(costatQ);
                    //objecte square del segon quadrat el qual no li pasem paràmetre, agafarà el valor per defecte que li pasem com a constant al nou constructor que li hem creat
                    Square c2 = new Square();
                //imprimeix el resultat:
                System.out.printf("L'area és de: %.2f\n",c1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",c1.getPerimeter());
                System.out.printf("L'area del segon quadrat és de: %.2f\n",c2.getArea());
                System.out.printf("El perimetre del segon quadrat  és de: %.2f\n",c2.getPerimeter());
        }
        private static void rectangle(){
                
                //variable pel rectangle
                double BaseR = 0;
                double AlturaR = 0;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta la base del rectangle:
                System.out.printf("\nIntrodueix l'altura: ");
                AlturaR = pregunta.nextDouble();
                //pregunta la base del rectangle:
                System.out.printf("\nIntrodueix la base: ");
                BaseR = pregunta.nextDouble();
                //Objecte Rectangle
                Rectangle r1 = new Rectangle(AlturaR,BaseR);
                Rectangle r3 = new Rectangle();
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",r1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",r1.getPerimeter());
                System.out.printf("\nL'area del tercer rectangle és de: %.2f\n",r3.getArea());
                System.out.printf("El perimetre del tercer rectangle és de: %.2f\n",r3.getPerimeter());
        }
        private static void cercle(){
                
                //variable cercle
                double Radi = 0;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el radi del cercle:
                System.out.printf("\nIntrodueix el radi: ");
                Radi = pregunta.nextDouble();
                //Objecte cercle:   
                Cercle cercle1 = new Cercle(Radi);
                Cercle cercle2 = new Cercle();
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",cercle1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",cercle1.getPerimeter()); 
                System.out.printf("\nL'area del segon cercle és de: %.2f\n",cercle2.getArea());
                System.out.printf("El perimetre del segon cercle és de: %.2f\n",cercle2.getPerimeter());
        }
        private static void esfera(){
                //variable esfera
                double RadiE = 0;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el radi de l'esfera:
                System.out.printf("\nIntrodueix el radi: ");
                RadiE = pregunta.nextDouble();
                //Objecte esfera:   
                Esfera Esfera1 = new Esfera(RadiE);
                Esfera Esfera2 = new Esfera();
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",Esfera1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",Esfera1.getPerimeter());
                 System.out.printf("\nL'area de la segona esfera és de: %.2f\n",Esfera2.getArea());
                System.out.printf("El perimetre de la segona esfera és de: %.2f\n",Esfera2.getPerimeter());
        }
         private static void rectangle1(){
                 
                
                //variable pel rectangle
                double AlturaR = 0;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta l'altura del rectangle:
                System.out.printf("\nIntrodueix l'altura: ");
                AlturaR = pregunta.nextDouble();
                //Objecte Rectangle amb base per defecte
                Rectangle r2 = new Rectangle(AlturaR);
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",r2.getArea());
                System.out.printf("El perimetre és de: %.2f\n",r2.getPerimeter());
        }
         private static void colors(){
             Color co1 = new Color(125,125,Color.MAX_VALUE);
             System.out.printf("co1 -> r: %d g: %d b: %d %n",
                     co1.getRed(), co1.getGreen(), co1.getBlue());
             System.out.printf("Verdader: %s %n", co1.toHexString(true));
             System.out.printf("Fals: %s %n", co1.toHexString(false));
             System.out.printf("Sense paràmetre: %s %n", co1.toHexString());
         }
         private static void colorHex(){
               //variable pel rectangle
                String c1;
                //mètode que necesitem per operar amb la pregunta:
                Scanner pregunta = new Scanner(System.in);
                //pregunta el color en Hexadecimal:
                System.out.printf("\nIntrodueix un color en Hexadecimal: ");
                c1 = pregunta.next();
                Color c02 = Color.fromHexString(c1);
                System.out.printf("co2 -> r: %d g: %d b: %d %n", 
                c02.getRed(), c02.getGreen(), c02.getBlue());
         }
          private static void colorAleatorio(){
                Color cAleat = Color.ObtRandom();
                System.out.printf("cAleat -> r: %d g: %d b: %d %n", 
                cAleat.getRed(), cAleat.getGreen(), cAleat.getBlue());
                System.out.printf("Verdader: %s %n", cAleat.toRGBString(true));
                System.out.printf("Fals: %s %n", cAleat.toRGBString(false));
                System.out.printf("Sense paràmetre: %s %n", cAleat.toRGBString());
         }
}
