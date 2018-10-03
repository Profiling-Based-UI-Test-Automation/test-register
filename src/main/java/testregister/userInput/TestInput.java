package testregister.userInput;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;


public class TestInput {
	@Id
	private String _id;
		
	private String testName;
	
	private String testDescription;
	
	private String appId;
	
	private ObjectId apkId; 
	
	private ObjectId tcId;
	
	private List<String> testDevices;
	
	
	public TestInput(){

	}
	
	public String getAppId() {
		return appId;
	}

	private void setAppId(String _appId) {
		this.appId = _appId;
	}
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String _testName) {
		this.testName = _testName;
	}
	
	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String _testDescription) {
		this.testDescription = _testDescription;
	}

	public ObjectId getApkId() {
		return apkId;
	}

	public void setApkId(ObjectId _apkId) {
		this.apkId = _apkId;
	}
	
	public ObjectId getTcId() {
		return tcId;
	}

	public void setTcId(ObjectId _tcId) {
		this.tcId = _tcId;
	}	

	public List<String> getTestDevices() {
		return testDevices;
	}

	public void setTestDevices(List<String> serials) {
		this.testDevices = serials;
	}	
	
	
	@Override
	public String toString() {
		return "Test [ testName = " + testName + ", testDescription = " + testDescription + ", appId = " + appId   + ", apkId = " + apkId + ", tcId = " + tcId + ", devices = " + testDevices + "]";	
	}

}