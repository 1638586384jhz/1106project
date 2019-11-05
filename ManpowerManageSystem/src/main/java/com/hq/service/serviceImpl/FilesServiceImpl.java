package com.hq.service.serviceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.mapper.FilesMapper;
import com.hq.pojo.Files;
import com.hq.service.FilesService;
@Service
public class FilesServiceImpl implements FilesService {

	@Autowired
	public FilesMapper filesMapper;
	@Override
	public boolean filesAdd(Files files) {
		if(filesMapper.filesAdd(files)>0) {
			return true;
		}
		return false;
	}
	@Override
	public HashMap<String, Object> selectFiles(Files files) {
		HashMap<String,Object>  map = new HashMap<String,Object> ();

		if(files.getfName()!=null&&!files.getfName().equals("")){
			files.setfName("%"+files.getfName()+"%");
		}
		
		
		
		int start = files.getRows()*(files.getPage()-1);
		files.setStart(start);	
		int total = filesMapper.selectCount(files);
	
		map.put("rows", filesMapper.selectFiles(files));
		
		map.put("total", total);
		return map;
	}
	@Override
	public boolean filesUpdate(Files files) {
		// TODO Auto-generated method stub
		if(filesMapper.filesUpdate(files)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean filesDel(Integer fId) {
		if(filesMapper.fileDel(fId)>0) {
			return true;
		}
		return false;
	}

}
