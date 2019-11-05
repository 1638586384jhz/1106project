package com.hq.service;

import java.util.HashMap;

import com.hq.pojo.Files;

public interface FilesService {

	boolean filesAdd(Files files);

	HashMap<String, Object> selectFiles(Files files);

	boolean filesUpdate(Files files);

	boolean filesDel(Integer fId);

}
