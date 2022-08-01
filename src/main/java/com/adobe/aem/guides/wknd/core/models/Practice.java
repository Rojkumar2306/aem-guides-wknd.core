package com.adobe.aem.guides.wknd.core.models;

import javax.annotation.Resource;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Practice  {
	
	@ValueMapValue
	@Default(values="AEM")
	String title;
	
	@ValueMapValue
	@Default(values="v6.5")
	String location;
	
	@ValueMapValue
	String gender;
	
	@ValueMapValue
	String browse;
	
	@ValueMapValue
    String status;
	
	public String getMyTitle() {
		return title;
	}

	public String getMyAddress() {
		return location;
	}

	public String getMyGender() {
		return gender;
	}

	public String getMyPath() {
		return browse;
	}

	public String getIsAgree() {
		return status;
	}

	

}