package org.jahia.modules.imdbextension.graphql.provider;

import org.jahia.modules.graphql.provider.dxm.DXGraphQLExtensionsProvider;
import org.jahia.modules.imdbextension.graphql.extensions.GqlIMDBExtension;
import org.osgi.service.component.annotations.Component;

import java.util.Arrays;
import java.util.Collection;

@Component(immediate = true, service = DXGraphQLExtensionsProvider.class)
public class GqlIMDBProvider implements DXGraphQLExtensionsProvider {
    @Override
    public Collection<Class<?>> getExtensions() {
        return Arrays.<Class<?>>asList(GqlIMDBExtension.class);
    }
}
