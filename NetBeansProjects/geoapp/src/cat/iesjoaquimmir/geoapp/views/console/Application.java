
package cat.iesjoaquimmir.geoapp.views.console;
import java.util.Scanner;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities.Esfera;

public class Application {

    public static void main(String[] args) {
        
        //variable pel switch
        int opc;
        
        Scanner inici = new Scanner(System.in);
        do{
        System.out.println("Escull una opció:\n1.Quadrat\n2.Rectangle\n3.Cercle\n4.Esfera\n5.Rectangle amb base per defecte\n6.Surt\n");
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
        } 
        }while(opc!=6);
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
                //imprimeix el resultat:
                System.out.printf("L'area és de: %.2f\n",c1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",c1.getPerimeter());
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
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",r1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",r1.getPerimeter());
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
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",cercle1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",cercle1.getPerimeter());   
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
                //Imprimeix el resultat:
                System.out.printf("\nL'area és de: %.2f\n",Esfera1.getArea());
                System.out.printf("El perimetre és de: %.2f\n",Esfera1.getPerimeter()); 
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
}
