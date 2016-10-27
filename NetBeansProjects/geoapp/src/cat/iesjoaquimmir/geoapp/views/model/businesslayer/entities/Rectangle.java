
package cat.iesjoaquimmir.geoapp.views.model.businesslayer.entities;

public class Rectangle {
    //<editor-fold defaultstate="collapsed" desc="Estat:atributs">
        private double altura;
        private double base = 20;
        public static final double altura1=1.0;
        public static final double base1=1.0;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportament:metòdes">
        //<editor-fold defaultstate="collapsed" desc="getters/setters">
            public double getAltura() {
               return altura;
            }
             public void setAltura(double altura) {
                if(altura <= 0.0){
                   throw new IllegalArgumentException(
                   String.format("Valor %f no valid.", altura));
               }
               this.altura = altura;
            }
            public double getBase() {
               return base;
            }
             public void setBase(double base) {
                 if(base <= 0.0){
                   throw new IllegalArgumentException(
                   String.format("Valor %f no valid.", base));
               }
               this.base = base;
            }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Constructores">
            public Rectangle(double altura, double base){
                this.setAltura(altura);
                this.setBase(base);
            }
            public Rectangle(double altura){
                this(altura,base1);
            }
            public Rectangle(){
                this(altura1,base1);
            } 
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="comment">
           public double getArea(){
                return getBase() * getAltura();
            }
            public double getPerimeter(){
                return (2 * getBase()) + (2 * getAltura());
                
            } 
        //</editor-fold>
    //</editor-fold>
}
