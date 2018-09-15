package com.experts.core.biller.statemachine.api.solr.solrrepo;

import com.experts.core.biller.statemachine.api.solr.domain.ElasticRequestDomain;
/*import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;*/
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
/*import starter.model.Director;
import starter.model.Movie;*/

import java.util.List;

/**
 * Created by Nasir on 12-09-2015.
 */
@Repository
public interface YmqRepository extends SolrCrudRepository<ElasticRequestDomain, Long> {

    List<ElasticRequestDomain> findByYmqTitle(String name);
   /* List<ElasticRequestDomain> findByRatingBetween(Double start, Double end);*/
    /*List<ElasticRequestDomain> findByDirector(Director director);*/
}