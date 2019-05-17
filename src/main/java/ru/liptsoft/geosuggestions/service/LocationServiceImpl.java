package ru.liptsoft.geosuggestions.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import ru.liptsoft.geosuggestions.model.DaDataRestService;
import ru.redcom.lib.integration.api.client.dadata.DaDataClient;
import ru.redcom.lib.integration.api.client.dadata.DaDataClientFactory;
import ru.redcom.lib.integration.api.client.dadata.dto.Address;

import javax.annotation.Resource;

@Service
public class LocationServiceImpl implements LocationService<Address> {

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.secretKey}")
    private String secretKey;

    @Override
    public Address getAddress(String geoLocation) {
        DaDataRestService daDataRestService = DaDataRestService.getInstance(apiKey,secretKey);
        return daDataRestService.getDaDataClient().cleanAddress(geoLocation);
    }
}
