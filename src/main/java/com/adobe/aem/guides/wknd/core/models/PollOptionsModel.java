package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model (adaptables= {SlingHttpServletRequest.class, Resource.class}, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class PollOptionsModel {
	
	@ValueMapValue
	String optionText;
	
	@ValueMapValue
	String optionValue;
	
	public String getOptionText() {
		return optionText;
	}
	

	public String getOptionValue() {
		return optionValue;
	}
	
	

}
