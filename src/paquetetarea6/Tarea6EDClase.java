package paquetetarea6;


public class Tarea6EDClase {
    
     private static final int DESCUENTO_SUPERIOR = 5;
     private static final double DESCUENTO_ESPECIAL = 0.95;
     private static final double DESCUENTO_GENERAL = 0.8;
     
    public void aplicarDescuento (double precioProducto, int cantidadProductos) {
        double Total;
               if(cantidadProductos>3)
                    precioProducto-=DESCUENTO_SUPERIOR;
                if (cantidadProductos!=0){
                    Total = precioProducto*DESCUENTO_GENERAL;
                    screenOutput(Total);
                }else {
                    Total = precioProducto*DESCUENTO_ESPECIAL;
                    screenOutput(Total);
        }   
    }
    
    private void screenOutput(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
