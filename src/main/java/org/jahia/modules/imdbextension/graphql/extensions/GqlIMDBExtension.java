package org.jahia.modules.imdbextension.graphql.extensions;

import graphql.annotations.annotationTypes.GraphQLDescription;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLTypeExtension;
import org.jahia.modules.imdbextension.api.IMDBService;
import org.jahia.modules.tmdbprovider.graphql.api.GqlMovie;
import org.jahia.osgi.BundleUtils;

@GraphQLTypeExtension(GqlMovie.class)
public class GqlIMDBExtension {
    private GqlMovie gqlMovie;
    private IMDBService imdbService;

    public GqlIMDBExtension(GqlMovie gqlMovie) {
        this.gqlMovie = gqlMovie;
        this.imdbService = BundleUtils.getOsgiService(IMDBService.class, null);
    }

    @GraphQLField
    @GraphQLDescription("Retrieve the list of actors of a movie")
    public Double getIMDBRating() {
        return imdbService.getMovieRating(gqlMovie.getTmdbMovie().imdb_id);
    }
}
