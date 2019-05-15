package ru.liptsoft.geosuggestions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.liptsoft.geosuggestions.service.LocationServiceImpl;
import ru.redcom.lib.integration.api.client.dadata.DaDataClient;
import ru.redcom.lib.integration.api.client.dadata.DaDataClientFactory;
import ru.redcom.lib.integration.api.client.dadata.dto.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("suggest")
public class GeoSuggestionsController {

    @Autowired
    private LocationServiceImpl locationService;

    @PostMapping("/address")
    public Address getAddress(@RequestBody String location) {
        return locationService.getAddress(location);
    }

}
