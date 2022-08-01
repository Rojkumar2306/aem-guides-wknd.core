/*package com.adobe.aem.guides.wknd.core.models.impl;
import javax.annotation.Resource;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.aem.guides.wknd.core.models.Practice;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class}, adapters = Practice.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PracticeImpl implements Practice  {
	
	@ValueMapValue
	String title;
	
	@ValueMapValue
	String location;
	
	@ValueMapValue
	String gender;
	
	@ValueMapValue
	String browse;
	
	@ValueMapValue
	boolean status;
	
	@Override
	public String getMyTitle() {
		return title;
	}

	@Override
	public String getMyAddress() {
		return location;
	}

	@Override
	public String getMyGender() {
		return gender;
	}

	@Override
	public String getMyPath() {
		return browse;
	}

	@Override
	public boolean getIsAgree() {
		return status;
	}

	

}*/