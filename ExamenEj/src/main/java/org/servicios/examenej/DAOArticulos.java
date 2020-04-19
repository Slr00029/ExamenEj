package org.servicios.examenej;


import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DAOArticulos implements DAOArticulosInterfaz{
	

	public JdbcTemplate jdbcTemplate;



	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	public List<DTOArticulos> buscarArticulos(int tipo) {
		String sql = "select * from articulos where tipo = ?";
		Object[ ] parametros = {tipo};
		ArticulosMapper mapper = new ArticulosMapper();
		List<DTOArticulos> articulos = this.jdbcTemplate.query(sql, parametros, mapper);
		return articulos;
	}	

	public List<DTOArticulos> LeeArticulos() {
		String sql = "select * from articulos";
		ArticulosMapper mapper = new ArticulosMapper();
		List<DTOArticulos> articulos = this.jdbcTemplate.query(sql, mapper);
		return articulos;
	}
	
	public DTOArticulos buscarArticuloUnico(int id) {
		String sql = "select * from articulos where id = ?";
		Object[ ] parametros = {id};
		ArticulosMapper mapper = new ArticulosMapper();
		List<DTOArticulos> articulo = this.jdbcTemplate.query(sql, parametros, mapper);
		if(articulo.isEmpty()) return null;
		else return articulo.get(0);
	}	
	
}
