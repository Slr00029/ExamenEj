package org.servicios.examenej;

import java.util.List;


public interface DAOArticulosInterfaz {

	public List<DTOArticulos> buscarArticulos(int tipo);

	public List<DTOArticulos> LeeArticulos();

	public DTOArticulos buscarArticuloUnico(int id);
	
}
