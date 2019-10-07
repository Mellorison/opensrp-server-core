package org.opensrp.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ibm.icu.util.Calendar;
import org.joda.time.DateTime;
import org.opensrp.domain.setting.SettingConfiguration;
import org.opensrp.repository.SettingRepository;
import org.opensrp.repository.postgres.handler.SettingTypeHandler;
import org.opensrp.search.SettingSearchBean;
import org.opensrp.util.DateTimeTypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SettingService {
	
	private static Logger logger = LoggerFactory.getLogger(SettingService.class.toString());
	
	private SettingRepository settingRepository;
	
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	        .registerTypeAdapter(DateTime.class, new DateTimeTypeConverter()).create();
	
	@Autowired
	public void setSettingRepository(SettingRepository settingRepository) {
		this.settingRepository = settingRepository;
	}
	
	public List<SettingConfiguration> findSettings(SettingSearchBean settingQueryBean) {
		return settingRepository.findSettings(settingQueryBean);
	}
	
	public void addServerVersion() {
		try {
			List<SettingConfiguration> settingConfigurations = settingRepository.findByEmptyServerVersion();
			logger.info("RUNNING addServerVersion settings size: " + settingConfigurations.size());
			long currentTimeMillis = System.currentTimeMillis();
			for (SettingConfiguration settingConfiguration : settingConfigurations) {
				try {
					Thread.sleep(1);
					settingConfiguration.setServerVersion(currentTimeMillis);
					settingRepository.update(settingConfiguration);
					currentTimeMillis += 1;
				}
				catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	public synchronized String saveSetting(String jsonSettingConfiguration) {
		SettingTypeHandler settingTypeHandler = new SettingTypeHandler();
		SettingConfiguration settingConfigurations = null;
		try {
			settingConfigurations = settingTypeHandler.mapper.readValue(jsonSettingConfiguration, SettingConfiguration.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		settingConfigurations.setServerVersion(Calendar.getInstance().getTimeInMillis());
		
		if (settingConfigurations.getId() != null && settingRepository.get(settingConfigurations.getId()) != null) {
			
			settingRepository.update(settingConfigurations);
			
		} else {
			
			settingRepository.add(settingConfigurations);
		}
		
		return settingConfigurations.getIdentifier();
		
	}
	
}
