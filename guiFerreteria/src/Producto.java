/**
 * @file Producto.java
 * @brief Este archivo contiene la clase producto.
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         -Veronica Mujica - 2359406
 *         -Jeidy Murillo - 2359310 
 */

public class Producto {
    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidad;
    private String material;
    private String ejemplos;
    private String herramienta;
    private String categoria;
    private int codigo;

    public Producto() {
        this.nombre = null;
        this.descripcion = null;
        this.precio = 0;
        this.cantidad = 0;
        this.material = null;
        this.ejemplos = null;
        this.herramienta = null;
        this.categoria = null;
        this.codigo = 0;
    }

    
    public Producto(String nombre, String descripcion, int precio, int cantidad, String material, String ejemplos, String herramienta, String categoria, int codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.material = material;
        this.ejemplos = ejemplos;
        this.herramienta = herramienta;
        this.categoria = categoria;
        this.codigo = codigo;
    }
    
    // setter de la clase producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEjemplos(String ejemplos) {
        this.ejemplos = ejemplos;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    //getter de la clase producto
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMaterial() {
        return material;
    }

    public String getEjemplos() {
        return ejemplos;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public String getCategoria() {
        return categoria;
    }

    public long getCodigo() {
        return codigo;
    }
    
    public String getDatos(){
        return "Nombre del producto: \n" + nombre +
                "\nDescripcion del producto: \n" + descripcion +
                "\nPrecio del producto: \n" + precio +
                "\nCantidad del producto: \n" + cantidad +      
                "\nMaterial del producto: \n" + material +
                "\nEjemplos del producto: \n" + ejemplos +
                "\nHerramienta del producto: \n" + herramienta +
                "\nCategoria del producto: \n" + categoria +    
                "\nCodigo del producto: \n" + codigo;       
    }
}
