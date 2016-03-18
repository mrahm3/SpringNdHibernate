package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.entity.ServiceRequest;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;
import com.training.utils.ServiceRequestRowMapper;

public class ServiceRequestDAO extends JdbcDaoSupport implements MyDAO<ServiceRequest> {

	@Override
	public boolean add(ServiceRequest t) {
		boolean result=false;
		String sql="insert into serviceRequest values (?,?,?,?,?)";
		int rowInserted=getJdbcTemplate().update(sql,t.getCust().getCustomerName(),t.getProduct().getItemName(),
				                                                                                 t.getDescription(),t.getCust().getMobileNumber(),t.getComplainId());
		
		if(rowInserted>0){
			result=true;
		}
		return result;
		
	}

	@Override
	public ServiceRequest find(int key) {
		String sql="select * from ServiceRequest where complainId=?";
		  ServiceRequest sr=getJdbcTemplate().queryForObject(sql, new  ServiceRequestRowMapper(),key );
		return sr;
	}

	@Override
	public List<ServiceRequest> findAll() {
		
		String sql="select * from servicerequest";
		List<ServiceRequest> srList=getJdbcTemplate().query(sql, new ServiceRequestRowMapper());
		return srList;
	}

}
