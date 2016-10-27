
package cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities;

public class Cercle {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
         private double radi;
         public static final double cercle1=1.0;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:mètodes">
         //<editor-fold defaultstate="collapsed" desc="getters/setters">
            public double getRadi() {
               return radi;
            }
             public void setRadi(double radi) {
               if(radi <= 0.0){
                   throw new IllegalArgumentException(
                   String.format("Valor %f no valid.", radi));
               }
               this.radi = radi;
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Constructores">
            public Cercle(double radi){
                this.setRadi(radi);
            }
            public Cercle(){
                this(cercle1);
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">
            public double getArea(){
                return Math.pow(getRadi() * Math.PI, 2);
            }
            public double getPerimeter(){
                return 2 * Math.PI * getRadi();
            }
            
         //</editor-fold>
         
    //</editor-fold>

  
}
