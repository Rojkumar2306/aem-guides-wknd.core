package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables= {SlingHttpServletRequest.class, Resource.class}, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class SamplePollModel {
	
	@SlingObject
		Resource resource;
	@ChildResource 
	List<PollOptionsModel> pollOptionsMultifield;
	
		public List<PollOptionsModel> getPollOptions(){
			return pollOptionsMultifield;
		}
		
	
	
}
