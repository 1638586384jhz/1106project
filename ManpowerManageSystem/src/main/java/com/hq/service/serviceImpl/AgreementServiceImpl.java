package com.hq.service.serviceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.mapper.AgreementMapper;
import com.hq.pojo.Agreement;
import com.hq.service.AgreementService;
@Service
public class AgreementServiceImpl implements AgreementService{
	@Autowired
	public AgreementMapper agreementMapper;
	@Override
	public boolean agreementAdd(Agreement agreement) {
		if(agreementMapper.agreementAdd(agreement)>0) {
			return true;
		}
		return false;
	}
	
	  @Override 
	  public HashMap<String, Object> selectAgreement( Agreement agreement) {
	  
			HashMap<String,Object>  map = new HashMap<String,Object> ();

			if(agreement.geteName()!=null&&!agreement.geteName().equals("")){
				agreement.seteName("%"+agreement.geteName()+"%");
				int eId=agreementMapper.selectIdByName(agreement);
				agreement.seteId(eId);
			}

			int start = agreement.getRows()*(agreement.getPage()-1);
			agreement.setStart(start);	
			int total = agreementMapper.selectCount(agreement);
		
			map.put("rows", agreementMapper.selectAgreement(agreement));
			
			map.put("total", total);
			return map;

}

	@Override
	public boolean agreementUpdate(Agreement agreement) {
		if(agreementMapper.agreementUpdate(agreement)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean agreementDel(Integer aId) {
		if(agreementMapper.agreementDel(aId)>0) {
			return true;
		}
		return false;
	}
}
