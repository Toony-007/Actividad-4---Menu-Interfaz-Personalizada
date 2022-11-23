/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaController;

import javax.swing.table.DefaultTableModel;
import ProductosTienda.ProveedorProducto;

/**
 *
 * @author Anderson Diaz
 */
public class ProductosController implements DAOtienda.DAOproductos{
    
    private static ProductosController instancia;
    private String productos[][][];
    private int cProducto;
    private int cRopa;
    private int cCocina;
    private int cJuguete;
    private int cTecnologia;
    
    public static ProductosController getInstance(){
        if(instancia == null)
            instancia = new ProductosController();
        return instancia;
    }
    
    private ProductosController(){
        this.productos = new String[6][100][4];
        this.cRopa = 0;
    }
    
    @Override
    public boolean GuardarProducto(String nproducto, String prproducto, String codproducto, String dproducto, String vproducto, String tipproducto) { 
        int cTipo;
        if (tipproducto.equals("Ropa")){
            cTipo = 0;
            cProducto = cRopa;
        }else if (tipproducto.equals("Cocina")){
            cTipo = 1;
            cProducto = cCocina;
        }else if (tipproducto.equals("Juguetes")){
            cTipo = 2;
        }else if (tipproducto.equals("Tecnología")){
            cTipo = 3;
        }
        productos[0][cProducto][cTipo] = nproducto;
        productos[1][cProducto][cTipo] = prproducto;
        productos[2][cProducto][cTipo] = codproducto;
        productos[3][cProducto][cTipo] = dproducto;
        productos[4][cProducto][cTipo] = vproducto;
        productos[5][cProducto][cTipo] = tipproducto;
        
        if (cTipo == 0){
            
        }
        return true;
    }

    @Override
    public boolean GuardarProducto(String[] producto) {
        
        productos[0][cProducto][cTipo] = producto[0];
        productos[1][cProducto][cTipo] = producto[1];
        productos[2][cProducto][cTipo] = producto[2];
        productos[3][cProducto][cTipo] = producto[3];
        productos[4][cProducto][cTipo] = producto[4];
        productos[5][cProducto][cTipo] = producto[5];
        cProducto++; 
        
        return true;
    }

    @Override
    public DefaultTableModel MostrarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean ActualizarProducto(String[] producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarProducto(String[] producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[][] MostrarCatalogo(int Tipo, int cProd) {
        String[][] catalogo = null;
        for (int i = cProd; i<4 && i<cProducto; i++ ){
           
        }
        return catalogo;
    }

}
