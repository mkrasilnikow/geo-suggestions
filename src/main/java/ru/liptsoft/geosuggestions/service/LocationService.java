package ru.liptsoft.geosuggestions.service;

import ru.redcom.lib.integration.api.client.dadata.dto.Address;

public interface LocationService<T> {

    T getAddress(String geoLocation);

}
