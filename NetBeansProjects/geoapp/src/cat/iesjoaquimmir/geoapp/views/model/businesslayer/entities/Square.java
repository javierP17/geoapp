
package cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities;

public class Square {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
         private double lado;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">
            public double getLado() {
               return lado;
            }
             public void setLado(double lado) {
               if(lado <= 0.0){
                   throw new IllegalArgumentException(
                   String.format("Valor %f no valid.", lado));
               }
               this.lado = lado;
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
            public Square(double lado){
                this.setLado(lado);
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">
            public double getArea(){
                return Math.pow(getLado(), 2);
            }
            public double getPerimeter(){
                return getLado() * 4;
            }
            
         //</editor-fold>
         
    //</editor-fold>

  
    
}
