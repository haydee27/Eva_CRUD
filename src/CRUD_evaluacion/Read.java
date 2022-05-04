
package CRUD_evaluacion;

import java.sql.SQLException;

public class Read {
    public Read() throws SQLException {
        System.out.println("<< CONSULTA DE REGISTRO >>");
        mostrarResultados();
    }

    private void mostrarResultados() throws SQLException {
        try{
            Conexion_CRUD utilerias = new Conexion_CRUD();
            String tabla = "tb_estudiante";
            String CamposTabla = "*";
            String condicionBuscar= "";
            
            utilerias.desplegarRegistros(tabla, CamposTabla, condicionBuscar);
            
            
        }catch(SQLException e) {
            System.out.println("Ha ocurrido el siguiente error: " + e.getMessage()); 
        }finally{
            MenuPrincipal.desplegarMenu();
        }
    }
}
