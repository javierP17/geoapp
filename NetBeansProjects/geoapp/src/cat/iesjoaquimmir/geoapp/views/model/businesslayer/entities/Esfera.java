
package cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities;


public class Esfera {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
         private double radi;
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
            public Esfera(double radi){
                this.setRadi(radi);
            }
         //</editor-fold>
         //<editor-fold defaultstate="collapsed" desc="Operaciones de Objeto">
            public double getArea(){
                return (4 * Math.PI) * (Math.pow(getRadi(),2));
            }
            public double getPerimeter(){
                return (4/3 * Math.PI) * (Math.pow(getRadi(), 3));
            }
            
         //</editor-fold>
         
    //</editor-fold>

}
