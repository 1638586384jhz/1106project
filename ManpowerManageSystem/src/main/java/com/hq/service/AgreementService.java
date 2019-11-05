package com.hq.service;

import java.util.HashMap;

import com.hq.pojo.Agreement;

public interface AgreementService {

	boolean agreementAdd(Agreement agreement);

	HashMap<String, Object> selectAgreement( Agreement agreement);

	boolean agreementUpdate(Agreement agreement);

	boolean agreementDel(Integer aId);

}
