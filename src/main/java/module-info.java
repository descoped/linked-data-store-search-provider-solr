import io.descoped.lds.api.search.SearchIndexProvider;
import io.descoped.lds.core.search.solr.SolrProvider;

module io.descoped.lds.search.provider.solr {
    requires io.descoped.lds.search.api;
    requires io.descoped.lds.persistence.api;
    requires solr.solrj;
    requires org.slf4j;
    requires io.reactivex.rxjava2;

    provides SearchIndexProvider with SolrProvider;
}
