package cl.abcdin.sst.dao;

import cl.abcdin.sst.model.GuiaWebService;

public class GuiaWebServiceDAO extends BaseDAO 
{
	public GuiaWebService getRequestByInumero(Long iNumero) throws Exception {
		return getSqlSessionTemplate().selectOne("guiaWebService.getRequestByINumero", iNumero);
	}
	
}
