package ru.liptsoft.geosuggestions.model;

import ru.redcom.lib.integration.api.client.dadata.DaDataClient;
import ru.redcom.lib.integration.api.client.dadata.DaDataClientFactory;

public class DaDataRestService {

    private static DaDataRestService instance;

    private DaDataClient daDataClient;

    private DaDataRestService(String apiKey, String secretKey) {
        daDataClient = DaDataClientFactory.getInstance(apiKey, secretKey);
    }

    public static synchronized DaDataRestService getInstance(String apiKey, String secretKey) {
        if (instance == null) {
            instance = new DaDataRestService(apiKey, secretKey);
        }
        return instance;
    }

    public DaDataClient getDaDataClient() {
        return daDataClient;
    }
}
