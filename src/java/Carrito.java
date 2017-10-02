
import java.util.ArrayList;


public class Carrito {
    ArrayList<ItemCarrito> carrito;
    ItemCarrito c;
    public void agregar(Producto prod, int cant){
        c = new ItemCarrito(prod, cant);
        carrito.add(c);
    }
    public void eliminar(Producto p){
        for(int x=0;x<carrito.size();x++){
            if(carrito.get(x).getProducto() == p)carrito.remove(x);
            return;
        }
    }
}
