package testregister.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import testregister.model.Test;
import testregister.repository.TestRegisterRepository;
import testregister.userInput.TestInput;

@Service
public class TestRegisterService {
	@Autowired
	private TestRegisterRepository repository;

	public Test readTest(String testId) {
		// TODO Auto-generated method stub
		Test test = null;
		test = repository.findByTestId(testId);
		return test;
	}

	public void insertTest(TestInput info) {
		// TODO Auto-generated method stub
		
		if(info != null) {
			Test test = new Test();
			test.setApkId(info.getApkId());
			test.setAppId(info.getAppId());
			test.setTcId(info.getTcId());
			test.setTestDescription(info.getTestDescription());
			test.setTestName(info.getTestName());
			test.setTestDevices(info.getTestDevices());
			repository.save(test);
		}
	}

	public boolean updateTest(String testId, TestInput info) {
		// TODO Auto-generated method stub
		Test test = null;
		test = repository.findByTestId(testId);
		
		if(test != null) {
			Test testUpdated = new Test();
			testUpdated.setApkId(info.getApkId());
			testUpdated.setAppId(info.getAppId());
			testUpdated.setTcId(info.getTcId());
			testUpdated.setTestDescription(info.getTestDescription());
			testUpdated.setTestName(info.getTestName());
			testUpdated.setTestDevices(info.getTestDevices());
			repository.save(testUpdated);
			
			return true;
			
		}
		return false;
	}

	public void deleteTest(String testId) {
		// TODO Auto-generated method stub
		Test test = null;
		test = repository.findByTestId(testId);
		
		if(test != null) {
			repository.deleteByTestId(testId);
		}
		
	}

}
