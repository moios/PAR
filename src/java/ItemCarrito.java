
public class ItemCarrito {
    Producto producto;
    int cantidad;
    int subtotal;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.precio * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    
}
