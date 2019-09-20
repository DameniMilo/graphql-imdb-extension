package org.jahia.modules.graphqlimdbextension.api;

import graphql.annotations.annotationTypes.GraphQLTypeExtension;
import org.jahia.modules.graphqltmdbprovider.api.Movie;
import org.jahia.osgi.BundleUtils;

@GraphQLTypeExtension(Movie.class)
public class MovieExtension {
    private Movie movie;

    public MovieExtension(Movie movie) {
        this.movie = movie;
    }
}
