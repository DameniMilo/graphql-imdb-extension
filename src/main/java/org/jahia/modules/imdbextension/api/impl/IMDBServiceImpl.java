package org.jahia.modules.imdbextension.api.impl;

import org.jahia.modules.imdbextension.api.IMDBService;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true)
public class IMDBServiceImpl implements IMDBService {

    @Override
    public Double getMovieRating(String id) {
        return 7.7;
    }
}
