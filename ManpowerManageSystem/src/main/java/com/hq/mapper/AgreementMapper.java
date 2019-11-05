package com.hq.mapper;

import java.util.List;

import com.hq.pojo.Agreement;

public interface AgreementMapper {

	int agreementAdd(Agreement agreement);

	int selectIdByName(Agreement agreement);

	int selectCount(Agreement agreement);

	List<Agreement> selectAgreement(Agreement agreement);

	int agreementUpdate(Agreement agreement);

	int agreementDel(Integer aId);

	

}
