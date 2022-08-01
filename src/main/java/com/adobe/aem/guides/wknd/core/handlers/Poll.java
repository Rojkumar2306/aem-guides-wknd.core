package com.adobe.aem.guides.wknd.core.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import com.adobe.aem.guides.wknd.core.models.PollBean;
import com.adobe.cq.sightly.WCMUsePojo;

public class Poll extends WCMUsePojo{
	List<PollBean> pollOptions;
	Resource pollResource;
	
	@Override 
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		pollResource=getResource();
		setPollOptions();
		
	}
	private void setPollOptions() {
		// TODO Auto-generated method stub
		pollOptions =new ArrayList<>();
		if(null!=pollResource) {
			Resource polloptionsmultifieldResource=pollResource.getChild("polloptionsmultifield");
			if(null!=polloptionsmultifieldResource && polloptionsmultifieldResource.hasChildren()) {
				Iterator<Resource> pollOptionsItr=polloptionsmultifieldResource.listChildren();
				while(pollOptionsItr.hasNext()){
					Resource pollOptionsResource=pollOptionsItr.next();
					ValueMap pollOptionsValueMap=pollOptionsResource.getValueMap();
					String optionText = pollOptionsValueMap.get("optionText","");
					String optionValue=pollOptionsValueMap.get("optionValue","");
					PollBean pollOptionsBean=new PollBean();
					pollOptionsBean.setOptionText(optionText);
					pollOptionsBean.setOptionValue(optionValue);
					pollOptions.add(pollOptionsBean);
				}
			}
			
		}
		
	}
	
	public List<PollBean> pollOptions(){
		return pollOptions;
	}
	
}
