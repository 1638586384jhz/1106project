package com.hq.mapper;

import java.util.List;

import com.hq.pojo.Files;

public interface FilesMapper {

	int filesAdd(Files files);

	int selectCount(Files files);

	List<Files> selectFiles(Files files);

	int filesUpdate(Files files);

	int fileDel(Integer fId);

	

}
