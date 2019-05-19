package ru.liptsoft.geosuggestions.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.liptsoft.geosuggestions.service.LocationServiceImpl;
import ru.redcom.lib.integration.api.client.dadata.dto.Address;

import javax.ws.rs.FormParam;

@Service("daDataAdapter")
public class LocationServiceDelegate implements JavaDelegate {

    @Autowired
    private LocationServiceImpl locationService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String address = (String) delegateExecution.getVariable("address");

        String fullAddress = locationService.getAddress(address).toString();

        delegateExecution.setVariable("fullAddress", fullAddress);

    }
}
