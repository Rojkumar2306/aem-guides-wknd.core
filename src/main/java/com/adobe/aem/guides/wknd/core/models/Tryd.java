package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model (adaptables= {SlingHttpServletRequest.class, Resource.class}, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class Tryd extends SamplePollModel{
	
	@ValueMapValue
	String optionText;
	
	@ValueMapValue
	String optionValue;
	
	@ValueMapValue
	String pollTitle;
	
	@ValueMapValue
	String pollResultTitle;
	
	@ValueMapValue
	String pollResultDescription; 
	
	@ValueMapValue
	String pollDescription;
	
	@ValueMapValue
	String pollSubmitLabel;
	@ValueMapValue
	  String submitOnClick;
	
	
	public String getMyPollResultTitle() {
		return pollResultTitle;
	}

	public String getMyPollResultDescription() {
		return pollResultDescription;
	}

	public String getMyPollTitle() {
		return pollTitle;
	}

	public String getMyPollDescription() {
		return pollDescription;
	}

	public String getOptionText() {
		return optionText;
	}
	
	public String getOptionValue() {
		return optionValue;
	}
	

	public String getMyPollSubmitLabel() {
		return pollSubmitLabel;
	}
	
	  public String getSubmitOnClick() {
	      
			return submitOnClick;
	    }



}
