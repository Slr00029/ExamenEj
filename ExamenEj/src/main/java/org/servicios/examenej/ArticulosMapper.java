package org.servicios.examenej;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


	public class ArticulosMapper implements RowMapper <DTOArticulos>{
		public DTOArticulos mapRow(ResultSet rs, int rowNum) throws SQLException{
		DTOArticulos articulos = new DTOArticulos();
		articulos.setId(rs.getInt("id"));
		articulos.setTipo(rs.getInt("tipo"));
		articulos.setDescripcion(rs.getString("descripcion"));
		return articulos;
		}
		}
	

