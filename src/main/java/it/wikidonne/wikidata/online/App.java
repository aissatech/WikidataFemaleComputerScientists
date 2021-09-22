package it.wikidonne.wikidata.online;

//https://github.com/eclipse/rdf4j
//import org.eclipse.rdf4j.query.resultio.sparqljson.SPARQLResultsJSONWriter;
//import org.eclipse.rdf4j.repository.RepositoryException;
//import org.eclipse.rdf4j.repository.sparql.SPARQLRepository;
//import java.util.Collections;

/**
 * Wikidata RDF4J SPARQL example
 */
public class App
{
    public static void main( String[] args )
    {
//        String sparqlEndpoint = "https://query.wikidata.org/sparql";
//        SPARQLRepository repo = new SPARQLRepository(sparqlEndpoint);
//
//        String userAgent = "Wikidata RDF4J Java Example/0.1 (https://query.wikidata.org/)";
//        repo.setAdditionalHttpHeaders( Collections.singletonMap("User-Agent", userAgent ) );
//
//        String querySelect = "SELECT DISTINCT ?item ?itemLabel ?pic ?p27Label ?p19Label ?p20Label ?linkcount WHERE {\n" +
//                "  ?item wdt:P21 wd:Q6581072 .                                                         #donna\n" +
//                "  ?item wdt:P31 wd:Q5 .                                                               #essere umano\n" +
//                "  ?item wdt:P18 ?pic .\n" +
//                "  ?item wdt:P106 ?occ .\n" +
//                "  VALUES ?occ {\n" +
//                "    wd:Q82594                                                                         #computer science\n" +
//                "    wd:Q5482740                                                                       #programmatrice \n" +
//                "    wd:Q327353                                                                        #sistemista \n" +
//                "    wd:Q1078262                                                                       #DBA\n" +
//                "    wd:Q627325                                                                        #grafica\n" +
//                "    wd:Q1709010                                                                       #ingegnera del software\n" +
//                "  }\n" +
//                "  FILTER NOT EXISTS {                                                                 #non ha voce in itwiki\n" +
//                "    ?wen schema:about ?item .\n" +
//                "    ?wen schema:isPartOf <https://it.wikipedia.org/> .\n" +
//                "  }\n" +
//                "  ?item wikibase:sitelinks ?linkcount .                                               #numero versioni linguistiche \n" +
//                "  FILTER (?linkcount > 3 ) .\n" +
//                "  OPTIONAL {?item wdt:P27 ?p27}\n" +
//                "  OPTIONAL {?item wdt:P19 ?p19}\n" +
//                "  OPTIONAL {?item wdt:P20 ?p20}\n" +
//                "  SERVICE wikibase:label { bd:serviceParam wikibase:language \"[AUTO_LANGUAGE],it\". }  #label in italiano\n" +
//                "}\n" +
//                "ORDER BY DESC(?linkcount) \n" +
//                "LIMIT 100";
//
//        try{
//            repo.getConnection().prepareTupleQuery(querySelect).evaluate(new SPARQLResultsJSONWriter(System.out));
//        } catch ( Exception exception ) {
//            exception.printStackTrace();
//        }

    }
}
